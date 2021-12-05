package com.example.ownsitebackend.entitis.workHistory;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Container(containerName = "workHistory")
public class WorkHistory {
    @Id
    private String id;
    private String title;
    @PartitionKey
    private String elementId;
    private String state;
    private String address;
    private ArrayList<WorkActivity> worksActivity;

    public WorkHistory(String id, String title, String elementId, String state, String address, ArrayList<WorkActivity> worksActivity) {
        this.id = id;
        this.title = title;
        this.elementId = elementId;
        this.state = state;
        this.address = address;
        this.worksActivity = worksActivity;
    }



}
