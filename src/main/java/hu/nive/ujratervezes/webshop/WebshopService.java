package hu.nive.ujratervezes.webshop;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WebshopService {
    public WebshopService(MariaDbDataSource dataSource) {

    }

    public List<String> getValuableCustomers() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/test?useUnicode=true");
            dataSource.setUser("test");
            dataSource.setPassword("test");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();


        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT customer_name FROM orders WHERE total > 1000  ORDER BY customer_name;")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("customer_name");
                names.add(name);
            }
            return names;


        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by select customer names", sqle);
        }
    }
}
