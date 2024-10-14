package bong.springStart;

import bong.springStart.sample.SampleService;
import bong.springStart.sample.serviceA.ServiceA;
import bong.springStart.sample.SampleServiceImpl;
import bong.springStart.sample.serviceA.ServiceAImplTypeTwo;

public class AppConfig {

    public ServiceA serviceA(){
         // AppConfig만 수정해서 다른 인터페이스 종속성을 결정할 수 있음
        // return new ServiceAImpTypeOne();
        return new ServiceAImplTypeTwo();
    }

    public SampleService sampleService(){
        return new SampleServiceImpl(serviceA());
    }
}
