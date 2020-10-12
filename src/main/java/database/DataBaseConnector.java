package database;

import com.google.common.collect.ImmutableMap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

public class DataBaseConnector{

    private final static Logger LOGGER = Logger.getLogger("DataBaseConnector");

    private ImmutableMap<Integer, ArrayList<String>> CONNECTIONS_MAP = ImmutableMap.of(
            1, new ArrayList<String>(Arrays.asList("jdbc:mysql://localhost:3306/christien_sync_db", "christien","Christien46"))
    );

    public Connection getConnection(DBConnection dbConnection){
        Integer key = dbConnection.getReference();
        List<String> components = CONNECTIONS_MAP.get(key);
        String driver = "com.mysql.jdbc.Driver";

        String url = components.get(0);
        String username = components.get(1);
        String password = components.get(2);
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.info(String.format("Unable to establish connection for specs: %s, %s ,%s", url, username, password));
        }

        return null;

    }

}
