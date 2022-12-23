import java.util.ArrayList;

public class Textbooks extends Book {
    private String rating; // рейтинг
    private String subject;  //предмет

    public Textbooks(String title, String publishing, String price, String rating, String subject){
        super(title, publishing, price);
        this.rating = rating;
        this.subject = subject;
    }
    public String getRating() {
        return rating;
    }
    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Учебник " + getTitle() + "с рейтингом " + getRating() +
                "от издательства " + getPublishing() + " всего за " + getPrice() +
                "по предмету - " + getSubject();
    }

    //самый популярный учебник
    public static String MostPopularTextbook() {
        ArrayList<Book> books = new ArrayList<Book>();
        try {
            var textBook = books.stream().filter(x -> x instanceof Textbooks).map(x -> (Textbooks) x).toList();
            var title = "";

            for (var textBooks : textBook) {
                if (textBooks.getRating() == "5") {
                    title = textBooks.getTitle();
                }
            }
           return title;
        } catch (Exception e) {
            throw new IllegalArgumentException("Некорректные данне");
        }
    }
}







