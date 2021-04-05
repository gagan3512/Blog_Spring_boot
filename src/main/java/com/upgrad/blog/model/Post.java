package com.upgrad.blog.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post { //post is the table name
    @Id
    private String id;  // primary key
    private String title;
    private String body;
    private Date date;

    public Post(String id, String title , String body , Date date)
    {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = date;
    }
    //public Post()
    //{
     //   super();
    //}

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
