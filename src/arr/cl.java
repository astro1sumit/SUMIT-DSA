package arr;

public class cl {
    public class dl {

        private Node head;
        public void insertfirst(int value){
            Node node=new Node(value);
            node.next=head;
            node.prev=null;
            if (head != null) {
                head.prev=node;
            }
            head=node;
        }
        public void insertlast(int value){
            Node node= new Node(value);
            Node last=head;
            node.next=null;
            if(head==null){
                node.prev=null;
                head=node;
                return;
            }
            while (last.next!=null){
                last=last.next;
            }
            last.next=node;
            node.prev=last;
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
            if(head!=null){
                last.next=head;
                head.prev=last;
            }
            System.out.println("start");
        }
        private class Node{
            int value;
            Node next;
            Node prev;
            Node last;


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
}
