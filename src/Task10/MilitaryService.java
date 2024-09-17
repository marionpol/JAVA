package Task10;

public class MilitaryService implements NationalService{
    private int daysLeft;

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
