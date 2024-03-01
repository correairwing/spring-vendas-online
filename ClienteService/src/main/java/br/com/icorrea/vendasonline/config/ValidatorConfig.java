/**
 * 
 */
package br.com.icorrea.vendasonline.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;


@Configuration
public class ValidatorConfig {



    @Bean
    public ValidatorFactory validatorFactory() {
        return Validation.buildDefaultValidatorFactory();
    }

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//        bean.setValidationMessageSource(messageSource); // Se necessário
        bean.setConstraintValidatorFactory(validatorFactory().getConstraintValidatorFactory());
        return bean;
    }

}
