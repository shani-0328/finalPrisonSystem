/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;



class User {
    private int No;
    private  String SecurityNo,FirstName,LastName,Age,DateOfBirth,Gender,BookingNo,Type,BookingDate,ReleaseDate,ReleaseCharge;
    private byte[] picture;
    
    public User(int No,String SecurityNo,String FirstName,String LastName,String Age,String DateOfBirth,String Gender,String BookingNo,String Type,String BookingDate,String ReleaseDate,String ReleaseCharge,byte[]image)
    {
    this.No=No;
    this.SecurityNo=SecurityNo;
    this.FirstName=FirstName;
    this.LastName=LastName;
    this.Age=Age;
    this.DateOfBirth=DateOfBirth;
    this.Gender=Gender;
    this.BookingNo=BookingNo;
    this.Type=Type;
    this.BookingDate=BookingDate;
    this.ReleaseDate=ReleaseDate;
    this.ReleaseCharge=ReleaseCharge;
    this.picture=image;
    }
    public int getNo(){
    return No;
    }
    public String getsec(){
    return SecurityNo;
    }
    public String getfirst(){
    return FirstName;
    }
    public String getlast(){
    return LastName;
    }
    public String getage(){
    return Age;
    }
    public String getbirth(){
    return DateOfBirth;
    }
    public String getgen(){
    return Gender;
    }
    public String getbookNo(){
    return BookingNo;
    }
    public String gettype(){
    return Type;
    }
    
    public String getbook(){
    return BookingDate;
    }
    
    public String getRe(){
    return ReleaseDate;
    }
    public String getcharg(){
    return ReleaseCharge;
    }
    public byte[] getImage(){
        return picture;
    }
}
