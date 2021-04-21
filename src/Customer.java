public class Customer {
    private String firstName, lastName;
    private Book[] ListOfBorrowed = new Book[100];
    private int maxBorrow;
    private boolean isSubscriptionIsValid, canBorrow;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMaxBorrow() {
        return maxBorrow;
    }

    public boolean getIsSubscriptionIsValid() {
        return isSubscriptionIsValid;
    }

    public Customer(String firstName, String lastName, int maxBorrow, boolean isSubscriptionIsValid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxBorrow = maxBorrow;
        this.isSubscriptionIsValid = isSubscriptionIsValid;


    }


    public boolean canBorrow(Book book) {
        if (!isSubscriptionIsValid) {
            System.out.println("Your Subscription is out of date!");
            return false;
        }
        else if (ListOfBorrowed.length >= maxBorrow){
            System.out.println("Your have been borrowed maximum number of books");
            return false;
        } else if (book.getNumberOfCopies() < 1) {
            System.out.println("we don't have enough copies of this book");
            return false;
        }
        System.out.println("You can borrow this book");
        return true;
    }


}
