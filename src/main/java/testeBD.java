import java.sql.*;

public class testeBD {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade", "root", "12345678");

            Statement stnt = con.createStatement();
            ResultSet rs = stnt.executeQuery("select publisherName from publisher");

            while (rs.next()) {
                System.out.println(rs.getString("publisherName"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
