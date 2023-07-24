package dz.abdelghani.bankmicroservice;

import dz.abdelghani.bankmicroservice.web.JaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
//@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(JaxRSAPI.class);
        return jersyServlet;
    }

    @Bean
    SimpleJaxWsServiceExporter serviceExporter(){
        SimpleJaxWsServiceExporter serviceExporter = new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://0.0.0.0:8888/");
        return serviceExporter;

    }


}
