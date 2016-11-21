package integration.config;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.camel.component.ActiveMQConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationConfiguration {

    @Bean
    public ActiveMQComponent activeMQComponent() {
        ActiveMQConfiguration activeMQConfiguration = new ActiveMQConfiguration();
        activeMQConfiguration.setBrokerURL("tcp://localhost:61616");
        activeMQConfiguration.setUserName("admin");
        activeMQConfiguration.setPassword("admin");
        return new ActiveMQComponent(activeMQConfiguration);
    }
}
