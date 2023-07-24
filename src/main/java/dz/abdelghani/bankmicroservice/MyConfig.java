package dz.abdelghani.bankmicroservice;

import dz.abdelghani.bankmicroservice.web.JaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
//@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(JaxRSAPI.class);
        return jersyServlet;
    }
}
