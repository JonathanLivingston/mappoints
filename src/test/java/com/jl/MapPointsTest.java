package com.jl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.assertEquals;

public class MapPointsTest {

    private HttpServer server;
    private WebTarget target;

    private static final String BASE_URL = "http://localhost:8080";

    @Before
    public void setUp() throws Exception {
        ResourceConfig rc = new ResourceConfig();
        rc.packages("com.jl.infotex");
        // start the server
        server = GrizzlyHttpServerFactory.createHttpServer(new URI(BASE_URL), rc);
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and Main.startServer())
        // --
        // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(new URI(BASE_URL));
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        String responseMsg = target.path("test").request().get(String.class);
        assertEquals("Got it!", responseMsg);
    }
}
