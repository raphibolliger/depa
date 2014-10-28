package kw41.parser;

public class FloatConverter2 {

    private String readDouble;

    private interface State
    {
        void checkDigit(char sign);
        void cancel();
    }


    abstract class AbstractState
    {

    }



}
