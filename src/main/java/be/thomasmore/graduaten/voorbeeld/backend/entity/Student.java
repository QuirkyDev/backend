package be.thomasmore.graduaten.voorbeeld.backend.entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String naam;
    private String studentNummer;
    @ManyToOne
    private Klas klas;

    public Student() {

    }

    public Student(String naam, String studentNummer, Klas klas) {
        this.naam = naam;
        this.studentNummer = studentNummer;
        this.klas = klas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(String studentNummer) {
        this.studentNummer = studentNummer;
    }

    public Klas getKlas() {
        return klas;
    }

    public void setKlas(Klas klas) {
        this.klas = klas;
    }
}
