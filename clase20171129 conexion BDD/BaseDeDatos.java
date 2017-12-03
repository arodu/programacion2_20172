package clase20171129;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BaseDeDatos {

	public static void main(String[] args) {
		SQLiteHelper sql = new SQLiteHelper("/home/arodu/sqlitedemo.db");
		
		//sql.insert("INSERT INTO personas VALUES (\"5555\",\"cuatro\",\"cuatro\");");
		
		//sql.update("UPDATE personas SET nombre=\"cinco\", apellido=\"cinco\" WHERE cedula=\"5555\"");
		
		ResultSet rs = sql.select("SELECT * FROM personas WHERE nombre LIKE \"%o\";");
		
		try {
			while(rs.next()) {
				//JOptionPane.showMessageDialog(null, rs.getString("cedula"));
			
				//System.out.println(rs.getString("cedula")+"|"+rs.getString("nombre")+"|"+rs.getString("apellido"));
				
				System.out.println("Cedula: "+rs.getString("cedula"));
				System.out.println(rs.getString("nombre")+" "+rs.getString("apellido"));
				System.out.println("-------------------");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
	