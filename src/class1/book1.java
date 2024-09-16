package class1;

public class book1 {
    public String title;
    public String publisher;
    public int year;
    public book1(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }

    public static void main(String[] args) {
        book1 cheese = new book1("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());

        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);
    }
}
