package gestionIncidencias;

import java.util.ArrayList;
import java.util.List;



public class Incidencias {
    private String fechahora;
	private String origen;
	private String destino;
	private String detalle;
	private String tipo;
	
	
	public Incidencias(){
		fechahora = "";
		origen = "";
		destino = "";
		detalle = "";
        tipo 	= "";	
		
	}
	
	
	public Incidencias(String fechahora, String origen, String destino, String detalle, String tipo) {
		this.fechahora = fechahora;
		this.origen = origen;
		this.destino = destino;
		this.detalle = detalle;
		this.tipo = tipo;
	}

	
	
	@Override
    public String toString() {
        return "Incidencia{" + "fechahor=" + fechahora + ", origen=" + origen + ", destino=" + destino + "detalle=" + detalle + ", tipo=" + tipo + '}';
    }
    
	


	public String getfechahora() {
		return fechahora;
	}



	public void setfechahora(String fechahora) {
		this.fechahora = fechahora;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getDetalle() {
		return detalle;
	}



	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

