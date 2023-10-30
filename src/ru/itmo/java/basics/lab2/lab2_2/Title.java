package ru.itmo.java.basics.lab2.lab2_2;

public class Title {

    private String content;
    private String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void Show(){
        System.out.println(getContent());
    }



}
