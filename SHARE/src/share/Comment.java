package share;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String author;
  private int minute;
  private int hour;
  private int day;
  private int month;
  private int year;
  private String description;
  private String url;


  public Comment(String author, String description,int minute,int hour,int day,int month,int year,String url) {
    this.author = author;
    this.description = description;
    this.url = url;
    this.minute = minute;
    this.hour = hour;
    this.day = day;
    this.month = month;
    this.year = year;

  }

  public Long getId() {
    return id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getLongDescription() {
    return description;
  }

  public void setLongDescription(String longDescription) {
    this.description = longDescription;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
  
  public int getminute() {
	    return minute;
	  }

  public void setminute(int a) {
	    this.minute = a;
	  }
  
  public int gethour() {
	    return hour;
	  }

  public void sethour(int a) {
	    this.hour = a;
	  }
  
  public int getday() {
	    return day;
	  }

  public void setday(int a) {
	    this.day = a;
	  }
  
  public int getmonth() {
	    return month;
	  }

  public void setmonth(int a) {
	    this.month = a;
	  }
  
  public int getyear() {
	    return year;
	  }

  public void setyear(int a) {
	    this.year = a;
	  }
  
  public void toString(){
	  println(id+": a "+hour+":"+minute+"le "+day+"/"+month+"/"+year+" par "+author);
	  println(description);
  }



} 

