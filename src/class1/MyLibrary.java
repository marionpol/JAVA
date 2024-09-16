package class1;

import java.util.ArrayList;
import java.util.List;

public class MyLibrary {
    public static List<book1> books;

    public MyLibrary() {
        books = new ArrayList<book1>();
    }

    public static void addBook(book1 newBook) {
        books.add(newBook);
    }

    public static ArrayList<book1> searchByTitle(String title) {
        ArrayList<book1> found = new ArrayList<book1>();

        for (book1 book : books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }

        return found;
    }


        public static ArrayList<book1> searchByPublisher(String publisher) {
            ArrayList<book1> found = new ArrayList<book1>();

            for (book1 book : books) {
                if (book.publisher().equalsIgnoreCase(publisher)) {
                    found.add(book);
                }

            }
            return found;
        }



    public static ArrayList<book1> searchByYear(String year) {
        ArrayList<book1> found = new ArrayList<book1>();

        for (book1 book : books) {
            if (book.year() == Integer.parseInt(year)) {
                found.add(book);
            }

        }
        return found;
    }



    public static void printBooks() {
        for (book1 book : books) {
            System.out.println(book);
        }

    }



    public static void main(String[] args) {
        MyLibrary MyLibrary = new MyLibrary();

        book1 cheese = new book1("Cheese Problems Solved", "Woodhead Publishing", 2007);
        MyLibrary.addBook(cheese);
        book1 nhl = new book1("NHL Hockey", "Stanley Kupp", 1952);
        MyLibrary.addBook(nhl);
        MyLibrary.addBook(new book1("Battle Axes", "Tom A. Hawk", 1851));
        MyLibrary.addBook(new book1("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));

        System.out.println("---");

        for (book1 book: MyLibrary.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (book1 book: MyLibrary.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }

    }

}
