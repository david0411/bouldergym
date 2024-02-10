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
    private BoulderingGymEntity boulderingGymEntity;
    @Column(name = "sub_location_name")
    private String subLocationName;

    public SubLocationEntity() {
    }

    public SubLocationEntity(Long subLocationId, BoulderingGymEntity boulderingGymEntity, String subLocationName) {
        this.subLocationId = subLocationId;
        this.boulderingGymEntity = boulderingGymEntity;
        this.subLocationName = subLocationName;
    }

    public Long getSubLocationId() {
        return subLocationId;
    }

    public void setSubLocationId(Long subLocationId) {
        this.subLocationId = subLocationId;
    }

    public BoulderingGymEntity getBoulderingGymEntity() {
        return boulderingGymEntity;
    }

    public void setBoulderingGymEntity(BoulderingGymEntity boulderingGymEntity) {
        this.boulderingGymEntity = boulderingGymEntity;
    }

    public String getSubLocationName() {
        return subLocationName;
    }

    public void setSubLocationName(String subLocationName) {
        this.subLocationName = subLocationName;
    }
}
