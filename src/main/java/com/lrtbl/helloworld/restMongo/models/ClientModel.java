package com.lrtbl.helloworld.restMongo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "clients")
@ToString
public class ClientModel {

    @Id
    private String id;

    private String username;

    private String password;

    private Date createdAt;

    private Date updatedAt;
}
