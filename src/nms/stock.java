/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nms;

import static connection.connect_database.connection_string;
import static connection.connect_database.database_password;
import static connection.connect_database.database_username;
import static connection.connect_database.driver_name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amprojects
 */
public class stock extends javax.swing.JFrame {
int stid=0;
int tstid=0;
String pid="";
    /**
     * Creates new form stock
     */
    public stock() {
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        date_time.setText(dateFormat.format(date));
        getid();
        getplants();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        rate = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        stock_id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        plant_id = new javax.swing.JComboBox();
        total = new javax.swing.JTextField();
        date_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Rate");

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Stock Info");

        jLabel6.setText("Total Amount");

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Stock ID");

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Plant Name");

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        plant_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant_idActionPerformed(evt);
            }
        });

        date_time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        date_time.setText("00/00/0000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(date_time, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(stock_id)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(rate)
                            .addComponent(jLabel5)
                            .addComponent(quantity)
                            .addComponent(jLabel6)
                            .addComponent(plant_id, 0, 280, Short.MAX_VALUE)
                            .addComponent(total)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(date_time))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plant_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plant_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant_idActionPerformed
        // TODO add your handling code here:
        try
        {
            String pname=String.valueOf(plant_id.getSelectedItem());
            int l=pname.length();
            System.out.println(l);
            pid="";
            for(int i=0;i<l;i++)
            {
                char ch=pname.charAt(i);
                if(ch==' ')
                {
                   break; 
                }
                else
                {
                   pid=pid+ch; 
                }
            }
            
            System.out.println(pid);
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from plants where plant_id="+pid+"");
       ResultSet rs=pst.executeQuery();
       if(rs.next())
       {
          rate.setText(rs.getString(3));
       }
       else
       {
          //jOptionPane1.showMessageDialog(null,"Unable to get Plant Price"); 
       }
            
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_plant_idActionPerformed

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        // TODO add your handling code here:
        double r=Double.parseDouble(rate.getText());
        double q=Double.parseDouble(quantity.getText());
        double total1=r*q;
        total.setText(String.valueOf(total1));
        
    }//GEN-LAST:event_quantityKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(stock_id.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Plant ID not found"); 
            }
            else if(plant_id.getSelectedItem().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select Plant Name");  
            }
            else if(rate.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select rate");   
            }
            else if(quantity.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select Plant quantity");   
            }
            else if(total.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Toata amount not found");  
            }
            else
            {
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("insert into stock values("+stid+","+pid+",'"+date_time.getText()+"','"+rate.getText()+"','"+quantity.getText()+"','"+total.getText()+"')");
       int i=pst.executeUpdate();
       if(i>0)
       {
          jOptionPane1.showMessageDialog(null,"stock add successfully");
          clear_data();
       }
       else
       {
         jOptionPane1.showMessageDialog(null,"stock add failed");  
       }
            }
        }
        catch(Exception ex)
        {
           jOptionPane1.showMessageDialog(null,ex); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        quantity.setText("");
        total.setText("");
        getid();
        getplants();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        date_time.setText(dateFormat.format(date));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
            PreparedStatement pst=con.prepareStatement("select * from stock where stock_id="+search.getText()+"");
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                date_time.setText(rs.getString(3));
                stock_id.setText(rs.getString(1));
                rate.setText(rs.getString(4));
                quantity.setText(rs.getString(5));
                total.setText(rs.getString(6));
                
                 PreparedStatement pst1=con.prepareStatement("select * from plants where plant_id="+rs.getString(2)+"");
                 ResultSet rs1=pst1.executeQuery();
                 plant_id.removeAllItems();
                 rs1.next();
                 plant_id.addItem(rs.getString(2)+" "+rs1.getString(2));
                 getplants();
                 
                
            }
            else
            {
                jOptionPane1.showMessageDialog(null,"No record found !"); 
            }

        }
        catch(Exception ex)
        {
           jOptionPane1.showMessageDialog(null,ex);  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(stock_id.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Plant ID not found"); 
            }
            else if(plant_id.getSelectedItem().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select Plant Name");  
            }
            else if(rate.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select rate");   
            }
            else if(quantity.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please select Plant quantity");   
            }
            else if(total.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Toata amount not found");  
            }
            else
            {
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("update stock set plant_id="+pid+",stock_date='"+date_time.getText()+"',stock_rate='"+rate.getText()+"',stock_quantity='"+quantity.getText()+"',total_amt='"+total.getText()+"' where stock_id="+stock_id.getText()+"");
       int i=pst.executeUpdate();
       if(i>0)
       {
          jOptionPane1.showMessageDialog(null,"stock update successfully");
          clear_data();
       }
       else
       {
         jOptionPane1.showMessageDialog(null,"stock update failed");  
       }
            }
        }
        catch(Exception ex)
        {
           jOptionPane1.showMessageDialog(null,ex); 
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(stock_id.getText().equals(""))
            {
                 jOptionPane1.showMessageDialog(null,"Plant ID not found"); 
            }
            else
            {
                 Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("delete from stock where stock_id="+stock_id.getText()+"");
       int i=pst.executeUpdate();
       if(i>0)
       {
           jOptionPane1.showMessageDialog(null,"stock delete successfully");
           clear_data();
       }
       else
       {
           jOptionPane1.showMessageDialog(null,"stock delete failed");
       }
            }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
        {
            tstid=tstid+1;
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
            PreparedStatement pst=con.prepareStatement("select * from stock where stock_id="+tstid+"");
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                date_time.setText(rs.getString(3));
                stock_id.setText(rs.getString(1));
                rate.setText(rs.getString(4));
                quantity.setText(rs.getString(5));
                total.setText(rs.getString(6));
                
                 PreparedStatement pst1=con.prepareStatement("select * from plants where plant_id="+rs.getString(2)+"");
                 ResultSet rs1=pst1.executeQuery();
                 plant_id.removeAllItems();
                 rs1.next();
                 plant_id.addItem(rs.getString(2)+" "+rs1.getString(2));
                 getplants();
                 
                
            }
            else
            {
                jOptionPane1.showMessageDialog(null,"No next record found !");
                tstid=tstid-1;
            }

        }
        catch(Exception ex)
        {
           jOptionPane1.showMessageDialog(null,ex);  
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try
        {
            tstid=tstid-1;
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
            PreparedStatement pst=con.prepareStatement("select * from stock where stock_id="+tstid+"");
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                date_time.setText(rs.getString(3));
                stock_id.setText(rs.getString(1));
                rate.setText(rs.getString(4));
                quantity.setText(rs.getString(5));
                total.setText(rs.getString(6));
                
                 PreparedStatement pst1=con.prepareStatement("select * from plants where plant_id="+rs.getString(2)+"");
                 ResultSet rs1=pst1.executeQuery();
                 plant_id.removeAllItems();
                 rs1.next();
                 plant_id.addItem(rs.getString(2)+" "+rs1.getString(2));
                 getplants();
                 
                
            }
            else
            {
                jOptionPane1.showMessageDialog(null,"No previous record found !");
                tstid=tstid+1;
            }

        }
        catch(Exception ex)
        {
           jOptionPane1.showMessageDialog(null,ex);  
        }
    }//GEN-LAST:event_jButton3ActionPerformed
public void getid()
{
    try
    {
        stid=0;
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from stock");
       ResultSet rs=pst.executeQuery();
       while(rs.next())
       {
           stid=rs.getInt(1);
       }
       stid=stid+1;
       stock_id.setText(String.valueOf(stid));
    }
    catch(Exception ex)
    {
        jOptionPane1.showMessageDialog(null,ex);
    }
}

public void getplants()
{
    try
    {
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from plants");
       ResultSet rs=pst.executeQuery();
       while(rs.next())
       {
           plant_id.addItem(rs.getInt(1)+" "+rs.getString(2));
       }
    }
    catch(Exception ex)
    {
         jOptionPane1.showMessageDialog(null,ex);
    }
}
public void clear_data()
{
        quantity.setText("");
        total.setText("");
        getid();
        getplants(); 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        date_time.setText(dateFormat.format(date));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_time;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JComboBox plant_id;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField search;
    private javax.swing.JTextField stock_id;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
