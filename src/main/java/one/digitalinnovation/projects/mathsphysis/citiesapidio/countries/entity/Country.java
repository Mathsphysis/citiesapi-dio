package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String ptBrName;

    @Column(name = "sigla")
    private String code;

    @Column
    private Integer bacen;

}
