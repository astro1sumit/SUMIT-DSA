public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

     public void insertfirst(int value){
        Node node= new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
     }
     public void inserttail(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
     }

     public void insert(int value, int index){
        if(index==0){
            insertfirst(value);
            return;
        }
        if(index==size){
            inserttail(value);
            return;
        }

        Node temp=head;
         for (int i = 1; i <index ; i++) {
             temp = temp.next;
         }

         temp.next= new Node(value,temp.next);
         size++;
    }

    public int deletefirst(){
        int value = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast=get(size-2);
        int value= tail.value;
        tail=secondlast;
        tail.next=null;
        return value;
    }
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;

        return value;
    }

    public boolean search(int value){
        Node node=head;
        for(int i=0;i<size;i++){
            node=node.next;
            if(node.value==value){
                return true;
            }
        }
        return false;
    }

    public  Node find(int value){
        Node node=head;
        while (node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public  Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

     public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
         System.out.println("end");
     }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}