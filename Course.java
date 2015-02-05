import java.lang;

public class Course implements Iterator {
   LinkedList students;

   public Course(){
      students = new LinkedList();
   }
   
   public addStudent(String name){
      boolean added;
      added = students.add(name);
      if(added == true){
         System.out.println("Student was successfully added.");
      }else{
         System.out.println("Student could not be added.");
      }
   }
   
   public Iterator<T> iterator(){
      return new CourseIterator(students);
   }
}