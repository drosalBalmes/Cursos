package com.balmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Curs {

    @Id
    @Column(name = "cursId")
    private int cursId;
    @Column(name = "titolCurs")
    private String titolCurs;
    @Column(name = "descCurs")
    private String descCurs;
    @Column(name = "urlCurs")
    private String urlCurs;

    @OneToMany(mappedBy = "curs")
    List<Estudiant> estudiants;

    public Curs(int cursId, String titolCurs, String descCurs, String urlCurs, List<Estudiant> estudiants) {
        this.cursId = cursId;
        this.titolCurs = titolCurs;
        this.descCurs = descCurs;
        this.urlCurs = urlCurs;
        this.estudiants = estudiants;
    }

    public Curs() {
    }

    public Curs(int cursId, String titolCurs, String descCurs, String urlCurs) {
        this.cursId = cursId;
        this.titolCurs = titolCurs;
        this.descCurs = descCurs;
        this.urlCurs = urlCurs;
    }

    public int getCursId() {
        return cursId;
    }

    public void setCursId(int cursId) {
        this.cursId = cursId;
    }

    public String getTitolCurs() {
        return titolCurs;
    }

    public void setTitolCurs(String titolCurs) {
        this.titolCurs = titolCurs;
    }

    public String getDescCurs() {
        return descCurs;
    }

    public void setDescCurs(String descCurs) {
        this.descCurs = descCurs;
    }

    public String getUrlCurs() {
        return urlCurs;
    }

    public void setUrlCurs(String urlCurs) {
        this.urlCurs = urlCurs;
    }

    public List<Estudiant> getEstudiants() {
        return estudiants;
    }

    public void setEstudiants(List<Estudiant> estudiants) {
        this.estudiants = estudiants;
    }
}