package com.contect.mycontect.model;

import java.io.Serializable;

public class Contacts implements Serializable {
    private String name;
    private String number;
    private String image_url;

    public Contacts(String name, String number, String image_url) {
        this.name = name;
        this.number = number;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
