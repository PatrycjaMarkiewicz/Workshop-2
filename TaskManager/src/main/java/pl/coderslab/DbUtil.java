package pl.coderslab;

import java.sql.*;

public class DbUtil {
    private static final String DB_URL_TEMPLATE="jdbc:mysql://localhost:3306/%s?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    // private static final String DB_URL=String.format(DB_URL_TEMPLATE,"cinemas_ex");
    private static final String DB_URL=getDbUrl("cienemas_ex");
    private static final String DB_USER="root";
    private static final String DB_PASS= "coderslab";

    public static Connection connect(final String dbName) throws SQLException {
        return DriverManager.getConnection(getDbUrl(dbName),DB_USER,DB_PASS);
    }
    private static String getDbUrl(final String name){
        return String.format(DB_URL_TEMPLATE, name);
    }
}
