package linkedlist;

public class lnked {

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addbg(1);
        l1.addbg(2);
        l1.addbg(3);
        l1.display();
    }
}

//dATATYPE
class node{
    int data ;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}


//FRAMEWORK
class linkedlist{
    node head = null;

    void addbg(int d){
        node nn = new node(d);
        nn.next = head;
        head = nn;
    }
    
    void addlast(int d){
        node nn = new node(d);
        node temp = head;
        while (temp.next != null) {  
            temp = temp.next;
        } 
        temp.next = nn;
    }
    
    void delfirst(){
        head = head.next;
    }
    
    void dellast(){
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        } 
        temp.next = null;
    }
    void display(){
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        } 
    }
}