class CDLLNode{
    int key,val;
    CDLLNode prev,next;
    public CDLLNode(int k,int v){
        key=k;
        val=v;
        prev=this;next=this;
    }
}
class CDLL{
    CDLLNode head=null;
    int removeLast()
    {
        if(head==null)
        {
            return -1;
        }
        CDLLNode remNode =head.prev;
        if(remNode==head)
        {
            int rvt=remNode.key;
            head=null;
            return rvt;
        }
        else
        {
            int rvt=remNode.key;
            remNode.prev.next=head;
            head.prev=remNode.prev;
            return rvt;
        }
    }
    CDLLNode insertBegin(int key,int value){
        CDLLNode newNode=new CDLLNode(key,value);
        if(head==null){
            head=newNode;
        }
        else{
            CDLLNode last=head.prev;
            newNode.prev=last;
            last.next=newNode;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            //head.prev=last;
        }
        return newNode;
    }
    void moveToFront(CDLLNode node){
        if(node==head){
            return;
        }
        else{
            node.prev.next=node.next;
            node.next.prev=node.prev;
            CDLLNode last=head.prev;
            node.prev=last;
            last.next=node;
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
}
class LRUCache {
    int cap,sz;
    CDLL ll=null;
    Map<Integer,CDLLNode> map=new HashMap<>();
    public LRUCache(int capacity) 
    {
        ll=new CDLL();
        this.cap=capacity;
        this.sz=0;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        CDLLNode node=map.get(key);
        ll.moveToFront(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {//update
            CDLLNode node=map.get(key);
            node.val=value;
            ll.moveToFront(node);
        }
        else
        {
            if(sz<cap)
            {
                CDLLNode node =ll.insertBegin(key,value);
                map.put(key,node);
                sz++;
            }
            else
            {
                int k=ll.removeLast();
                map.remove(k);
                CDLLNode node =ll.insertBegin(key,value);
                map.put(key,node);
            }
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */