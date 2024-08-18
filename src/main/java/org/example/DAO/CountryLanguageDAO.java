package org.example.DAO;

import org.example.Entity.CountryLanguage;
import org.hibernate.SessionFactory;

public class CountryLanguageDAO extends DaoGeneric<CountryLanguage> {
    public CountryLanguageDAO(SessionFactory sessionFactory) {
        super(CountryLanguage.class, sessionFactory);
    }
}
