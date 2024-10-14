package bong.springStart;

public class ServiceApp {

    public static void main(String[] args){
        AppConfig appConfig = new AppConfig();

        var service = appConfig.sampleService();
        service.printService();
    }
}
