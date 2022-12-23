import java.sql.*;

public class Database {
    private static Connection connection = null;
    private static String url = "jdbc:mysql://localhost:1433";
    private static String userName = "YanaP";
    private static String password = "12345";

    public static void base() {
        Statement statement = null;  //отвечает за выполн запросов после подключения к бд
        ResultSet resultSet = null; //обрабатывает получ результаты
        String value = "";
        String sql = "";

        try {
            System.out.println("Устанавливаем соединение с базой");
            connection = DriverManager.getConnection(url, userName, password);
            sql = "SELECT TOP (100) [книги]\n" +
                    "      ,[навзание]\n" +
                    "      ,[издательство]\n" +
                    "      ,[цена]\n" +
                    "      ,[рейтинг/обложка]\n" +
                    "      ,[предмет/возраст автора]\n" +
                    "  FROM [dtbJava].[dbo].[books]";

            statement = connection.createStatement(); //задаем соединение
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                value = resultSet.getString("книги");
                System.out.println(value);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            try {
                connection.close();
                System.out.println("закрыли соединение с базой");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
