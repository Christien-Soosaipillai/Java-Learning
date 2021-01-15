package com.christien.javaeight.unit4;

public class Add implements Operation{

    @Override
    public Integer calculate(Integer a, Integer b) {

        //Lambda Expression: method without a name
        Operation lambdaOperation = (c, d) -> {
            Integer number = 1;
            number = this.someNum + 6;         //Works here since context is not static
            return number;
        };
        return lambdaOperation.calculate(1,3);

//        return a + b;
    }
}
