package com.stackroute;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
//        System.out.println();
//        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
//        System.out.println();
//        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("A", "female");
    }
}
