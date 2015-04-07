package com.jl.infotex.servlet;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("mappoints")
public class ApplicationResourceConfig extends ResourceConfig {

    public ApplicationResourceConfig() {
        packages("com.jl.infotex");
    }

}
