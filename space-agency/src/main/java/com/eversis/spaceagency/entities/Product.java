package com.eversis.spaceagency.entities;

import com.eversis.spaceagency.dtos.MapPoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SADH_PRODUCTS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(targetEntity = Mission.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_MISSION_NAME", referencedColumnName = "MISSION_NAME")
    private Mission mission;

    @Column(name = "PRODUCT_ACQUISITION_DATE", nullable = false)
    private Date date;

    @OneToOne(targetEntity = Footprint.class)
    @JoinColumn(name = "PRODUCT_FOOTPRINT", referencedColumnName = "FOOTPRINT_POINTS")
    private Footprint footprints;

    @Column(name = "PRODUCT_PRICE")
    private Double price;

    @Column(name = "PRODUCT_URL")
    private String url;


}
