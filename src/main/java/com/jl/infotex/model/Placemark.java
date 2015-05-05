package com.jl.infotex.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Placemark {

    private Long id;
    private String name;
    private String address;

    public Placemark() {
    }

    public Placemark(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
