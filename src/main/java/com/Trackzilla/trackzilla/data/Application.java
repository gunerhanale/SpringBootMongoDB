package com.Trackzilla.trackzilla.data;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Application {

    private String id;
    private String name;
    private String description;
    private String owner;

    public Application(){}

    

}
