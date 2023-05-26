package com.example.sudokuappsolver;

public class Item {
    String name;
    String tag;
    int image;

    public Item(String name,String tag, int image) {
        this.name = name;
        this.image = image;
        this.tag = tag;
    }


    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
