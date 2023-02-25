package Home_Work2;

public interface Interactive {
    default public void toInteract(Human h, Animal a){
        if (a.kind.equals("Cat")) {
            System.out.println("mmrrrrrrrrr");
        }
    }
    default public void toInteract(Human h, Closet c){
        if (c.getState() == Closet.State.Close){
            c.setState(Closet.State.Open);
        }
        else c.setState(Closet.State.Close);
    }
}
