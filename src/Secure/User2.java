/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
class User2{
private int No;
private  String NICno,Name,Age,Gender,Time;

public  User2 (int No,String NICNo,String Name,String Age,String Gender,String Time){
    this.No=No;
    this.NICno=NICNo;
    this.Name=Name;
    this.Age=Age;
    this.Gender=Gender;
    this.Time=Time;
    }
public int getNo(){
    return No;
    }
public String getNIC(){
    return NICno;
    }
public String getName(){
    return Name;
    }
public String getAge(){
    return Age;
    }
public String getGen(){
    return Gender;
    }
public String getTime(){
    return Time;
    }
}
