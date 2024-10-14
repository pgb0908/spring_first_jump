package bong.springStart.findAllBean;

import bong.springStart.SpringAppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInfoFindAll {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringAppConfig.class);

    @Test
    @DisplayName("모든 빈 출력")
    void findAllBean(){
        String[] beanNames = ac.getBeanDefinitionNames();

        for(String name : beanNames){
            Object bean = ac.getBean(name);
            System.out.println("name = " + name + ", oject= " + bean);
        }
    }
}
