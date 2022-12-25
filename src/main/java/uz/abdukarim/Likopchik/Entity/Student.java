package uz.abdukarim.Likopchik.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "dev_student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
