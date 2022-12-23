import java.sql.*;

public class Database {
    private static Connection connection = null;
    private static String url = "jdbc:mysql://localhost:1433";
    private static String userName = "YanaP";
    private static String password = "12345";

    public static void base() {
        Statement statement = null;  //�������� �� ������ �������� ����� ����������� � ��
        ResultSet resultSet = null; //������������ ����� ����������
        String value = "";
        String sql = "";

        try {
            System.out.println("������������� ���������� � �����");
            connection = DriverManager.getConnection(url, userName, password);
            sql = "SELECT TOP (100) [�����]\n" +
                    "      ,[��������]\n" +
                    "      ,[������������]\n" +
                    "      ,[����]\n" +
                    "      ,[�������/�������]\n" +
                    "      ,[�������/������� ������]\n" +
                    "  FROM [dtbJava].[dbo].[books]";

            statement = connection.createStatement(); //������ ����������
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                value = resultSet.getString("�����");
                System.out.println(value);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            try {
                connection.close();
                System.out.println("������� ���������� � �����");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
