public class linkedlist {
    public static void main(String[] args) {


        LL list = new LL();
        list.insertfirst(30);
        list.insertfirst(31);
        list.insertfirst(32);
        list.insertfirst(33);
        list.insertfirst(34);
        list.inserttail(29);
        list.inserttail(28);
        list.insert(20,3);
        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.get(3));
        System.out.println(list.search(29));
        System.out.println(list.deletelast());
        list.display();
        System.out.println(list.delete(2));
        System.out.println(list.find(32));
        }
}

