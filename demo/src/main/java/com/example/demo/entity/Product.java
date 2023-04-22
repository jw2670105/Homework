package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sequence;
    private String sourceId;
    private String logloc;

    public Product() {}

    public Product(String sequence, String sourceId, String logloc) {
        this.sequence = sequence;
        this.sourceId = sourceId;
        this.logloc = logloc;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getLogloc() {
        return logloc;
    }

    public void setLogloc(String logloc) {
        this.logloc = logloc;
    }
}


