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


    @Test
    public void isEmpty(){
        assertTrue("pile vide", stack.isEmpty());

        stack2.push(new Item("dfg_fin"));
        assertFalse("pile non vide", stack2.isEmpty());
    }

    @Test
    public void getSize() {
        stack1.push(new Item("getsize"));
        assertEquals("test du getsize",1, stack1.getSize());
    }

    @Test
    public void push() {
        stack1.push(new Item("truccuu"));
        assertEquals("push effectué", 1, stack1.getSize());
        assertFalse("verifier liste", stack1.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void peek() throws EmptyStackException {
        stack1.push(new Item("test"));
            assertEquals(stack2.peek(), stack1.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void pop() throws EmptyStackException {
        SimpleEssai stack3 =  new SimpleEssai();
        stack3.pop();
        //assertEquals("sample",stack2.pop());
    }

}