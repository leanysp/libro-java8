package libro.cap02.fechas;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	
	//constructor
	public Fecha(int d, int m, int a){
		dia= d;
		mes = m;
		anio = a;
	}
	
	public boolean equals(Object o){
		Fecha otra = (Fecha)o;
		return (dia==otra.dia)&&(mes == otra.mes)&& (anio==otra.anio); 
	}
	
	
	public String toString(){
		return dia+"/"+ mes + "/"+anio;
	}
	
	
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}	
	

}
