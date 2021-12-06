package com.example.ownsitebackend.entitis;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Data
@Table(name = "workHistory")
public class WorkHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String title;
    private String elementId;
    private String state;
    private String address;
    @JoinColumn(name = "cp_fk",referencedColumnName ="id")
    @OneToMany(
            targetEntity = WorkActivity.class, // ustwia na referncje w drugiej klasie
            cascade = CascadeType.ALL,// kazda operacja bedzie przypożadkowyc tej element
            orphanRemoval = true // jesli usuniemy nauczyclea uczniowie beda tez usunięci

    )
    private List<WorkActivity> workActivityList=new ArrayList<>();



    public WorkHistory(String id, String title, String elementId, String state, String address,List<WorkActivity> workActivityList) {
        this.id = id;
        this.title = title;
        this.elementId = elementId;
        this.state = state;
        this.address = address;
        this.workActivityList=workActivityList;
    }


}
