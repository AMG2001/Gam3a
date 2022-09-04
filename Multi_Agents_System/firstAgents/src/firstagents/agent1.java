/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstagents;

import jade.core.Agent;

/**
 *
 * @author mohamad_amgad
 */
public class agent1  extends Agent{
        /**
         * called  when you create agent.
         */
    @Override
    protected void setup() {
        System.out.println("Agent 1 created !!");
    }

    /**
     * Called when you kill agent .
     */
    @Override
    protected void takeDown() {
        System.out.println("Agent 1 stopped working !!");
    }
    
    
    
}
