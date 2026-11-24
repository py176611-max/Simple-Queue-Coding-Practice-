/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

public class Main {
    int a[];
    int front, rear, max;

    Main(int size) {
        max = size;
        a = new int[max];
        front = rear = -1;
    }

    void enQueue(int ele) {
        if (rear == max - 1) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        }
        else {
            rear++;
        }

        a[rear] = ele;
    }

    void deQueue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted Element: " + a[front]);

        if (front == rear) {
            front = rear = -1;
        }
        else {
            front++;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void getFront() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Front: " + a[front]);
        }
    }

    void getRear() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Rear: " + a[rear]);
        }
    }

    public static void main(String[] args) {
        Main q = new Main(5);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.deQueue();

        q.enQueue(40);
        q.enQueue(50);

        q.display();
        q.getFront();
        q.getRear();
    }
}
