package ua.hillel.lessons.lesson4.forEachExample;

public class Main {
    public static void main(String[] args) {
        // оголошення одновимірного масиву типу Book
        Book B[];

// виділити пам'ять для масиву з 4 посилань на тип Book
        B = new Book[4];

// видідити пам'ять для кожного елементу масиву типу Book
        for (int i=0; i<B.length; i++)
            B[i] = new Book();

// заповнити масив значеннями
        B[0].title = "Book-1";
        B[0].author = "Author-1";
        B[0].price = 205.78f;
        B[0].year = 2008;

        B[1].title = "Book-2";
        B[1].author = "Author-2";
        B[1].price = 99.00f;
        B[1].year = 2010;

        B[2].title = "Book-3";
        B[2].author = "Author-3";
        B[2].price = 0.99f;
        B[2].year = 2011;

        B[3].title = "Book-4";
        B[3].author = "Author-4";
        B[3].price = 100.01f;
        B[3].year = 2012;

// розширений цикл for
// пошук книг 2011, 2012 років
        for (Book book : B)
            if ((book.year==2011)||(book.year==2008))
                System.out.println("Book: " + book.title + ", " + book.author);
    }
}
