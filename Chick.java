class Chick implements Animal {     
     private String myType;     
     private String mySound;  
     private String chickSound;    
     public Chick(String type, String sound , String soundType)     {         
         myType = type;         
         mySound = sound;     
         chickSound = soundType;
     }     
     public Chick()     {         
         myType = "Chick"; 
         
     
     }      
        
     public String getType(){
     	return myType;} 

     public String getSound(){	
     	if(Math.random()< 0.5){
         	mySound = "Cluck";
         }
         else mySound = "Cheep";
     	return mySound;}
}     