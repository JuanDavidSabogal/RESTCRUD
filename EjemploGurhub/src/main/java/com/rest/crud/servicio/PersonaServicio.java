package com.rest.crud.servicio;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.crud.controller.PersonaDao;
import com.rest.crud.vo.PersonaVo;

@Path("/personas")

public class PersonaServicio {

	PersonaVo  miPersona;
	PersonaDao midao;	
	
	public PersonaServicio() {
		midao=new PersonaDao();
	}
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)	
	public List getCountries() 
	{
		List listOfCountries=midao.getListaPersonas();
		return listOfCountries;
	}	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	
	public PersonaVo getCountryById(@PathParam("id")int id) 
	{
		return midao.getCountry(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public String AgregarPersona() 
	{				
			return midao.AgregarPersona(miPersona);	
	}	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public PersonaVo ActualizarPersona()
	{
	return midao.ActualizarPersona(miPersona);
	}
	
	@DELETE
	@Path("/({id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void EliminarPersona(@PathParam("id")int id) 
	{
		midao.EliminarPersona(id);
	}
}
