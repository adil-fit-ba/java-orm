package model;

import helper.FKNull;
import helper.IEntity;

public class Student  extends IEntity {

    protected String ime;
    protected String prezime;
    protected final FKNull<Opstina> opstinaFK = new FKNull<>(true);

    public Student(String ime, String prezime, Opstina opstina) {
        this.ime = ime;
        this.prezime = prezime;
        opstinaFK.set(opstina);
    }
    public Student(String ime, String prezime, Integer opstina) {
        this.ime = ime;
        this.prezime = prezime;
        opstinaFK.set(opstina);
    }

}
