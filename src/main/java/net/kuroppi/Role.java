import java.util.List;

public class Role {
    
    private final List<Entity> members;

    Role(List<Entity> members){
        this.members = members;
    }

    public List<Entity> getMembers(){
        return this.members;
    }
}