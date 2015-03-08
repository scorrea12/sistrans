package VOS;

/**
 * Clase que modela tanto la materia prima como los componentes. Estos dos se diferencian a través del atributo "tipo" y la unidad de medida, que es de "toneladas" para la materia prima y de "unidades" para los componentes.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Insumo
{
	
	private String nombre;
	
	private int cantidadInicial;
	
	private String unidadMedida;
	
	private String tipo;

	public Insumo(){
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadInicial() {
		return cantidadInicial;
	}

	public void setCantidadInicial(int cantidadInicial) {
		this.cantidadInicial = cantidadInicial;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}

