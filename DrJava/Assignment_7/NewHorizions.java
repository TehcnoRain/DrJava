package Assignment_7; 
 
import java.util.*; 
import BasicIO.*; 
import static BasicIO.Formats.*; 
import java.text.DecimalFormat; 
  
   // Shane Thomas
  //5901368
                                                 
 
public class NewHorizions { 
     
     
    private ASCIIDataFile    invData;     // data file for inventory info 
    private ASCIIPrompter    prompt;      // prompter for user input 
    private ASCIIOutputFile  newInvData;  // data file for updated inventory info 
    private ReportPrinter    report;      // printer for report 
    private BasicForm        display;
     
    /** The constructor creates the basic form with a title and buttons.         */ 
     
    public NewHorizions ( )
    { 
        Item   item; //Item
        String name; //Name
        double cr; //Current amount
        double pv; //Previous amount
        double charge; //charge         
        double total;  // Total Charge
             
        invData = new ASCIIDataFile(); 
        prompt = new ASCIIPrompter(); 
        newInvData = new ASCIIOutputFile(); 
        report = new ReportPrinter(); 
        display = new BasicForm();        
        setUpReport(); 
        buildForm(); 
        total = 0;
        
        for ( ; ; ) 
        { 
          item = new Item(invData);
          
        if ( invData.isEOF() ) break; 
        {
            fillForm(item); 
            display.accept(); 
            cr = display.readDouble("cr"); 
            pv = item.getPrevious(); 
            charge = item.charge(cr);     
            name = item.getName(); 
            writeDetail(item,pv,cr); 
            item.write(newInvData); 
            total+=charge;   
        }
        
        }; 
        
        total = Math.round(total*100)/100.0; // This makes the number round to two decimal places
        writeSummary(total);                 
        display.close(); 
        invData.close(); 
        newInvData.close(); 
        prompt.close(); 
        report.close(); 
         
    };  // constructor 
    
        
    private void buildForm() 
    { 
      display.addTextField("itemNum","Account #",6,10,10); 
      display.setEditable("itemNum",false); 
      display.addTextField("name","Name",16,10,40); 
      display.setEditable("name",false); 
      display.addTextField("pv","Previous Reading",5,10,70); 
      display.setEditable("pv",false); 
      display.addTextField("cr","Current Reading",5,10,100); 
    } //buildForm
    
    private void fillForm(Item item) 
    { 
      display.writeString("itemNum",item.getAccountNum()); 
      display.writeString("name",item.getName()); 
      display.writeDouble("pv",item.getPrevious()); 
      display.clear("cr"); 
    } //fillForm
    
    private void writeDetail ( Item item, double pv,double cr ) 
    { 
        report.writeString("acnt",item.getAccountNum()); 
        report.writeString("name",item.getName()); 
        report.writeDouble("pv",pv); 
        report.writeDouble("cr",cr); 
        report.writeDouble("charge",item.getPrevious()); 
         
    }; //writeDetail
    
    private void writeSummary ( double total ) 
    {        
     report.writeLine("Total Billed: $"+total);          
    };  // writeSummary 
 
    private void writeInvData ( Item item ) 
    {  
        newInvData.writeString(item.getAccountNum()); 
        newInvData.writeString(item.getName()); 
        newInvData.writeDouble(item.getPrevious()); 
        newInvData.newLine(); 
         
    };  // writeInvData 
    
    private void setUpReport()
    {
      report.setTitle("Over the Horizon Utilities", "Billing Report"); 
      report.addField("acnt", "Account #",9); 
      report.addField("name", "Name",20); 
      report.addField("pv", "Previous",8); 
      report.addField("cr", "Current",10);
      report.addField("charge", "Charge",8); 
    } //setUpReport

    public static void main ( String[] args ) { NewHorizions i = new NewHorizions(); }; 
     
     
} //  NewHorizions