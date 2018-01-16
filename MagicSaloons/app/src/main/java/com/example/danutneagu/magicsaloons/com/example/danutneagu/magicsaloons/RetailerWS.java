package com.example.danutneagu.magicsaloons.com.example.danutneagu.magicsaloons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Danut Neagu on 1/8/2018.
 * JDBC TEST
 */

public class RetailerWS {
    public String customerData() {
        String customerInfo = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc;mysql://localhost:3306","root","test1234");
            //
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM customers WHERE C_ID = (SELECT MAX(C_ID) FROM customers)");
            ResultSet result = statement.executeQuery();

            while(result.next()) {
                customerInfo = customerInfo + result.getString("name") + "&"+ result.getString("C_ID") + "&"+ result.getString("address") +
                        "&"+result.getString("email");
            }
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return customerInfo;
    }

}
