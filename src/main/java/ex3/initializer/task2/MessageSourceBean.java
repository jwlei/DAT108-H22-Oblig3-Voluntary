package ex3.initializer.task2;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

public class MessageSourceBean {

    /**
     * Defining the MessageSource Bean
     * An application context delegates the message resolution to a bean with the exact name messageSource.
     * ReloadableResourceBundleMessageSource is the most common MessageSource implementation that resolves
     * messages from resource bundles for different locales:
     */
//    @Bean
//    public MessageSource messageSource() {
//        ReloadableResourceBundleMessageSource messageSource
//                = new ReloadableResourceBundleMessageSource();
//
//        messageSource.setBasename("classpath:message");
//        messageSource.setDefaultEncoding("UTF-8");
//        return messageSource;
//    }
//
//    /**
//     * Defining LocalValidatorFactoryBean
//     * To use custom name messages in a properties file like we need to
//     * define a LocalValidatorFactoryBean and register the messageSource:
//     */
//
//    @Bean
//    public LocalValidatorFactoryBean getValidator(MessageSource messageSource) {
//        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//        bean.setValidationMessageSource(messageSource);
//        return bean;
//    }
}
