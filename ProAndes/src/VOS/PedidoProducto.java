package VOS;

import java.util.Date;

/**
 * Estado: "Aceptado", "Pendiente" o "Entregado"
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PedidoProducto
{
	private Date fechaEntrega;
	
	private String estado;

	private int cantidad;
	
	public PedidoProducto(){
		super();
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}

