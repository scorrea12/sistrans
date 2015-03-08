package VOS;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Cliente extends Usuario
{
	
	private String numRSNV;
	
	private String ciudad;
	
	private String direccion;
	
	private String telefono;
	
	private String nombreRL;

	private String idRL;
	

	public Cliente(){
		super();
	}


	public String getNumRSNV() {
		return numRSNV;
	}


	public void setNumRSNV(String numRSNV) {
		this.numRSNV = numRSNV;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNombreRL() {
		return nombreRL;
	}


	public void setNombreRL(String nombreRL) {
		this.nombreRL = nombreRL;
	}


	public String getIdRL() {
		return idRL;
	}


	public void setIdRL(String idRL) {
		this.idRL = idRL;
	}

	
}

