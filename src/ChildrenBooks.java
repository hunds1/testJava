public class ChildrenBooks extends Book {
    private String cover; // обложка
    private String ageAuthor; // возраст автора

    public ChildrenBooks(String title, String publishing, String price, String cover, String age){
        super(title, publishing, price);
        this.cover = cover;
        this.ageAuthor = age;
    }
    public String getCover() {
        return cover;
    }
    public String getAgeAuthor() {
        return ageAuthor;
    }

    @Override
    public String toString() {
        return "Детская книга " + getTitle() + "в " + cover + "обложке" +
                "от издательства " + getPublishing() + " всего за " + getPrice() +
                "написанная автором в возрасте " + ageAuthor;
    }

    // самый младший автор написавший книгу
    public static String YoungestAuthor() {
        try {

            return "";

        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
