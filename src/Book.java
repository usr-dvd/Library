public class Book {
    private String bookName, Author, releaseDate;
    private boolean isBestseller;
    private int numberOfCopies;

    public String getBookName(){
        return this.bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setBestseller(boolean bestseller) {
        this.isBestseller = bestseller;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
