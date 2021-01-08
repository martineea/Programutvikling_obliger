
package programutvikling.oblig;

import java.util.*;

public class Car implements Comparable<Car>{
    
    private String manufacturer;
    private int age;

    //Konstruktør med manufacturer og age som parametre
    public Car(int age, String manufacturer){
        this.age = age;
        this.manufacturer = manufacturer;
    }

    //get-metoder for manufacturer og age
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getAge(){
        return age;
    }
    
    
    //toString metode som returnerer en beskrivende String
    @Override
    public String toString(){
        return "Manufactor: "+manufacturer+"\n"
                +"Age: "+age+"\n";
    }
    
    @Override
    public int compareTo(Car o) {
        return o.getManufacturer().compareTo(manufacturer);
    }
     

}
