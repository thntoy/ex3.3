/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_lab;


/**
 *
 * @author sornp
 */
public class Uae implements MyObservers {
    @Override
     public void update(Source o){
        System.out.println("Thai  "+((HeadQuater)o).getThaiData()+"-"
                                   +((HeadQuater)o).getUaeData()+"  UAE");
      
    }
}
