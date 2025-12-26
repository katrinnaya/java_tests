class BookNotAvailableException extends Exception {
    private String bookTitle;
    private String borrower;
    
    public BookNotAvailableException(String bookTitle, String borrower) {
        super("Book '" + bookTitle + "' is borrowed by " + borrower); // конструктор родителя
        this.bookTitle = bookTitle;
        this.borrower = borrower;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    public String getBorrower() {
        return borrower;
    }
}

class InvalidBookDataException extends RuntimeException {
    public InvalidBookDataException(String message) {
        super(message); // конструктор родителя
    }
}
