//Array list for the string 
import java.util.ArrayList ;

public class DynamicArrayExample {

    public static void main(String[]args)
    {
      ArrayList<String> fruits = new ArrayList <>();

      fruits.add("Apple");
      fruits.add("Mango");
      fruits.add("Banana");

      //Print the array list 
      System.out.println("Fruits in the list: " + fruits); //Apple,Mango ,Banana

      //Accessing the element at index 1

      String fruit = fruits.get(1);
      System.out.println("Fruit at index 1: " + fruit); //Mango

      //we want to check weathe the list contains mango or not 

      boolean containsPineapple = fruits.contains("Pineapple");
      System.out.println("List contains Pineapple: " + containsPineapple);  //False

      //remove the element at index 0

      String removeFruit = fruits.remove(0);
      System.out.println("Removed Fruits is : " +removeFruit);  //Apple

      //Updated array list 
      System.out.println("Updated Fruits in the list: "  +fruits);  //Mango , Banana

      //Check if the array list is empty or not 

      boolean isEmpty = fruits.isEmpty();
      System.out.println("Is the list is Empty : " + isEmpty); //False

      //Size of the array list 

      int size = fruits.size();
      System.out.println("Size of the list is : " + size); //2

      //Clear all the elemets in the array list 

      fruits.clear();
      System.out.println("Cleared the Array list : " +fruits); //[]

      //Check if the array list is empty or not  after clearing the list
      isEmpty = fruits.isEmpty();
      System.out.println("Is the list is Empty after clearing : " + isEmpty); //True








        
    }
}