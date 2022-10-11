package ex3.initializer.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

public class LocaleResolver {


    @Bean(name = "messageSource")
    ResourceBundleMessageSource messageSource() {
        /**
         * Create a new ResourceBundleMessageSource and set the basename to "text/msg"
         * to make the messages available in the application from the file
         */
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("message");

        return messageSource;
    }


// Get locale from header using LocaleResolver and LocaleChangeInterceptor
//    @Bean
//    public LocaleResolver localeResolver() {
//        /**
//         * Set the default locale to German using Locale.GERMAN
//         */
//        SessionLocaleResolver slr = new SessionLocaleResolver();
//        slr.setDefaultLocale(Locale.GERMAN);
//        return slr;
//    }
//
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        /**
//         * Intercept the request and change the locale based on the value
//         * of the lang parameter appended to a request
//         */
//        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
//        lci.setParamName("lang");
//        return lci;
//    }
}
