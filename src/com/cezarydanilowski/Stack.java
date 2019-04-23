package com.cezarydanilowski;

import java.lang.*;
import java.util.*;

public class Stack {

    private int howManyElements;
    private String[] elements;
    private static int lastIndex = 0;

    public Stack(int howManyElements) {
        this.howManyElements = howManyElements;
        this.elements = new String[howManyElements];
    }

    public void printStack() {
        for (int i = howManyElements - 1; i >= 0; i--) {
            if (elements[i] != null) {
                System.out.println(elements[i]);
            } else {
                System.out.println();
            }
        }
    }

    public void push(String number) {
        if (lastIndex == howManyElements) {
            System.out.println("Stack's full!");
        } else {
            elements[lastIndex] = number;
            lastIndex += 1;
        }
    }

    public void pop() {
        if (lastIndex < 1) {
            System.out.println("Nothing to pop!");
        } else {
            elements[lastIndex - 1] = null;
            lastIndex -= 1;
        }
    }

    public int getSize() {
        int size = 0;

        for (String e : elements) {
            if (e != null)
                size += 1;
        }

        return size;
    }

    public boolean isEmpty() {
        boolean empty = true;

        for (String e : elements) {
            if (e != null)
                empty = false;
        }

        return empty;
    }
}
