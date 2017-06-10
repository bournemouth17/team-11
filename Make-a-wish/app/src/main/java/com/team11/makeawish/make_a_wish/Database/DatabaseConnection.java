package com.team11.makeawish.make_a_wish;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import authentication.*;
import Volunteer.*;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import org.joda.time.DateTime;

public  class DatabaseConnection extends AppCompatActivity {

    private  static  final DatabaseConnection newDB = new DatabaseConnection();

    private Connection connection = null;

    /*private DatabaseConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:data.db");
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Database connection failed!", ex);
        }
    }*/
    public static void DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://hostname:3306/makeawish", "root", "");
        }catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Database connection failed!", ex);
        }
    }

    //CRUD Connection Functions for a Volunteer

    public void addVolunteer(Volunteer volunteer){
        ArrayList<Volunteer> volunteerArrayList = new ArrayList<Volunteer>();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(10);
            statement.executeUpdate("insert into 'Volunteer' set username = '" + Volunteer.getName() + "',phoneNo = '" + Volunteer.getContact() + "',location='" + Volunteer.getLocation() + "')");
            } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void editVolunteer(Volunteer volunteer) {
        if(customer.getId() <= 0) {
            return;
        }
        ArrayList<Volunteer> volunteerArrayList = new ArrayList<Volunteer>();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(10);
            statement.executeUpdate("update 'Volunteer' set username = '" + Volunteer.getName() + "',phoneNo = '" +  Volunteer.getContact() + "',location='" +Volunteer.getLocation() + "',phone = '" + customer.getPhoneNumber() + "' where customer_id = '" + Volunteer.getId() + "'");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void deleteVolunteer(Volunteer volunteer) {
        if(Volunteer.getId() <= 0) {
            return;
        }
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(10);
            statement.executeUpdate("delete from 'Volunteer' where customer_id ='" + Volunteer.getId() + "'");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public ArrayList<Volunteer> getVolunteers() {
        ArrayList<Volunteer> volunteerArrayList = new ArrayList<Volunteer>();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(10);
            ResultSet resultSet = statement.executeQuery("select * from 'Volunteer'");
            while(resultSet.next()){
                int id = resultSet.getInt("Volunteer_id");
                String username = resultSet.getString("username");
                String phoneNo = resultSet.getString("phoneNo");
                String location = resultSet.getString("location");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
        return volunteerArrayList;
    }

        public ArrayList<Volunteer> searchVolunteer(String query) {
            ArrayList<Volunteer> volunteerArrayList = new ArrayList<Volunteer>();
            Statement statement;
            try {
                statement = connection.createStatement();
                statement.setQueryTimeout(10);
                ResultSet resultSet = statement.executeQuery("select * from 'customer' where full_name like '%" + query + "%'");
                while(resultSet.next()){
                    int id = resultSet.getInt("Volunteer_id");
                    String username = resultSet.getString("username");
                    String phoneNo = resultSet.getString("phoneNo");
                    String location = resultSet.getString("location");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            return volunteerArrayList;
        }
}