class NamedCow extends Cow
{
 private String myType;     
 private String mySound;   
 private String myName;
public NamedCow(String type, String sound, String name) {
	myType = type;         
    mySound = sound;    
    myName = name;
}
public NamedCow()     {         
         myType = "Cow";         
         mySound = "Moo";   
         myName = "Elsie";  
     }      
     public String getSound(){return mySound;}     
     
}
