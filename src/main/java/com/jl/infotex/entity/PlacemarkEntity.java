package com.jl.infotex.entity;

import javax.persistence.*;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "placemark", schema = "public", catalog = "mpoints")
public class PlacemarkEntity {
    private int id;
    private Float latitude;
    private Float longitude;
    private String hint;
    private String baloon;
    private String address;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    @Generated(GenerationTime.INSERT)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "latitude", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "hint", nullable = true, insertable = true, updatable = true, length = 255)
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Basic
    @Column(name = "baloon", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBaloon() {
        return baloon;
    }

    public void setBaloon(String baloon) {
        this.baloon = baloon;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 1024)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacemarkEntity that = (PlacemarkEntity) o;

        if (id != that.id) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (hint != null ? !hint.equals(that.hint) : that.hint != null) return false;
        if (baloon != null ? !baloon.equals(that.baloon) : that.baloon != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (hint != null ? hint.hashCode() : 0);
        result = 31 * result + (baloon != null ? baloon.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
