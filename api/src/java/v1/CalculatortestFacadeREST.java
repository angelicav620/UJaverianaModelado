/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v1;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author angie
 */
@Stateless
@Path("v1.calculatortest")
public class CalculatortestFacadeREST extends AbstractFacade<Calculatortest> {
    @PersistenceContext(unitName = "apiPU")
    private EntityManager em;

    public CalculatortestFacadeREST() {
        super(Calculatortest.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Calculatortest entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Calculatortest entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Calculatortest find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Calculatortest> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Calculatortest> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
 
   
    @GET
    @Path("/add/{a}/{b}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String add(@PathParam("a") int a, @PathParam("b") int b) {

                int result = a+b;

        return Integer.toString(result);

    }

   

    @GET
    @Path("/subs/{a}/{b}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String sub(@PathParam("a") int a, @PathParam("b") int b) {

                int result = a-b;

        return Integer.toString(result);

    }

 

    @GET
    @Path("/mult/{a}/{b}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String mult(@PathParam("a") int a, @PathParam("b") int b) {

                int result = a*b;

        return Integer.toString(result);

    }

   

    @GET
    @Path("/div/{a}/{b}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String div(@PathParam("a") int a, @PathParam("b") int b) {

     if(b==0)
     {
        return "No es posible hacer divisiones en cero";

      }else{

       int result = a/b;
       return Integer.toString(result);  

      }

    }
}
