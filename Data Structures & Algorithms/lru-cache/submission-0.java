class LRUCache {
    class Node {
        int key,val;
        Node prev,next;
        Node(int key, int value){
            this.key = key;
            this.val = value;
        }
    }
    HashMap<Integer,Node> lru;
    Node head,tail;
    int cap;

    public LRUCache(int capacity) {
        lru = new HashMap<>();
        cap = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!lru.containsKey(key)) return -1;

        Node node = lru.get(key);

        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        head.next.prev = node;
        node.prev= head;
        head.next = node;
        return node.val;

        
    }
    
    public void put(int key, int value) {
        if(lru.containsKey(key)) {
           Node node = lru.get(key);
           node.val = value;
           
           node.prev.next = node.next;
         node.next.prev = node.prev;

        node.next = head.next;
        head.next.prev = node;
        node.prev= head;
        head.next = node;
        return;
        
        }
        if(lru.size() == cap ){
            Node r = tail.prev;
            lru.remove(r.key);
            r.prev.next = tail;
            tail.prev = r.prev;
            r.prev = null;
            r.next = null;
        }
        
        Node now = new Node(key,value);
        lru.put(key,now);
        now.next = head.next;
        head.next.prev = now;
        now.prev = head;
        head.next = now;
        //cap--;
    }
}
