package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
@Getter
@Setter
public class CountryLanguage {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country countryId;
    @Column(name = "language")
    private String language;
    @Column(name = "is_official")
    private Boolean isOfficial;
    @Column(name = "percentage", precision = 4, scale = 1)
    private BigDecimal percentage;

}
