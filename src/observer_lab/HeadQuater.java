/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_lab;

import java.util.ArrayList;

/**
 *
 * @author sornp
 */
public class HeadQuater implements Source {
    private final ArrayList<MyObservers> list ;
    private int thaiData;
    private int uaeData;
    
    public HeadQuater() {
        this.list = new ArrayList<MyObservers>();
    }
     
    public void setData(int thaiData, int uaeData) {
        this.thaiData = thaiData;
        this.uaeData = uaeData;
        notifyObserver();
    }
    
    public int getThaiData(){
        return thaiData;
    }

    public int getUaeData() {
        return uaeData;
    }
    
    @Override
    public void register(MyObservers observer){
        list.add(observer);
    }
    
    public void notifyObserver(){
        for(int j = 0;j < list.size();j++){
            list.get(j).update(this);
        }
    }
}
