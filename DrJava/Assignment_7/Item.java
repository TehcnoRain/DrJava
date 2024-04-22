package Assignment_7; 
 
import BasicIO.*; 
import java.text.DecimalFormat; 

 // Shane Thomas
//5901368
 
public class Item{ 
   
  private String actNum; //Account Number
  private String name; //Name
  private double pv; //Previous
   
  public Item(ASCIIDataFile from) 
  { 
    actNum = from.readString(); 
 
    if(!from.isEOF()) 
    { 
      name = from.readString(); 
      pv = from.readDouble(); 
    } 
  } 
  public String getAccountNum()  
  { 
    return actNum; 
  } 
  public String getName() 
  { 
    return name; 
  } 
  public double getPrevious()  
  { 
    return pv; 
  } 
  public double charge(double num)  
  { 
    pv = Math.round((num - pv)*(1.525)*100)/100.0; // This makes the number round to two decimal places
    return pv; 
  } 
  public void write(ASCIIOutputFile to)  
  { 
    to.writeString(actNum); 
    to.writeString(name); 
    to.writeDouble(pv); 
    to.newLine(); 
  } 
}