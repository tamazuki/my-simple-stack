package deqo.assu;
import java.util.*;
import java.util.Stack;

public class SimpleEssai implements SimpleStack{
    ArrayList <Item>  array;

    public SimpleEssai (){
        this.array = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public void push(Item item) {
        array.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(array.isEmpty()){
            throw new EmptyStackException();
        }
        return array.get(getSize()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(array.isEmpty()){
            throw new EmptyStackException();
        }
        Item temp = peek();
        array.remove(getSize()-1);
        return temp;
    }
}
