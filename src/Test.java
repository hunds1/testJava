public class Test { /*
    public void test(){
        try {
            Document doc = Jsoup.connect("https://www.logobook.ru/").get();  //йоптыть

            Elements imgElements = doc.select("img");
            Elements aElements = doc.select("a");
            Elements divElements = doc.select("div.cl_l");

            divElements.forEach(divElement ->{
                String onclick = divElement.attr("onclick");
                String[] onclickSplit = onclick.split("\"");
                System.out.println("Ссылки на котегории книг: " + "https://www.logobook.ru/prod_show." + onclickSplit[1]);
            });

            aElements.forEach(aElement ->{
                String a = aElement.attr("href");
                System.out.println("Ссылка: " + a);
            });

            imgElements.forEach(imgElement ->{
                String onclick = imgElement.attr("src");
                if (onclick.contains("https://www."))
                    return;
                else
                    System.out.println("Картинка: " + "https://www.logobook.ru/"+onclick);
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}