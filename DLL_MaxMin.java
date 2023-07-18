package is111;

public class MinMax {  
    
    class Node
    {  
        int data;  
        Node prev;  
        Node next;  
  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }
    Node head= null;  
  
    
    public void insert(int data) {  
    
        Node newNode = new Node(data);  
  
        newNode.next = head;
        newNode.prev = null;
     
        if (head != null)
            head.prev = newNode;
     
        head = newNode; 
    }  
    
    public int min() {  
       
        Node current = head;  
        int min;  
  
       if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
           
            min = head.data;  
            while(current != null) {  
              
  
                if(min > current.data)  
                    min = current.data;  
                current = current.next;  
            }  
        }  
        return min;  
    }  
  
    
    public int max() {  
        
        Node current = head;  
        int max;  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            
            max = head.data;  
            
            while(current != null) {  
                if(current.data > max)  
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
  
    public static void main(String[] args) {  
  
        MinMax obj = new MinMax();   
        obj.insert(15);  
        obj.insert(69);  
        obj.insert(19);  
        obj.insert(13);  
        obj.insert(21);  

        System.out.println("Minimum value node in the list: "+ obj.min());  
         
        System.out.println("Maximum value node in the list: "+ obj.max());  
    }  
}
