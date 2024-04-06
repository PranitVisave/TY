
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
class a1
{
   public static void main(String args[])
   {
      Connection con=null;
      Statement  stm=null;
      ResultSet rs=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty56","ty56","ty56");
         stm=con.createStatement();
         JFrame frame=new JFrame("Project");
         JTable table=new JTable();
         DefaultTableModel model=new DefaultTableModel(new Object[]{"pid","pname","pdesc","status"},0);
         rs=stm.executeQuery("Select * from Project");
         while(rs.next())
         {
            int Id=rs.getInt("pid");
            String Name=rs.getString("pname");
            String des=rs.getString("pdesc");
            String Status=rs.getString("status");
            model.addRow(new Object[]{Id,Name,des,Status});
         }
         table.setModel(model);
         JScrollPane sp=new JScrollPane(table);
         frame.add(sp);
         frame.pack();
         frame.setVisible(true);
         rs.close();
         stm.close();
         con.close();
         
      }
      catch(SQLException e)
      {
         System.out.println("Error"+e.getMessage());
      }
   }
}
