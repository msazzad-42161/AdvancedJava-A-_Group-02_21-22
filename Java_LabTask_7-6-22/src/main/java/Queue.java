import java.util.ArrayList;

public class Queue<T> {
    private int front = -1;
    private int rear = -1;

    private ArrayList<T> queueArray;

    private int queueSize = 0;
    public Queue(int queueSize) {
        this.queueSize=queueSize;
        queueArray = new ArrayList<>(this.queueSize);
    }


    // get front element of a queue
    T front(){
        if(front==-1){
            return null;
        }
        else{
            return queueArray.get(front);
        }
    }

    T rear(){
        if(rear == -1){
            return null;
        }
        else{
            return queueArray.get(rear);
        }
    }
    boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        else {
            return false;
        }
    }
    boolean isFull(){
        if ((rear+1) % queueSize == 0){
            return true;
        }
        else {
            return false;
        }
    }

    void enq(T item){
        if(this.isEmpty()){
            front = 0;
            rear = 0;
            queueArray.add(item);
        }
        else if(this.isFull()){
            System.out.println("Queue overflow!");
        }
        else{
            front++;
            if(queueArray.size() > front){
                queueArray.set(front,item);
            }
            else{
                queueArray.add(item);
            }
        }
    }

    void deq(){
        if(this.isEmpty()){
            System.out.println("The queue is already empty.");
        } else if (front==rear) {
            front = rear -1;
        }
        else {
            rear++;
        }
    }


    public String showQueueString(){
        if(this.isEmpty()){
            return "";
        }
        String queueString = "";
        for (int i = rear; i < front; i++) {
            queueString += "{"+String.valueOf(queueArray.get(i))+"}"+ " => ";
        }
        queueString += "{"+String.valueOf(queueArray.get(front))+"}";
        return queueString;
    }

}
