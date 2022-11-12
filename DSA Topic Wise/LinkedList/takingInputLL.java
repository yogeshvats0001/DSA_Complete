import java.util.Scanner;

public class takingInputLL {

    static Scanner scan = new Scanner(System.in);

    static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        int data = scan.nextInt();
        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = scan.nextInt();
        }
        return head;
    }

    static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the data and -1 for ending the LL");
        Node<Integer> head = takeInput();
        print(head);
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
        next = null;
    }
}
