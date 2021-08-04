package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TypeDefs({
//        @TypeDef(name = "point", typeClass = PointType.class)
//})
public class City {

    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

//    @Column(name = "lat_lon")
//    private Point latLon;

    private Double latitude;

    private Double longitude;

    @Column(name = "cod_tom")
    private Integer codTom;
}
