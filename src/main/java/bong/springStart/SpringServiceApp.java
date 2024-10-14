package bong.springStart;

import bong.springStart.sample.SampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringServiceApp {
    public static void main(String[] args){

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        SampleService service = ac.getBean("sampleService", SampleService.class);
        service.printService();
    }
}
