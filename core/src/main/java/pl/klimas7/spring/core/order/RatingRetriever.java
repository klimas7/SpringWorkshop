package pl.klimas7.spring.core.order;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Log
@Component
public class RatingRetriever {
    @Autowired
    private Rating rating;

    @PostConstruct
    public void printRating() {
        log.info("Rating: " + rating.getRating());
    }

    //DefaultListableBeanFactory.getBeanNamesForType --> this.allBeanNamesByType Tutaj jest zgodnie z alfabetem
    //ClassPathBeanDefinitionScanner -> doScan

    //If add Order
    /*
    DefaultListableBeanFactory.resolveMultipleBeans
    1388
			if (result instanceof List) {
				if (((List<?>) result).size() > 1) {
					Comparator<Object> comparator = adaptDependencyComparator(matchingBeans);
					if (comparator != null) {
						((List<?>) result).sort(comparator);
					}
				}
			}
	OrderComparator
	AnnotationAwareOrderComparator
     */

}
