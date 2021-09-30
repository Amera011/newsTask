package com.example.news;

public class newsObj {
    public newsObj(String title,String details,int image){
        this.title=title;
        this.details=details;
        this.image=image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDetails() {
        return details;
    }

    private  String title ;
    private  int image ;
    private  String details;


}
