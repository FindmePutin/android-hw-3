package com.example.android.listviewproject;

import java.io.Serializable;

class Items implements Serializable {

    String textFood;
    int imagefood;
    double textPrice;

    public String getTextFood() {
        return textFood;
    }

    public void setTextFood(String textFood) {
        this.textFood = textFood;
    }

    public int getImagefood() {
        return imagefood;
    }

    public void setImagefood(int imagefood) {
        this.imagefood = imagefood;
    }

    public double getTextPrice() {
        return textPrice;
    }

    public void setTextPrice(double textPrice) {
        this.textPrice = textPrice;
    }

    public Items(String textFood, int imagefood, double textPrice) {
        this.textFood = textFood;
        this.imagefood = imagefood;
        this.textPrice = textPrice;


    }
}