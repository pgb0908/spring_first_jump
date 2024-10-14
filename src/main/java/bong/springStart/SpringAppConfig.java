package bong.springStart;

import bong.springStart.sample.SampleService;
import bong.springStart.sample.SampleServiceImpl;
import bong.springStart.sample.serviceA.ServiceA;
import bong.springStart.sample.serviceA.ServiceAImplTypeTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean()
    public ServiceA serviceA(){
        return new ServiceAImplTypeTwo();
    }

    @Bean
    public SampleService sampleService(){
        return new SampleServiceImpl(serviceA());
    }
}
