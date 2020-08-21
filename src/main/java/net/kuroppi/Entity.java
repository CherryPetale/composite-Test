public class Entity {
    
    private final List<? extends Entity> children;

    Entity(List<? extends Entity> children){
        this.children = children;
    }

    public List<? extends Entity> getChildren(){
        return this.children;
    }
}