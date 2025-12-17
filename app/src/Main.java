import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://db:5432/emvdb";
        String user = "admin";
        String password = "admin";

        try {
            // 🔑 REGISTRAR EL DRIVER JDBC
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexión a PostgreSQL establecida!!!");

            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS test (id SERIAL PRIMARY KEY, name TEXT)");
            stmt.execute("INSERT INTO test (name) VALUES ('Hola EMV')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM test");
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                                " | Name: " + rs.getString("name"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("❌ Error de conexión");
            e.printStackTrace();
        }
    }
}
