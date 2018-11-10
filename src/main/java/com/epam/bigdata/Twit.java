package com.epam.bigdata;

public class Twit {

    private String id;
    private String text;
    private int lenght;

    public Twit(String text, String id) {
        this.text = text;
        this.id = id;
        this.lenght = text.length();
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Twit{");
        sb.append("id='").append(id).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", lenght=").append(lenght);
        sb.append('}');
        return sb.toString();
    }
}
