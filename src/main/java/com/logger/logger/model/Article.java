package com.logger.logger.model;

public class Article {
    private int id;
    private String name;
    private  String addresss;

    public Article(int id, String name,String  addresss) {
        super();
        this.id = id;
        this.name = name;
        this.addresss = addresss;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
