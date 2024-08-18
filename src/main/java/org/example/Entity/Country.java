package org.example.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name="country")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "code", columnDefinition = "varchar(3)")
    private String code;
    @Column(name = "code_2", columnDefinition = "varchar(2)")
    private String code2;
    @Column(name = "name")
    private String name;
    @Column(name = "continent")
    private Integer continent;
    @Column(name = "region")
    private String region;
    @Column(name = "surface_area", precision = 10, scale = 2)
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private Short indepYear;
    @Column(name = "population")
    private Integer population;
    @Column(name = "life_expectancy", precision = 3, scale = 1)
    private BigDecimal lifeExpectancy;
    @Column(name = "gnp", precision = 10, scale = 2)
    private BigDecimal gnp;
    @Column(name = "gnpo_id", precision = 10, scale = 2)
    private BigDecimal gnpoId;
    @Column(name = "local_name")
    private String localName;
    @Column(name = "government_form")
    private String governmentForm;
    @Column(name = "head_of_state")
    private String headOfState;
    @Column(name = "capital")
    private Integer capital;
}
