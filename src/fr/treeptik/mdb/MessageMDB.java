package fr.treeptik.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import fr.treeptik.producteurmessage.Produit;




@MessageDriven(activationConfig={
		@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.jms.Queue"),
		@ActivationConfigProperty(propertyName="destination", propertyValue="queue/test")})

public class MessageMDB implements MessageListener {



	public void onMessage(Message message) {
		
		
		try{
			
			
		ObjectMessage objectMesage = (ObjectMessage) message;
		Produit produit = (Produit) objectMesage.getObject();
		System.out.println("ref"+produit.getRef());
		
		
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	
}
