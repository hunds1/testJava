import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class JsoupBook {
    private static String finalName = "cover_png"; //путь к папе
    private static FileOutputStream out = null;
    private static BufferedInputStream buff = null; // входящий/качает все пачкой
    private static String str = "";
    public static void SearchURL(){
        try {
            String webURL = "https://www.logobook.ru";
            String imgURL = "https://www.logobook.ru/collection.php?col=103&am=4";

            Document doc = Jsoup.connect(imgURL).get();  //йоптыть
            Elements imgElements = doc.select("img");

            for (Element imgElement : imgElements) {
                String onclick = imgElement.attr("src");
                if (onclick.contains("make_nimage.php?uid=")) {
                    //System.out.println("URL_PNG: " + "https://www.logobook.ru/" + onclick);
                    str = "https://www.logobook.ru/" + onclick;
                }
                PrintWriter writer =
                        new PrintWriter(new BufferedWriter(new FileWriter("cover_png/url_img.txt", true)));
                writer.println(str);
                writer.flush();
                writer.close();
            }

        } catch (Exception n) {
            n.printStackTrace();
        }
    }
}


 /*
           // выводит какие-то ссыллочки НЕ в сибирь

            Elements aElements = doc.select("a");
            Elements divElements = doc.select("div.cl_l");

            divElements.forEach(divElement ->{
                String onclick = divElement.attr("onclick");
                String[] onclickSplit = onclick.split("\"");
                System.out.println("HREFBOOK:  " + "https://www.logobook.ru/prod_show." + onclickSplit[1]);
            });

            Elements divElements = doc.select("div.cl_l");
            divElements.forEach(divElement ->{
                String onclick = divElement.attr("onclick");
                String[] onclickSplit = onclick.split("\"");
                System.out.println("HREFBOOK:  " + "https://www.logobook.ru/prod_show." + onclickSplit[1]);
            });
            aElements.forEach(aElement ->{
                String a = aElement.attr("href");
                System.out.println("HREF: " + a);
            });

        //говно
          try {
                //считываем данные
                buff = new BufferedInputStream(new URL(str).openStream());
                out = new FileOutputStream(finalName); //сюда данные
                byte[] data = new byte[1024]; // за раз считывается до 1024 битов
                int count;
                while ((count = buff.read(data, 0, 1024)) != -1){
                    out.write(data, 0, count);
                    out.flush(); // очищает из буфера
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally { // закрываем всякие дырочки
                try {
                    buff.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    try {
                        out.close();
                        System.out.println("OAOAO");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
*/