package bong.springStart;

import bong.springStart.sample.serviceA.ServiceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringServiceAutoApp {

    public static void main(String[] args){

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringAutoAppConfig.class);
        //SampleService service = ac.getBean("sampleService", SampleService.class);
        ServiceA service = ac.getBean("serviceAImpTypeTwo", ServiceA.class);
        service.printService();
    }
}
