package org.nhtzr.datastructures;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ezequiel on 3/3/2016.
 */
public class LinkedListTest {

    @Test
    public void test() {
        LinkedList<String> list = new LinkedList<>();
        list.push("Primero");
        list.push("Segundo");
        list.push("Tercero");
        list.push("Cuarto");

        testCopy(list);
        printList(list);

        Assert.assertEquals("Cuarto", list.pop());
        Assert.assertEquals("Tercero", list.pop());
        Assert.assertEquals("Segundo", list.pop());
        Assert.assertEquals("Primero", list.pop());
        Assert.assertNull(list.top());
        Assert.assertNull(list.pop());
    }

    private void testCopy(LinkedList<String> list) {
        String top = list.top();
        Assert.assertNotNull(top);
        Assert.assertNotNull(list.copy().pop());
        Assert.assertEquals(top, list.top());
    }

    private void printList(LinkedList<String> list) {
        System.out.println("Contenidos: ");
        for (String s : list) {
            System.out.println("| " + s);
        }
    }

}
