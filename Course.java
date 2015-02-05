import java.lang.Iterable;
import java.util.Iterator;
import java.util.LinkedList;

public class Course implements Iterable {
   LinkedList students;

   public Course(){
      students = new LinkedList();
   }
   
   public boolean addStudent(String name){
      boolean added;
      added = students.add(name);
      if(added == true){
         System.out.println("Student was successfully added.");
      }else{
         System.out.println("Student could not be added.");
      }
      return added;
   }
   
   public Iterator iterator(){
      return new CourseIterator(students);
   }
}