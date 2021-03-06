package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void isEmptyTest(){

        IntLinkedList linkedList = new IntLinkedList();

        Boolean result = linkedList.isEmpty();

        Assert.assertTrue(result);

        linkedList.push(1);
        result = linkedList.isEmpty();

        Assert.assertFalse(result);

    }

    @Test
    public void topTest(){

        IntLinkedList linkedList = new IntLinkedList();

        final int[] TEST_VALUES = {3,2,1};

        for(int value : TEST_VALUES){
            linkedList.push(value);
            Assert.assertEquals(value,linkedList.top());
        }

        Assert.assertNotEquals(4,linkedList.top());

    }

    @Test
    public void popTest(){

        IntLinkedList linkedList = new IntLinkedList();

        final int TEST_VALUE = 1;

        Assert.assertTrue(linkedList.isEmpty());

        linkedList.push(TEST_VALUE);

        Assert.assertFalse(linkedList.isEmpty());

    }

}
