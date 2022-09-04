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
public class agent3 extends Agent{

    @Override
    protected void setup() {
        bahaviour3 b =  new bahaviour3();
        addBehaviour(b);
    }
    
    
}
