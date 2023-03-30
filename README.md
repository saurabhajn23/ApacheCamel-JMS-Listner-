# ApacheCamel-JMS-Listner-
*APACHE CAMEL

IT IS A FRAME WORK WHICH IS USED FOR SOLVING INTEGRATION PROBLEMS AND IMPLEMENTING THE ENTERPRISE  INTEGRATION PATTERNS .


*JMS - JAVA MESSAGING SERVICE
It is a javaAPI that allows application to create ,
send and receive messages.
JMS PROVIDER - Messaging system that implements JMS interface
JMS CLIENTS - An apps or program which produce and consume message.
Message - the data which jms client send to and consume from provider


Active MQ  -> Apache ActiveMQ is an open source message broker written in Java together with a full Java Message Service client.
	     It provides "Enterprise Features" which in this case means fostering the communication from more than one client or server.



          JMS
           |
      P2P    PUBSUB

1>P2P (POINT TO POINT) Queue

PRODUCER  --- JMS(Queue) ---CONSUMER

Each message has only one consumer. After a producer sends a message to a queue, a specified consumer 
registered for the queue can receive the message. Producers and consumers have no timing dependencies.

2>PUBSUB (PUBLISHER AND SUBSCRIBER) Topic

PUBLISHER  --- JMS(topic) --- SUBSCRIBER

Publish/subscribe messaging, or pub/sub messaging, is a form of asynchronous 
service-to-service communication used in serverless and microservices architectures.

In a pub/sub model, any message published to a topic is immediately 
received by all of the subscribers to the topic.



