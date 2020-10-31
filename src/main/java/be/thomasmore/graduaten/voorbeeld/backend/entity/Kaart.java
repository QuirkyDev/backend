package be.thomasmore.graduaten.voorbeeld.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kaart {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private double krediet;
    @OneToOne
    private Student student;

    public Kaart() {
    }

    public Kaart(double krediet, Student student) {
        this.krediet = krediet;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getKrediet() {
        return krediet;
    }

    public void setKrediet(double krediet) {
        this.krediet = krediet;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
