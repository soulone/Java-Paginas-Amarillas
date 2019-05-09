package com.soulone.p_amarillas.models;

public class Empresa {


    private String adress;
    private String street;
    private String number;
    private String categoria;




    public Empresa() {
    }


    public Empresa(String name, String adress, String street, String number, String categoria) {
        this.name = name;
        this.adress = adress;
        this.street = street;
        this.number = number;
        this.categoria = categoria;
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




}
