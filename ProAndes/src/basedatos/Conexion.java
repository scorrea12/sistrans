package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion 
{


	private Connection conexion;

	public Conexion()
	{
		conexion = configurarConexion() ;
	}

	private  Connection configurarConexion()
	{

		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			String props = "jdbc:oracle:thin:@prod.oracle.virtual.uniandes.edu.co:1531:prod";
			Connection conexionP= DriverManager.getConnection(props,"ISIS2304181510","smuzakhydro");
			if(conexionP!=null)
			{
				System.out.println("Conexion exitosa");
				return conexionP;
			}
			else
			{
				System.out.println("Conexion fallida");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null ;
	}

	public boolean actualizarCrear(String sql) 
	{
		try 
		{
			Statement sentencia;
			sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			sentencia.executeUpdate(sql);
			conexion.commit();
			sentencia.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return false;
		}        
		return true;
	}


	public ResultSet consultar(String sql) 
	{
		ResultSet resultado = null;
		try 
		{
			Statement sentencia;
			sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			resultado = sentencia.executeQuery(sql);
			conexion.commit();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}        
		return resultado;
	}


	public void cerrarConexion()
	{
		try
		{
			conexion.close();
		} 
		catch (SQLException ex)
		{
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
