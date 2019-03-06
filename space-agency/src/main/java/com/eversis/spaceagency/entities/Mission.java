package com.eversis.spaceagency.entities;

import com.eversis.spaceagency.enums.ImageryType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SADH_MISSIONS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mission {

    @Id
    @Column(name = "MISSION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "MISSION_NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "MISSION_IMG_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ImageryType imgType;

    @Column(name = "MISSION_START_DATE")
    private Date startDate;

    @Column(name = "MISSION_FINISH_DATE")
    private Date finishDate;

    @JsonIgnore
    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<Product> products;


}
