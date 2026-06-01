/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admingui;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;


/**
 *
 * @author MSI_GS
 */
public class accountp extends javax.swing.JPanel {
    private static final String url =
            "jdbc:sqlite:" + System.getProperty("user.dir") + "/parc.db";

    Connection con;

    
public void getEmployeeInformationImen() {
    
          
    String sql = "SELECT * FROM employe WHERE username='imen'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }

    try {

        con = DriverManager.getConnection(url);

    } catch (SQLException e) {

        e.printStackTrace();
    }
    
    
}

        
    public void getEmployeeInformationAbdou() {
   
          
    String sql = "SELECT * FROM employe WHERE username='abdou'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}

    




  public void getEmployeeInformationRanim() {
    
          
    String sql = "SELECT * FROM employe WHERE username='ranim'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}
    
  public void getEmployeeInformationTaki() {
    
          
    String sql = "SELECT * FROM employe WHERE username='taki'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}
  public void getEmployeeInformationOumaima() {
    
          
    String sql = "SELECT * FROM employe WHERE username='oumaima'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}
  
  public void getEmployeeInformationAmine() {
    
          
    String sql = "SELECT * FROM employe WHERE username='amn'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}
  
  public void getEmployeeInformationJalil() {
    
          
    String sql = "SELECT * FROM employe WHERE username='jalil'";
    try (
            Connection conn = DriverManager.getConnection(url);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    ) {
        if (rs.next()) {
            String phoneNumber = rs.getString("phonenumber");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            Date dateOfBirth = rs.getDate("Date Naissance Emp");
            Date dateOfHire = rs.getDate("Date Embauche Emp");
            String firstName = rs.getString("PrenomEmp");
           String lastName = rs.getString("NomEmp");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String birthDateStr = dateFormat.format(dateOfBirth);
                String hireDateStr = dateFormat.format(dateOfHire);
       
        jLabel12.setText(username);
        jLabel9.setText(password);
        jLabel10.setText(email);
        jLabel11.setText(phoneNumber);
        jLabel15.setText(birthDateStr);
        jLabel20.setText(hireDateStr);
        jLabel18.setText(firstName);
        jLabel21.setText(lastName);
        
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
    
}
  private void setCurrentUser(String username) {
        switch (username) {
            case "imen":
                getEmployeeInformationImen();
                break;
            case "abdou":
                getEmployeeInformationAbdou();
                break;
            case "ranim":
                getEmployeeInformationRanim();
                break;
                case "taki":
                    getEmployeeInformationTaki();
                    break;
                case "amn":
                     getEmployeeInformationAmine();
                     break;
                     case"jalil":
                         getEmployeeInformationJalil();
            
            default:
                // Handle case where user is not recognized
                break;
        }
    }
  
  public void oo(){
      
  }

    /**
     * Creates new form accountp
     */
    public accountp() {
        initComponents();
       
       
        setCurrentUser("taki");
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Password");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (2).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Phone number");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("E-mail");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone-call (2).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Birth date");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar (1).png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Fullname");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/time.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Hire date");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/id-card.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel13)))
                            .addComponent(jLabel19))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel22))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
