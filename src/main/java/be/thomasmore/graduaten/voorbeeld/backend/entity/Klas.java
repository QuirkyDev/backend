package be.thomasmore.graduaten.voorbeeld.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String naam;

    public Klas() {
    }

    public Klas(String naam) {
        this.naam = naam;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
