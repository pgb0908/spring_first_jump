package bong.springStart.sample;

import bong.springStart.sample.serviceA.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleServiceImpl implements SampleService {

    @Autowired
    private final ServiceA serviceA;

    // 인터페이스에만 의존하고 있음
    public SampleServiceImpl(ServiceA serviceA){
        this.serviceA = serviceA;
    }

    @Override
    public void printService() {
        serviceA.printService();
        System.out.println(">> ServiceA created");
    }
}
