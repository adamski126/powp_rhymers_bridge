package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class DefaultCountingOutRhymer {
    IntStorageInterface intStorageInterface;

    public DefaultCountingOutRhymer(){
        intStorageInterface = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntStorageInterface intStorageInterface) {
        this.intStorageInterface = intStorageInterface;
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        intStorageInterface.push(in);
    }

    public boolean callCheck() {
        //return intArrayStack.callCheck();
        return intStorageInterface.isEmpty();
    }

    public boolean isFull() {
        //return intArrayStack.isFull();
        return intStorageInterface.isFull();
    }

    public int peekaboo() {
        //return intArrayStack.top();
        return intStorageInterface.top();
    }

    public int countOut() {
        //return intArrayStack.pop();
        return intStorageInterface.pop();
    }
}
