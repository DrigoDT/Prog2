/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import ws.dao.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import ws.modelo.PaisModelo;


/**
 * REST Web Service
 *
 * @author tadeu
 */
@Path("paisws")
public class PaisWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PaisWS
     */
    public PaisWS() 
    {
        
    }

    /**
     * Retrieves representation of an instance of ws.PaisWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/text")
    @Path("TesteWS/get")
    public String getJson() {
        //TODO return proper representation object
       return "Teste WS";
    }
    
    @GET
    @Produces("application/json")
    @Path("Pais/get/{pais}")
    public String getPais(@PathParam("pais")String nmPais)
    {
        PaisDAO pais = new PaisDAO();
        PaisModelo modelo = new PaisModelo();
        Gson g = new Gson();
        
        modelo.setNomePais(nmPais);
        PaisModelo retorno  = pais.buscar(modelo);
        
        return g.toJson(retorno);
    }
    
    @GET
    @Produces("application/json")
    @Path("Pais/list")
    public String listaPais()
    {
        String sql = "select * from Pais";
        List<PaisModelo> lista = new ArrayList<PaisModelo>();
        PaisDAO pais = new PaisDAO();
        lista = pais.listar();
        Gson g = new Gson();
        return g.toJson(lista);
    }

    /**
     * PUT method for updating or creating an instance of PaisWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
