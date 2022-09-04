/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstagents;

import jade.core.behaviours.Behaviour;

public class bahaviour3 extends Behaviour{
int x=0;
    @Override
    public void action() {
        System.out.println("x = "+x);
        x++;
       }
    
    @Override
    public boolean done() {
    if(x!=10) {
    return false;
    }
    else {
    return true;
    }
                    }
  }

   
    

