package deqo.assu;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SimpleEssaiTest {

    SimpleEssai stack;
    SimpleEssai stack1;
    SimpleEssai stack2;
    @Before
    public void init_stack(){
        stack = new SimpleEssai();
        stack1 = new SimpleEssai();
        stack2 = new SimpleEssai();
    }


    @Test(expected = EmptyStackException.class)
    public void isEmpty() throws EmptyStackException {
        assertTrue("pile vide", stack.isEmpty());
        stack2.push(new Item("dfghj"));
        assertFalse("pile non vide", stack2.isEmpty());
        stack1.push(new Item("ererz"));
        stack1.pop();
        assertFalse("pile vide", stack1.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(1, 1);
    }

    @Test
    public void push() {
        stack1.push(new Item("truccuu"));
        assertEquals("push effectué", 1, stack.getSize());
    }

    @Test
    public void peek() {
        stack1.push(new Item("test"));
        assertEquals("test", "dfgl");
    }

    @Test(expected = EmptyStackException.class)
    public void pop() throws EmptyStackException {
        assertEquals("sample",stack2.pop());
    }

}