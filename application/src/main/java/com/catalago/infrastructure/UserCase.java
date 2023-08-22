package com.catalago.infrastructure;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class UserCase<IN, OUT> {
    public abstract OUT execute(IN anIn);

}