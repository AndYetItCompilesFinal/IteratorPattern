import java.lang;

public class CourseIterator implements Iterator{
   
   LinkedList students;
   int position;
      
   public CourseIterator(LinkedList list){
      this.students = list;
   }
   
   public Object next(){
      position++;
      return list.get(position);
   }
   
   public boolean hasNext() {
      int size = list.size();
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
      if(list.get(position-1) != null){   
         list.remove(positon);
      }
   }   
}