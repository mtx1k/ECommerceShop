package dci.j24e01.ECommerceShop.services;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class MySqlConnectionManagerImpl implements DBConnectionManager {
    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ECommerceShop", "root", "19041987");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
