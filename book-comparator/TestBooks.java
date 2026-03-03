/**
 * Tests the Book class — compares two books by page count
 * and computes the average number of pages.
 */
public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book("The Only Investment Guide You'll Ever Need", 120, "Andrew Tobias");
        Book book2 = new Book("Rich Dad Poor Dad", 200, "Robert Kiyosaki and Sharon Lechter");

        if (book1.compareTo(book2) == 1) {
            System.out.println(book1.getTitle() + " has more pages than " + book2.getTitle());
        } else if (book1.compareTo(book2) == 0) {
            System.out.println(book1.getTitle() + " has equal number of pages as " + book2.getTitle());
        } else {
            System.out.println(book1.getTitle() + " has fewer pages than " + book2.getTitle());
        }

        System.out.println("Average number of pages: " + (book1.getPages() + book2.getPages()) / 2);
    }
}
