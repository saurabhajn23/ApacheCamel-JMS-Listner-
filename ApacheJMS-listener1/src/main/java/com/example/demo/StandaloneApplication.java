package com.example.demo;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandaloneApplication {

	public static void main(String[] args) throws Exception {
		// use Camels Main class
        CamelContext ctx = new DefaultCamelContext();

        ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
        cf.setBrokerURL("tcp://localhost:61616");
        cf.setUserName("admin");
        cf.setPassword("admin");

        ctx.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(cf));
        ctx.addRoutes(
                new RouteBuilder() {
                    public void configure() {
                        from("timer:mytimer?period=5000").routeId("generate-route")
                                .transform(constant("HELLO from Saurabh!"))
                                .to("jms:queue:QueueIN");


                        from("jms:queue:QueueIN").routeId("receive-route")
                                .log("Received a message - ${body} - sending to outbound queue")
                                .log("hello saurabh")
                                .to("jms:queue:QueueOUT?exchangePattern=InOnly");
                    }
                });
        ctx.start();
        Thread.sleep(10000);
        ctx.stop();

	}

}
