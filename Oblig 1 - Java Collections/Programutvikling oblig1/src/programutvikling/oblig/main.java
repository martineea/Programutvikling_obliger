
package programutvikling.oblig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


public class main {
    public static void main (String[] args){
        
       // OPPGAVENE OM CAR 
       Set<Car> cars = new TreeSet<>();
        Car car1 = new Car(10, "volvo");
        Car car2 = new Car(2, "bmw");
        Car car3 = new Car(3, "audi");
       
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        
        System.out.print(cars);
        
        ArrayList <Car> carlist = new ArrayList<>();
        carlist.addAll(cars);
        Car car4 = new Car(10, "audi");
        carlist.add(car4);
        
        Collections.sort(carlist, new ManufacturerCarComparator()); 
       
        //OPPGAVENE MED STUDENTGRUPPE
       Student stud1 = new Student("Kari", "Nordmann", 2255, 23);
       StudentGroup sgrp = new StudentGroup();
       
       sgrp.addStudent(stud1, 55);
       System.out.println(sgrp.toString());
       
        
    
    }
}
