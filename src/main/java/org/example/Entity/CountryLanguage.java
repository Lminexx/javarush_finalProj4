package org.example.Entity;

import jakarta.persistence.*;

import java.lang.annotation.Native;
import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
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
    private Byte isOfficial;
    @Column(name = "percentage", precision = 4, scale = 1)
    private BigDecimal percentage;

}
