public abstract class Book {
    private String title; //название
    private String publishing ; // издательство
    private String price; //цена

    public Book(String title, String publishing, String price){
        this.title = title;
        this.publishing = publishing;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getPublishing() {
        return publishing;
    }
    public String getPrice() {
        return price;
    }
}
