package deqo.assu;

public class EmptyStackException  extends Exception{
    public EmptyStackException() {
    }

    public EmptyStackException(String s) {
        super(s);
    }

    public EmptyStackException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public EmptyStackException(Throwable throwable) {
        super(throwable);
    }

    public EmptyStackException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
