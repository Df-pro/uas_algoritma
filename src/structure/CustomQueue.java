/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

/**
 *
 * @author dwife
 */
public class CustomQueue {
    private Node front;
    private Node rear;

    public CustomQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }

        String data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }
}
