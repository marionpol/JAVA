package Groups.moveable;


import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Movable> movables;

    public Group() {
        movables = new ArrayList<Movable>();
    }

    public String toString(){
        return movables.toString();
    }

    public void addToGroup(Movable movables){
        this.movables.add(movables);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

}
