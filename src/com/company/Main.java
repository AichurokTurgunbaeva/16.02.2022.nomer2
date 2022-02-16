package com.company;

public class Main {

    public static void main(String[] args) {

       Baked[] baked = {new Nan(), new Bulochka(), new Pirog()};
       for(Baked b: baked) {
           b.baking();
       }
    }
}
