package com.stackroute;

import java.sql.*;

public class SimpleJdbcDemo {

    private RowSetDemo rowSetDemo;

    public SimpleJdbcDemo() throws SQLException {
        rowSetDemo = new RowSetDemo();
        rowSetDemo.setUrl("jdbc:mysql://localhost:3306/test");
        rowSetDemo.setUserNameAndPassword("root", "root");
    }

    public void getEmployeeDetails() {
        try (ResultSet resultSet = rowSetDemo.setCommand("select * from employeetbl");) {
            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2) +
                        " Age: " + resultSet.getString(3) + " Gender: " + resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /*Print ResultSet in reverse order*/
    public void getEmployeeDetailsInReverse() throws SQLException {
        rowSetDemo.setCommand("select * from employeetbl");
//        try (ResultSet resultSet = rowSetDemo.setCommand("select * from employeetbl");) {
//            resultSet.afterLast();
//            while (resultSet.previous()) {
//                System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2) +
//                        " Age: " + resultSet.getString(3) + " Gender: " + resultSet.getString(4));
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    /*Move ResultSet to second row and print in reverse order*/
//    public void getEmployeeDetailsFromSecondRowInReverse() {
//        try (ResultSet resultSet = rowSetDemo.setCommand("select * from employeetbl ORDER BY id DESC");) {
//            resultSet.last();
//            int numberOfRows = resultSet.getRow();
//            resultSet.beforeFirst();
//            for(int i=0; i<numberOfRows-1; i++) {
//                if (resultSet.next()) {
//                    System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2) +
//                        " Age: " + resultSet.getString(3) + " Gender: " + resultSet.getString(4));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    //Use PreparedStatement to display by name and gender
//    public void getEmployeeDetailsByNameAndGender(String name,String gender) throws SQLException {
//        String sqlStatement = "select * from employeetbl where name='" + name + "' and gender='" + gender + "'";
//        try (ResultSet resultSet = rowSetDemo.setCommand(sqlStatement)) {
//            while (resultSet.next()) {
//                System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2) +
//                        " Age: " + resultSet.getString(3) + " Gender: " + resultSet.getString(4));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}