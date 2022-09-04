/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstagents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author mohamad_amgad
 */
public class reciever extends Agent{

    @Override
    protected void setup() {
       
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage recievedMessage = receive();
                if(recievedMessage!=null){
                    System.out.println(recievedMessage.getContent());
                    System.out.println(recievedMessage.getSender().getLocalName());
                }
                 }
        });
    }
    
}
