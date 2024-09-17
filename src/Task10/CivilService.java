package Task10;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(int initialDays) {
        daysLeft = initialDays;
    }

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
