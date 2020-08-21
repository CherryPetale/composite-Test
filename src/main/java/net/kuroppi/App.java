package net.kuroppi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserFactory userFactory = UserFactory.getInstance();

        User userA = userFactory.get("A");
        User userB = userFactory.get("B");

        Group groupA = new Group("group-A", Arrays.asList(userA, userB));
        Group groupB = new Group("group-B", Arrays.asList(userFactory.get("A")));

        User userAA = UserFactory.getInstance().get("A");

        Role roleA = new Role(Arrays.asList(userA, groupA));

        for (Entity entity : roleA.getMembers()) {
            System.out.println(entity);
        }
    }
}
