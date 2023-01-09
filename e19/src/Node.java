public class Node {
    private double val;
    private Node next;

    public double getVal() {
        return val;
    }
    public Node getNext() {
        return next;
    }

    public Node(double val, Node next){
        this.val=val;
        this.next=next;
    }
    public Node(double val){
        this(val,null);
    }
}