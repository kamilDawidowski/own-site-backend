package com.example.ownsitebackend.entitis.workHistory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WorkActivity {
    String title;
    String description;
    String technology;
    String role;

    public WorkActivity(String title, String description, String technology, String role) {
        this.title = title;
        this.description = description;
        this.technology = technology;
        this.role = role;
    }

}
