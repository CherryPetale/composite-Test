import javax.lang.model.element.Name;

public class User implements IEntity{
    
    private final String Name;

    User(String Name){
        super(null);
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }
}