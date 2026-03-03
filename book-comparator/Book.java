/**
 * Book class with title, pages, and author.
 * Supports comparing two books by page count.
 */
public class Book {
    private String title;
    private int pages;
    private String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public int getPages() { return pages; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setPages(int pages) { this.pages = pages; }

    public String toString() {
        return title + " by " + author + " (" + pages + " pages)";
    }

    // returns 1 if this book has more pages, -1 if fewer, 0 if equal
    public int compareTo(Book other) {
        if (this.pages == other.pages) return 0;
        else if (this.pages < other.pages) return -1;
        else return 1;
    }
}
