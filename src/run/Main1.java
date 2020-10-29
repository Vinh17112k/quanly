/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Main1 {
    public static void main(String[] args) {
//        Set s=new HashSet();
//        s.add(1234);
//        s.add(1234);
//        s.add(231);
//        s.add(987);
//        System.out.println(s.size());//3
//        Iterator i=s.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());
       Map m=new HashMap();
       m.put("Num 1","To ana na");
       m.put("Num 1","Lai nu nu");
       m.put("Num 2","Anh hoa hoa");
       m.put("Num 3","Kieu thu htu");
       Iterator i=m.keySet().iterator();
       while(i.hasNext()){
           String key=(String)i.next();
           System.out.println(key+"->"+m.get(key));
       }
    }
}
