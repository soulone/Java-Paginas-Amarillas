package com.soulone.p_amarillas.activities;

public class EmpresaItem {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    private String name;
    private String categoria;

    public EmpresaItem(String name, String categoria, String direction, String street, String number, int brand) {
        this.name = name;
        this.categoria = categoria;
        this.direction = direction;
        this.street = street;
        this.number = number;
        this.brand = brand;
    }

    private String direction;
    private String street;
    private String number;
    private int brand;

}
