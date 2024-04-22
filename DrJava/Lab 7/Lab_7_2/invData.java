package Lab_7_2;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class invData 
{
      ;
    private ReportPrinter report;
    private ASCIIDataFile dataFile;
    
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public invData ( )
    {
      String itemNum;
      int pt;
      int qut;
      int items = 0;
      report = new ReportPrinter();
      dataFile = new ASCIIDataFile();
      setUpReport();
           
      for(;; )
      {
      itemNum = dataFile.readString();
      if(dataFile.isEOF())break;
 
      pt = dataFile.readInt();
      qut = dataFile.readInt();
      
      if(qut<=pt)
      {
      report.writeString("itemNum", itemNum);
      report.writeInt("pt", pt);
        report.writeInt("qut", qut);
      items = items +1;
      report.newLine();
      }
      
      report.writeString("# Items to Reordered:");
      report.writeInt(items);
      }
      
      report.close();
      dataFile.close();

      
        // local variables
        
        // statements
        
    }; // constructor

    private void setUpReport()
    {
      report.setTitle("National Widgets", "Inventory Control");
      report.addField("itemNum", "Item #");
      report.addField("pt", "Record Pt");
      report.addField("qut", "Quantity");
    }
    
    // methods

    
    
    public static void main ( String[] args ) { invData o = new invData(); };
    
    
} // invData
