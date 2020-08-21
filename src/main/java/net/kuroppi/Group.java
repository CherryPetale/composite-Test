import java.util.ArrayList;
import java.util.List;

public class Group extends IEntity{

    private final String Name;

    Group(String Name, final List<? extends Entity> list){
        super(list);
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }
}