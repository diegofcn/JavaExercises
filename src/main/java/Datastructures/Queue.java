package Datastructures;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if(rear < maxSize - 1) {
            queueArray[++rear] = value;
            System.out.println("Inserted " + value);
        } else {
            System.out.println("Queue is full!");
        }
    }

    public void dequeue() {
        if (front <= rear) {
            System.out.println("Removed " + queueArray[front++]);
            if (front > rear) {
                front = 0;
                rear = -1;
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public int peek(){
        if(front <= rear) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (rear < front);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("First element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

}
