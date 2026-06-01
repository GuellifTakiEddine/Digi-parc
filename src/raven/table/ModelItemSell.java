package raven.table;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Date;

public class ModelItemSell {
    private int idEmp;
    private String nomEmp;
    private String prenomEmp;
    private String dateNaissanceEmp;
    private String dateEmbaucheEmp;
    private String email;
    private String phonenumber;
    private String username;
    private String password;

    public ModelItemSell(int idEmp, String nomEmp, String prenomEmp, String dateNaissanceEmp,
                         String dateEmbaucheEmp, String email, String phonenumber,
                         String username, String password) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.prenomEmp = prenomEmp;
        this.dateNaissanceEmp = dateNaissanceEmp;
        this.dateEmbaucheEmp = dateEmbaucheEmp;
        this.email = email;
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
    }

    public ModelItemSell() {
    }

    public Object[] toTableRow() {
        return new Object[]{idEmp, nomEmp, prenomEmp, dateNaissanceEmp, dateEmbaucheEmp, email, phonenumber, username, password};
    }
    
    public static DefaultTableModel getModelFromDatabase() {
        String url ="jdbc:mysql://localhost:3306/parc";
        String user= "root";
        String pass ="123456";
        String sql = "SELECT * FROM employé";
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Lastname");
        model.addColumn("Firstname");
        model.addColumn("Birthdate");
        model.addColumn("Hire date");
        model.addColumn("Email");
        model.addColumn("Phone number");
        model.addColumn("Username");
        model.addColumn("Password");

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet tt = stmt.executeQuery()) {

            while (tt.next()) {
                int idEmp = tt.getInt("IdEmp");
                String nomEmp = tt.getString("NomEmp");
                String prenomEmp = tt.getString("PrénomEmp");
                String dateNaissanceEmp = tt.getString("Date Naissance Emp");
                String dateEmbaucheEmp = tt.getString("Date Embauche Emp");
                String email = tt.getString("email");
                String phonenumber = tt.getString("phonenumber");
                String username = tt.getString("username");
                String password = tt.getString("password");

                ModelItemSell item = new ModelItemSell(idEmp, nomEmp, prenomEmp, dateNaissanceEmp, 
                                                       dateEmbaucheEmp, email, phonenumber, 
                                                       username, password);
                model.addRow(item.toTableRow());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
