/* Group: And Yet It Compiles
   Names: Mary Floyd, Nick Spring, Zoe Baker
   
   Tester uses a foreach loop to move through the list of Students
*/

import java.lang.Iterable;

public class Tester {
   public static void main(String[] args){
      Course course = new Course();
      course.addStudent("Mary");
      course.addStudent("Nick");
      course.addStudent("Zoe");
   
      for(Object o : course){
         System.out.println(o);
      }
   }
   

}