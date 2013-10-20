
/** Tests polymorphic creation and assignment
 * Expect compilation errors
 * @author A.A.Marczyk 
 * @version 14/10/2010
 */
public class TestPoly1Ans
{
    public static void doTestPoly()
    {
        // Which of these statements would cause compilation errors ???
        Item p = new Item("xxx",  100);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);

        //Polymorphic creation
        Item pv2 = new DVD("BFG","Disney",100);
        Item pc2 = new CD("The Wall","Pink Floyd",8,70); 

       // DVD vi3 = new Item("xxx",  100);
       // CD ci3 = new Item("xxx",  100);
       // DVD vc4 = new CD("Metallica","Metallica",9,75);
 
        Item p1, p2;
        DVD v1;
        CD c1;
    
        // Polymorphic assignment 
        p1 = p ;        
        v1 = v ;        
        c1 = c; 
        
        p1 = v;         
        p2 = c;         

        // v1 = p;       
        // c1 = p;       
        // v1 = c;       

        // v1 = pv2;      
        // c1 = pc2;
        
        // method calls - what will happen ?
        System.out.println("***print Item***");
        p.print(); 
        System.out.println("***print DVD***");
        v.print();
        System.out.println("***print CD***");
        c.print();  
        
        System.out.println("***What gets printed***");
        System.out.println("***pv2 - static:Item, dynamic:DVD***");
        pv2.print(); 
        System.out.println("***pv2 re-assigned a CD pc2 ***");
        pv2 = pc2;
        pv2.print(); 
        System.out.println("***pv2 re-assigned a DVD***");
        pv2 = v;

        System.out.println("\nPrinting the comments using superclass method");
        p.setComment("A good one");
        v.setComment("Ear splitting!");
        System.out.println(p.getComment());
        System.out.println(v.getComment());
        System.out.println(c.getComment());

        // Which method calls will not compile ?     
        String s; 
        // s = p.getArtist();   
        // s = v.getArtist();    
        s = c.getArtist();
        // s = c.getDirector(); 

        // s = pc2.getArtist();  
        // s = pv2.getDirector();
   
    }

}



