import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    public static void readBook() { // считывает файл
        String path = "books.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) { // пока файл не пустой счтываем его
                String[] values = line.split(";");
                System.out.println("book: " + values[0]);
                System.out.println("title: " + values[1]);
                if (values[0].equals("учебник")) {
                    System.out.println("rating: " + values[6]);
                    System.out.println("subject: " + values[7]);
                } else{
                    System.out.println("cover: " + values[4]);
                    System.out.println("ageAuthor: " + values[5]);
                }
                System.out.println("publishing: " + values[2]);
                System.out.println("price: " + values[3]);
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Book> addBook() { // добавляет файл
        String path = "books.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            var books = new ArrayList<Book>();
            while ((line = br.readLine()) != null) { // пока файл не пустой счтываем его
                String[] agr = line.split(";");

                if(agr[0] == "учебник") {
                    Textbooks tb = new Textbooks(agr[1], agr[6], agr[2], agr[3], agr[7]);
                    books.add(tb);
                } else {
                    ChildrenBooks cb = new ChildrenBooks(agr[1], agr[4], agr[2], agr[3], agr[5]);
                    books.add(cb);
                }
            }
            return books;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
