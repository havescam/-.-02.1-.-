//Пример списка на java
LinkedList<String> linkedList = new LinkedList<>();  
linkedList.add("first");  
linkedList.add("second");  
linkedList.add("third");  
linkedList.add(1, "new element");    
linkedList.remove(2);    
String element = linkedList.get(0);    
for (String s : linkedList) {  
    System.out.println(s);  
}  

    }
}


//Пример стека на java
import java.util.Stack;  
public class StackExample {  
public static void main(String args) {   
Stack<Integer> stack = new Stack<>();   
stack.push(10);  
stack.push(20);  
stack.push(30);  
int poppedElement = stack.pop();  
System.out.println("Popped element: " + poppedElement);  
int topElement = stack.peek();  
System.out.println("Top element: " + topElement);  
}  
}  
