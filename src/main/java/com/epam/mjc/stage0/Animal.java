package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.hasFur = hasFur;
        this.numberOfPaws = numberOfPaws;
    }

    public String getDescription() {
        String furArticle = "a";
        if (this.hasFur == false) {
            furArticle = "no";
        }
        String pawEnding = "";
        if (this.numberOfPaws != 1){
            pawEnding = "s";
        }

        return String.format("This animal is mostly %s. It has %d paw%s and ",this.color,this.numberOfPaws,pawEnding) + furArticle +
                " fur.";
    }
}
