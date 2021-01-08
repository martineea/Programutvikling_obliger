package programutvikling.oblig;

import java.util.*;


public class StudentGroup {
    Map <Student, Integer> studenter = new HashMap <>();
    
    public void addStudent(Student student, Integer grade){
        studenter.put(student, grade);
    }
    
    @Override
    public String toString(){
        return "Karakter: " + studenter;
                  
    }
    
    
   public void listStudentsByGrade () {
    
        ArrayList<Map.Entry<Student, Integer>>list = new ArrayList<>(studenter.entrySet());
        list.sort(Map.Entry.comparingByValue(new GradeComparator()));
        
    }  
    
}
