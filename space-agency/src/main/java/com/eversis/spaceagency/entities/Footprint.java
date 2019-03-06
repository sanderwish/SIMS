package com.eversis.spaceagency.entities;

import com.eversis.spaceagency.dtos.MapPoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SADH_FOOTPRINT")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Footprint {

    @Id
    @Column(name = "FOOTPRINT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FOOTPRINT_POINTS")
    private MapPoint[] point;

//    @Column(name = "FOOTPRINT_CIRCUIT")
//    private Path2D circuit;


}