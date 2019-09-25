package com.rest.crud.vo;
public class PersonaVo {	
	private int id;
	private String nombres;
	private String apellido;
	private int cedula; 
	
	public PersonaVo(int id, String nombres, String apellido, int cedula) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellido = apellido;
		this.cedula = cedula;
	}	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	
}
