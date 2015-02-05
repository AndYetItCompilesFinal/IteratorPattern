import java.util.Iterator;
import java.util.LinkedList;

public class CourseIterator implements Iterator{
   
   LinkedList students;
   int position;
      
   public CourseIterator(LinkedList list){
      this.students = list;
   }
   
   public Object next(){
      position++;
      return students.get(position);
   }
   
   public boolean hasNext() {
      int size = students.size();
      if(size == 0){
         return false;
      }else if(position == size){
         return false;
      }else{
         return true;
      }
   }
   
   public void remove() {
      if(position <= 0) {
         System.out.println("You must do a next first.");
      }
      if(students.get(position-1) != null){   
         students.remove(positon);
      }
   }   
}