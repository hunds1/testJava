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
        try {

            return String.format("");
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
