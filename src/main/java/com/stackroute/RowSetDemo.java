package com.stackroute;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RowSetDemo {

    RowSet rowSet;
    public RowSetDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void setUrl(String url) throws SQLException {
        rowSet.setUrl(url);
    }

    public void setUserNameAndPassword(String userName, String password) throws SQLException {
        rowSet.setUsername(userName);
        rowSet.setPassword(password);
    }

    public ResultSet setCommand(String command) throws SQLException {
        rowSet.setCommand(command);
        rowSet.execute();
        return rowSet;
    }

    public String getUrl() throws SQLException {
        return rowSet.getUrl();
    }
}
