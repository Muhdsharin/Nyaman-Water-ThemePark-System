package nyamanwaterthemepark2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

  
public class CustomerDB {

    private static final String URL = "jdbc:mysql://localhost:3306/customerdb"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "Sharin11"; 

  
    public static ArrayList<Customer> readAll() throws SQLException {
        ArrayList<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM new_table";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                String FullName = resultSet.getString("FullName");
                String ContactNum = resultSet.getString("ContactNum");
                String ChargeRate = resultSet.getString("ChargeRate");
                int NumAdults = resultSet.getInt("NumAdults");
                int NumChildren = resultSet.getInt("NumChildren");
                int NumSenior = resultSet.getInt("NumSenior");
                double Discount = resultSet.getDouble("Discount");
                double TotalPrice = resultSet.getDouble("TotalPrice");

                Customer customer = new Customer(FullName, ContactNum, ChargeRate, NumAdults, NumChildren, NumSenior, Discount, TotalPrice);
                customerList.add(customer);
            }
        }
        return customerList;
    }

   
    public static Customer searchByName(String nameTarget) throws SQLException {
        Customer customer = null;
        String sql = "SELECT * FROM new_table WHERE FullName = ?";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
             
            stmt.setString(1, nameTarget);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    String FullName = resultSet.getString("FullName");
                    String ContactNum = resultSet.getString("ContactNum");
                    String ChargeRate = resultSet.getString("ChargeRate");
                    int NumAdults = resultSet.getInt("NumAdults");
                    int NumChildren = resultSet.getInt("NumChildren");
                    int NumSenior = resultSet.getInt("NumSenior");
                    double Discount = resultSet.getDouble("Discount");
                    double TotalPrice = resultSet.getDouble("TotalPrice");

                    customer = new Customer(FullName, ContactNum, ChargeRate, NumAdults, NumChildren, NumSenior, Discount, TotalPrice);
                }
            }
        }
        return customer;
    }

  
    public static void addRecord(Customer customer) throws SQLException {
        String sql = "INSERT INTO new_table (FullName, ContactNum, ChargeRate, NumAdults, NumChildren, NumSenior, Discount, TotalPrice) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
             
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getContact());
            stmt.setString(3, customer.getRateType());
            stmt.setInt(4, customer.getNumAdults());
            stmt.setInt(5, customer.getNumChildren());
            stmt.setInt(6, customer.getNumSeniors());
            stmt.setDouble(7, customer.getDiscount());
            stmt.setDouble(8, customer.getTotalCharge());

            int count = stmt.executeUpdate();
            System.out.println("Number of customers added: " + count);
        }
    }

public static int deleteCustomer(int contactNo) throws SQLException {
    String sql = "DELETE FROM new_table WHERE ContactNum = ?";  
    
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, contactNo);  
        return stmt.executeUpdate();  
    }
}

   
    public static int updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE new_table SET ContactNum = ?, ChargeRate = ?, NumAdults = ?, NumChildren = ?, NumSenior = ?, Discount = ?, TotalPrice = ? WHERE FullName = ?";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
             
            stmt.setString(1, customer.getContact());
            stmt.setString(2, customer.getRateType());
            stmt.setInt(3, customer.getNumAdults());
            stmt.setInt(4, customer.getNumChildren());
            stmt.setInt(5, customer.getNumSeniors());
            stmt.setDouble(6, customer.getDiscount());
            stmt.setDouble(7, customer.getTotalCharge());
            stmt.setString(8, customer.getName());

            return stmt.executeUpdate();
        }
    }
    
    
}
