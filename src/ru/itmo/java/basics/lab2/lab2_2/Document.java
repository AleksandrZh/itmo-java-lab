package ru.itmo.java.basics.lab2.lab2_2;

public class Document {
    //Поля фасадного документа
    Title title = null;
    Body body = null;
    Footer footer = null;

    void InitializeDocument(){

        this.title = new Title();
        this.body = new Body();
        this.footer = new Footer();
    }

    public Document(String title){
        InitializeDocument();
        this.title.setContent(title);
    }

    public void Show(){
        this.title.Show();
        this.body.Show();
        this.footer.Show();
    }

    public void setBody(String body) {
        this.body.setContent(body);
    }

    public void setFooter(String footer) {
        this.footer.setContent(footer);
    }


}
