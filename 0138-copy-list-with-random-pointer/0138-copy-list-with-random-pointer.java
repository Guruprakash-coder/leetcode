/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Map<Node,Node> m=new HashMap<>();
        Node node=head;
        while(node!=null){
            m.put(node,new Node(node.val));
            node=node.next;
        }

        node=head;
        while(node!=null){
            m.get(node).next=m.get(node.next);
            m.get(node).random=m.get(node.random);
            node=node.next;
        }
        return m.get(head);
    }
}