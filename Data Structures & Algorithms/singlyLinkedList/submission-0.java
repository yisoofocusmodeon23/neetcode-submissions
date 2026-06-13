class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if(head == null){
            return -1;
        }
        if(index >= size || index < 0){
            return -1;
        }
        Node curr = head;
        int currIdx = 0;
        while(curr != null && currIdx < index){
            curr = curr.next;
            currIdx++;
        }
        return curr.data;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        if(head.next == null){
            head.next = newNode;
            size++;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }

    public boolean remove(int index) {
        if(head == null){
            return false;
        }
        if(index >= size || index < 0){
            return false;
        }
        if(head.next == null && index == 0){
            head = null;
            size--;
            return true;
        }
        if(index == 0){
            head = head.next;
            size--;
            return true;
        }
        Node curr = head;
        int currIdx = 0;
        while(curr != null && currIdx < index - 1){
            curr = curr.next;
            currIdx++;
        }
        curr.next = curr.next.next;
        size--;
        return true;   
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            list.add(curr.data);
            curr = curr.next;
        }
        return list;
    }
}
