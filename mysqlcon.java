import java.sql.*;
class mysqlcon{
public static void main(String agrs[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","root");
Statement stmt =con.createStatement();
ResultSet rs= stmt.executeQuery("select *from vgaccount");
while(rs.next()){
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
con.close();
}catch(Exception e){
System.out.println(e);
}
}
}

