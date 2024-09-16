package ex4;

public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int brickWeight = 1;
        for (int i = 0; i < 100; i++) {
            Suitcase suitcase = new Suitcase(brickWeight);
            suitcase.addThing(new Thing("Brick " + i, brickWeight));
            container.addSuitcase(suitcase);
            brickWeight++;
        }
    }
}

