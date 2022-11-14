import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("yana", "pavlova", "xnj-nj", 15);
        worker.addResponsibilities("учить джаву");
        worker.addResponsibilities("учить питон");
        worker.getResponsibilities().forEach(System.out::println);

    }
}