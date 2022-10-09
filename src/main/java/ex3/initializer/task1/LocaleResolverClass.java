package ex3.initializer.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


import java.util.Locale;

public class LocaleResolverClass {

    @Bean
    public LocaleResolver localeResolver() {
        /**
         * Set the default locale to German using Locale.GERMAN
         */
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.GERMAN);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        /**
         * Intercept the request and change the locale based on the value
         * of the lang parameter appended to a request
         */
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
}
