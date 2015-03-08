package VOS;

/**
 * Falta revisar lo de que para producir un producto se necesita saber si hay Estaciones de Producción disponibles.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class EstacionProduccion
{
	private String codigo;
	
	private int capacidadProduccion;

	public EstacionProduccion(){
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCapacidadProduccion() {
		return capacidadProduccion;
	}

	public void setCapacidadProduccion(int capacidadProduccion) {
		this.capacidadProduccion = capacidadProduccion;
	}
	
	

}

