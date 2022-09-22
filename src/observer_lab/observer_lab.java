/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_lab;

import observer_lab.Uae;
import java.util.*;
/**
 *
 * @author sornp
 */
public class observer_lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadQuater obj = new HeadQuater();
        Thai obj1 = new Thai();
        Uae obj2 = new Uae();
        
        obj.register(obj1);
        obj.register(obj2);

        String str = new String();
        str = sc.nextLine();
        while (true) {
            try{
                String[] a;
                a = str.split("\\s+");
                obj.setData(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
                if (str.equals(""))
                    break;
                if (sc.hasNextLine())
                    str = sc.nextLine();
            }catch (NumberFormatException ex){
                System.out.println("**** Exit leaw krub ****");
                break;
            }
        }
    }  
}
