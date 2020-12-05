package pl.klimas7.spring.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Message messageTest() {
        return new MessageImpl("SimpleBeanInTest");
    }

    @Bean
    public Message message() {
        return new MessageImpl("SimpleBean");
    }





    /*
     * Definiowanie dwóch Beanów o tej samej name w tym wypadku jest ok jednak będzie brany pod uwagę pierwszy
     * ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForBeanMethod

     if (isOverriddenByExistingDefinition(beanMethod, beanName)) {
        if (beanName.equals(beanMethod.getConfigurationClass().getBeanName())) {
            throw new BeanDefinitionStoreException(beanMethod.getConfigurationClass().getResource().getDescription(),
            beanName, "Bean name derived from @Bean method '" + beanMethod.getMetadata().getMethodName() +
            "' clashes with bean name for containing configuration class; please make those names unique!");
        }
        return;
     }
     */

    //2
    //ConfigurationClassBeanDefinitionReader -> loadBeanDefinitionsForBeanMethod -> this.conditionEvaluator.shouldSkip
    // ConditionEvaluator -> shouldSkip
    //  ProfilesParser.ParsedProfiles.matches
    //   AbstractEnvironment.isProfileActive

    //3
    //Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'message' available
    //Ponieważ oba beany mają profile a nie ustawiliśmy żadnego wiec domyślnie jest 'default'
}

