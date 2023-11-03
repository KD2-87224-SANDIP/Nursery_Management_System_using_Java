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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amprojects
 */
public class html_invoice_report {
    DateFormat dt=new SimpleDateFormat("dd/MM/yyyy");
  Date d1=new Date();
  String d=dt.format(d1);
  
  html_invoice_report()
  {
      try
        {
            Class.forName(driver_name);
            Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
            PreparedStatement pst=con.prepareStatement("select * from bills");
            ResultSet rs=pst.executeQuery();
            
          BufferedWriter bw=new BufferedWriter(new FileWriter("Invoice_Report.html"));
          ResultSetMetaData rsm=rs.getMetaData();
          int cols=rsm.getColumnCount();
          bw.write("<center><h2><font color=green>PLANT NESERY MANAGEMENT SYSTEM</font></h2>");
          bw.write("<center><h3><u><b><font color=green>INVOICE REPORT</font></b></u></h3></center>");
          bw.write("<h4 align=left>"+"DATE :- "+d+"</h4>");
          bw.write("<hr><center>");
          bw.write("<table border=1>");
          bw.write("<tr>");
           for(int i=1;i<=cols;i++)
            bw.write("<th><font color=purple>"+rsm.getColumnLabel(i)+"</font>");
            while(rs.next())
           {
             bw.write("<tr>");
             for(int i=1;i<=cols;i++)
             bw.write("<td>"+rs.getString(i));
           }
             bw.write("</table>");
             bw.write("</center>");
             bw.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
  }
}
