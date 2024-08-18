package org.example;

import org.example.Entity.City;
import org.example.Entity.Country;
import org.example.Entity.CountryLanguage;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private final SessionFactory sessionFactory;
    public Main() {
        this.sessionFactory = new Configuration()
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(CountryLanguage.class)
                .buildSessionFactory();
    }

    public static void main(String[] args) {

    }
}