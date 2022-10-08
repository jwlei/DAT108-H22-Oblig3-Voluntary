package ex3.initializer.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


import java.util.Locale;

public class LocaleResolver {

    @Bean
    public org.springframework.web.servlet.LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.GERMAN);
        return slr;
    }

    @Bean
    public org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor() {
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor lci = new org.springframework.web.servlet.i18n.LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
}
