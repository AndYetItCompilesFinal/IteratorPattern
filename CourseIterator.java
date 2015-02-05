import java.util.Iterator;
import java.util.LinkedList;

public class CourseIterator implements Iterator{
   
   LinkedList students;
   int position;
      
   public CourseIterator(LinkedList list){
      this.students = list;
      this.position = 0;
   }
   
   public Object next(){
     Object temp=students.get(position);
      position++;
      return temp;
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
         students.remove(position);
      }
   }   
}
