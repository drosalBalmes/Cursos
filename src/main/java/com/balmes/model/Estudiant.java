package com.balmes.model;

import javax.persistence.*;
@Entity
@Table
public class Estudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estudiantId;
    @Column(name = "estudiantNom")
    private String estudiantNom;
    @Column(name = "estudiantCognom")
    private String estudiantCognom;
    @ManyToOne
    Curs curs;
    public Estudiant(int estudiantId, String estudiantNom, String estudiantCognom) {
        this.estudiantId = estudiantId;
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
    }

    public Estudiant(int estudiantId, String estudiantNom, String estudiantCognom, Curs curs) {
        this.estudiantId = estudiantId;
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
        this.curs = curs;
    }

    public Estudiant() {
    }

    public int getEstudiantId() {
        return estudiantId;
    }

    public void setEstudiantId(int estudiantId) {
        this.estudiantId = estudiantId;
    }

    public String getEstudiantNom() {
        return estudiantNom;
    }

    public void setEstudiantNom(String estudiantNom) {
        this.estudiantNom = estudiantNom;
    }

    public String getEstudiantCognom() {
        return estudiantCognom;
    }

    public void setEstudiantCognom(String estudiantCognom) {
        this.estudiantCognom = estudiantCognom;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }
}
