package com.jl.infotex.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.jl.infotex.entity.PlacemarkEntity;
import com.jl.infotex.model.Placemark;
import com.jl.infotex.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Root resource (exposed at "mappoints" path)
 */
@Path("/")
public class MapPoints {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Path("addpoint")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPoint(Placemark placemark) {
        //TODO mapper
        PlacemarkEntity entity = new PlacemarkEntity();
        entity.setAddress(placemark.getAddress());
        entity.setHint(placemark.getName());

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

}
