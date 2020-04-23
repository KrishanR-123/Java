package com.company;

/*
To implement JDBC:
1) Import the package --> import.sql.*
2) Load and Register drivers --> a. Load -> com.mysql.jdbc.driver
                                 b. Register -> forName("com.mysql.cj.jdbc.Driver")
3)Establish Connection
4)Create the statement
5)Execute the query
6)Process the Result
7)close
*/


import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3308/collegedata";
        String uname = "root";
        String pass = "root";
        String query = "select Name fROM student WHERE Year=2;";
	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(query);

        while(rs.next())
        {
            String name = rs.getString("Name");
            System.out.println(name);
        }
       st.close();
       con.close();

    }
}
