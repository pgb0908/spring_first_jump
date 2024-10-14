package bong.springStart.sample.serviceA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceAImplTypeTwo implements ServiceA{

    @Autowired
    public ServiceAImplTypeTwo(){

    }

    @Override
    public void printService() {
        System.out.println(">>> ServiceAImplTypeTwo created");
    }
}
