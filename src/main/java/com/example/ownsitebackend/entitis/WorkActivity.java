package com.example.ownsitebackend.entitis;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table
public class WorkActivity {
    @Id
    String id;
    String title;
    String description;
    @OneToMany(
            targetEntity = WorkTechnology.class, // ustwia na referncje w drugiej klasie
            cascade = CascadeType.ALL,// kazda operacja bedzie przypożadkowyc tej element
            orphanRemoval = true // jesli usuniemy nauczyclea uczniowie beda tez usunięci

    )
    @JoinColumn(name = "cp_fk",referencedColumnName ="id")
    List<WorkTechnology> technology;
    String role;

    public WorkActivity(String title, String description, List<WorkTechnology> technology, String role) {
        this.title = title;
        this.description = description;
        this.technology = technology;
        this.role = role;
    }

}
