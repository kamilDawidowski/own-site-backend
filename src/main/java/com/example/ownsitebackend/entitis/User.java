package com.example.ownsitebackend.entitis;


import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
@ToString
@Setter
@Getter
@Container(containerName = "www")
public class User {
    @Id
    private String id;
    private String firstName;
    @PartitionKey
    private String lastName;
    private String address;
    public User() {

    }

    public User(String id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

}