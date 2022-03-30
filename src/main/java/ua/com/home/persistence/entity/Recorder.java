package ua.com.home.persistence.entity;

import ua.com.home.persistence.type.RecorderType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recorders")
public class Recorder extends BaseEntity{

    @Column
    String name;

    @Column
    String city;

    @Column
    RecorderType type;

    @Column
    String model;

    @Column
    int ip;

    @Column
    int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public RecorderType getType() {
        return type;
    }

    public void setType(RecorderType type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Recorder() {
        super();
    }
}
