package bong.springStart.sample.serviceA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ServiceAImpTypeOne implements ServiceA{

    @Autowired
    public ServiceAImpTypeOne(){

    }

    @Override
    public void printService() {
        System.out.println(">>> ServiceAImpTypeOne created");
    }
}
