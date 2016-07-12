public void addToHead(int val){ //addToHead is my method
  if( head.data == null ){
    System.out.println("Adding first item");
    head.data = val;
    head.next = tail;
    head.prev = null;
    tail = head;
  } else if(tail == head){
    System.out.println("Adding second item");
    Node newNode = new Node(val);
    tail.prev = newNode;
    newNode.next = tail;
    head = newNode;
  } else {
    System.out.println("Adding third item");
    Node newNode = new Node(val);
    head.prev = newNode;
    newNode.next = head;
    head = newNode;
  }
}
