import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> stackArray;
    int top = -1;


    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new ArrayList<T>(this.stackSize);
    }
    private int stackSize = 0;

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int getStackSize(){
        return this.stackSize;
    }

    //Push method
    void push(T item){
        if(top + 1 == this.stackSize){
            System.out.println("Stack overflow!");
        }
        else{
            //increment item
            top +=1;

            //overwriting element at position index 'top'
            if (stackArray.size()>top){
                stackArray.set(top,item);
            }
            //creating a new element
            else{
                stackArray.add(item);
            }
        }
    }

    //get the top element of the stack
    T top(){
        if(top == -1){
            System.out.println("Stack overflow");
            return null;
        }

        else {
            return stackArray.get(top);
        }
    }


    // pop -> delete the top element of the stack array
    void pop(){

        //when stack is empty
        if(this.isEmpty()){
            System.out.println("Stack underflow");
        }
        else {

            //delete the last element
            top--;
        }
    }

    //check if stack is empty or not
    boolean isEmpty(){
        return top == -1;
    }

    //print the stack
    public String showStackString(){
        String stack = "";
        for (int i = 0; i <top ; i++) {
            stack += "{"+String.valueOf(stackArray.get(i))+"}"+ " => ";
        }
        stack += "["+String.valueOf(stackArray.get(top))+"]";
        return stack;
    }
}
