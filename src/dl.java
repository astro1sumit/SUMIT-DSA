public class dl {

    private Node head;
    private Node tail;
    private Node size;
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if (head != null){
            head.prev=node;
        }
        if(tail==null){
            tail=head;
        }
        head=node;
    }
public void insertlast(int value){
    if(tail==null){
        insertfirst(value);
        return;
    }
    Node node=new Node(value);
    tail.next=node;
    tail=node;
}
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+"->");
            last=node;
            node=node.next;
        }
        System.out.println("end");

        System.out.println("print in rev");
        while (last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }

        System.out.println("start");
    }
    private class Node{
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
