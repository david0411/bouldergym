package com.valider.bouldergym.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sub_location")
public class SubLocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sub_location_id")
    private Long subLocationId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private BoulderGymEntity boulderGymEntity;
    @Column(name = "sub_location_name")
    private String subLocationName;

    public SubLocationEntity() {
    }

    public SubLocationEntity(Long subLocationId, BoulderGymEntity boulderGymEntity, String subLocationName) {
        this.subLocationId = subLocationId;
        this.boulderGymEntity = boulderGymEntity;
        this.subLocationName = subLocationName;
    }

    public Long getSubLocationId() {
        return subLocationId;
    }

    public void setSubLocationId(Long subLocationId) {
        this.subLocationId = subLocationId;
    }

    public BoulderGymEntity getBoulderGymEntity() {
        return boulderGymEntity;
    }

    public void setBoulderGymEntity(BoulderGymEntity boulderGymEntity) {
        this.boulderGymEntity = boulderGymEntity;
    }

    public String getSubLocationName() {
        return subLocationName;
    }

    public void setSubLocationName(String subLocationName) {
        this.subLocationName = subLocationName;
    }
}
