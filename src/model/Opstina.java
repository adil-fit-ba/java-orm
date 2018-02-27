package model;

import helper.IEntity;

public class Opstina extends IEntity {
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    protected String naziv;
}
