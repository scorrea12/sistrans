
package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.taglibs.standard.lang.jstl.Coercions;

import basedatos.Conexion;

public class ConsultorDAO 
{
    
private Conexion conexionConsulta;

private void renovarConexion()
{
	conexionConsulta  = new Conexion();
}


}
