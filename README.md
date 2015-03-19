# AKKA Resource Adapter
This RA enables to communicate with the popular message passing system called AKKA. This enables SLEE based applications to commuicate with external nodes which exposes their functionality through AKKA interface. Right now this RA can only use the .tell method which is essentially fire and forget implementation and doesn't wait to accept for the response. A good example would be receiving the USSD request in the SLEE and invoking an independant external system keeping the business logic outside of SLEE.

RA Starts an actor system by loading the config file "remotelookup" in AkkaResourceAdapter.java
    system = ActorSystem.create("LookupSystem",
				ConfigFactory.load(config));
				
This system object is used to invoke other actors available on the network like this

	 ActorSelection selection = system.actorSelection("akka.tcp://ActorSystem@127.0.0.1:2550/user/actor-name");
	 selection.tell(message, ActorRef.noSender());
	 
This will send the message which can be string/json/xml to an actor listening on 2550 with the name actor-name
