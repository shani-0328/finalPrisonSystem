package Secure;
class User3{

private  String security,first,last,age,casee,type,codate,nature,description;
private byte[] casepic;

public User3 (String security,String first,String last,String age,String casee,String type,String codate,String nature,String description,byte[]casepic) 
 {
    this.security=security;
    this.first=first;
    this.last=last;
    this.age=age;
    this.casee=casee;
    this.type=type;
    this.codate=codate;
    this.nature=nature;
    this.description=description;
    this.casepic=casepic;
    }
public String getNo(){
    return security;
    }
public String getfirst(){
    return first;
    }
public String getLast(){
    return last;
    }
public String getAge(){
    return age;
    }
public String getCase(){
    return casee;
    }
public String getType(){
    return type;
    }
public String getCourt(){
    return codate;
    }
public String getNature(){
    return nature;
    }
public String getDes(){
    return description;
    }
public byte[] getCasepic(){
        return casepic;
    }
}

