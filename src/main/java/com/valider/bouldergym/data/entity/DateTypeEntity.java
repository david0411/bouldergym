package com.valider.bouldergym.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "date_type")
public class DateTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "date_type_id")
    private Long dateTypeId;
    @Column(name = "date_type_name")
    private String dateTypeName;

    public DateTypeEntity() {
    }

    public DateTypeEntity(Long dateTypeId, String dateTypeName) {
        this.dateTypeId = dateTypeId;
        this.dateTypeName = dateTypeName;
    }

    public Long getDateTypeId() {
        return dateTypeId;
    }

    public void setDateTypeId(Long dateTypeId) {
        this.dateTypeId = dateTypeId;
    }

    public String getDateTypeName() {
        return dateTypeName;
    }

    public void setDateTypeName(String dateTypeName) {
        this.dateTypeName = dateTypeName;
    }
}
