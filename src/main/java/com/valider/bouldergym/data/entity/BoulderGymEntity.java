package com.valider.bouldergym.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "boulder_gym")
public class BoulderGymEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "location_id")
    private Long locationId;
    @Column(name = "location_name")
    private String locationName;
    @Column(name = "description")
    private String description;
    @Column(name = "active")
    private boolean active;

    public BoulderGymEntity(Long locationId, String locationName, String description, boolean active) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.description = description;
        this.active = active;
    }

    public BoulderGymEntity() {

    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
