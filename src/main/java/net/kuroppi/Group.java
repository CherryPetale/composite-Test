import java.util.ArrayList;

public class Group implements IEntity{

    private final String Name;

    private ArrayList<User> users = new ArrayList<User>();

    Group(String Name){
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }

    public void AddUser(User user){
        users.add(user);
    }
}