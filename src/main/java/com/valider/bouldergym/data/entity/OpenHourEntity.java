package com.valider.bouldergym.data.entity;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "open_hour")
public class OpenHourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "open_hour_id")
    private Long openHourId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private BoulderingGymEntity boulderingGymEntity;
    @ManyToOne
    @JoinColumn(name = "date_type_id")
    private DateTypeEntity dateTypeEntity;
    @Column(name = "open_time")
    private Time openTime;
    @Column(name = "close_time")
    private Time closeTime;

    public OpenHourEntity() {
    }

    public OpenHourEntity(Long openHourId, BoulderingGymEntity boulderingGymEntity, DateTypeEntity dateTypeEntity, Time openTime, Time closeTime) {
        this.openHourId = openHourId;
        this.boulderingGymEntity = boulderingGymEntity;
        this.dateTypeEntity = dateTypeEntity;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public Long getOpenHourId() {
        return openHourId;
    }

    public void setOpenHourId(Long openHourId) {
        this.openHourId = openHourId;
    }

    public BoulderingGymEntity getBoulderingGymEntity() {
        return boulderingGymEntity;
    }

    public void setBoulderingGymEntity(BoulderingGymEntity boulderingGymEntity) {
        this.boulderingGymEntity = boulderingGymEntity;
    }

    public DateTypeEntity getDateType() {
        return dateTypeEntity;
    }

    public void setDateType(DateTypeEntity dateTypeEntity) {
        this.dateTypeEntity = dateTypeEntity;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Time getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Time closeTime) {
        this.closeTime = closeTime;
    }
}
