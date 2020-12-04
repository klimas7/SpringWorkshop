package pl.klimas7.spring.core.order;

public class RatingRetriever {


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
