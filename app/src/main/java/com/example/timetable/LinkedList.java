package com.example.timetable;

import java.io.Serializable;

class I2node implements Serializable{
    String day;
    int time;
    I2node next;
    I2node(String day,int time){
        this.day=day;
        this.time=time;
        this.next=null;
    }
}
class Node implements Serializable{
    Node(String Course,I1node y){
        this.Course=Course;
        this.next=null;
        this.i1=y;
    }
    String Course;
    I1node i1;
    Node next;
}
class I1node implements Serializable{
    String Slot;
    I2node i2;
    I1node next;
    I1node(String Slot,I2node i2){
        this.Slot=Slot;
        this.i2=i2;
        this.next=null;
    }
}
@SuppressWarnings("serial")
public class LinkedList implements Serializable {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void add(String data,I1node x) {
        Node newNode = new Node(data, x);
        newNode.next = head;
        head = newNode;
    }
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.printf("\n"+current.Course + "\n");
            I1node current1=current.i1;
            while(current1!=null){
                System.out.print(current1.Slot+"\n");
                I2node current2=current1.i2;
                while(current2!=null){
                    System.out.print(current2.day+"--"+current2.time+"\n");
                    current2=current2.next;
                }
                current1=current1.next;
            }
            current = current.next;
        }
    }
}
class LinkedListi1 implements Serializable{
    I1node head;

    LinkedListi1() {
        this.head = null;
    }

    void add(String data, I2node v) {
        I1node newNode = new I1node(data, v);
        newNode.next = head;
        head = newNode;
    }
}
class LinkedListi2 implements Serializable{
    I2node head;

    LinkedListi2() {
        this.head = null;
    }

    void add(String day, int time) {
        I2node newNode = new I2node(day, time);
        newNode.next = head;
        head = newNode;
    }
}