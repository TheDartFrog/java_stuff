

public class RPNStack {

    //////////////////////////////////////////////////
    public static boolean isEmpty;
    public static double poppedVal;
    private static Node top = null;
    //////////////////////////////////////////////////


//////////
    public static Node getTop() {
        return top;
    }
    public static void push(double d){
        if(top == null) {
            top = new Node(d);
        } else {
            top = new Node(d, top);
        }
    }
//////////
    public static double pop(){

        poppedVal = top.getVal();
        top = top.getNext();

        return poppedVal;
    }
//////////
    public static boolean empty(){
        if(top == null){
            isEmpty = true;
        } else { isEmpty = false;}

        return isEmpty;
    }
//////////
}
