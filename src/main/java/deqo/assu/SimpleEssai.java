package deqo.assu;import java.util.*;
import java.util.*;

public class SimpleEssai implements SimpleStack{
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

        Stack st = new Stack();
        st.push("Java");
        st.push("Source");
        st.push("code");
        System.out.println("Elements in the stack: "+st);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
