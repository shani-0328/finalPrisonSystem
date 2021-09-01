/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

/**
 *
 * @author acer
 */
public class User1 {
    private int NO;
    private  String staff,first,last,age,birth,gen,post;
    private byte[] pic;
    
    public User1(int NO,String staff,String first,String last,String age,String birth,String gen,String post,byte[]pic)
    {
    this.NO=NO;
    this.staff=staff;
    this.first=first;
    this.last=last;
    this.age=age;
    this.birth=birth;
    this.gen=gen;
    this.post=post;
    this.pic=pic;
    }
    public int getNO(){
    return NO;
    }
    public String getid(){
    return staff;
    }
    public String getfir(){
    return first;
    }
    public String getlas(){
    return last;
    }
    public String getag(){
    return age;
    }
    public String getbir(){
    return birth;
    }
    public String getge(){
    return gen;
    }
    
    public String post(){
    return post;
    }
    
    public byte[] getpic(){
        return pic;
    }
    
}
