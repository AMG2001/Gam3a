/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstagents;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author mohamad_amgad
 */
public class sender extends Agent{
    
     @Override
    protected void setup() {
        ACLMessage senderMessage = new ACLMessage();
        senderMessage.addReceiver(new AID("reciever",false));
        senderMessage.setContent("MAHA");
        senderMessage.setPerformative(ACLMessage.INFORM);
        send(senderMessage);
        System.out.println("Message sent . ");
    }
    
}
