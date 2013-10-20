
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    private Item p = new Item("xxx",  100);
    private DVD v = new DVD("Matilda","Disney",94);
    private CD c = new CD("Metallica", "Metallica",9,75);

        //Polymorphic creation
    private Item pv2 = new DVD("BFG","Disney",100);
    private Item pc2 = new CD("The Wall","Pink Floyd",8,70); 

    private Item p1, p2;
    private DVD v1;
    private CD c1;
    
    public void doTest()    
    {      
        p.getDirector();
        v.getDirector();
        c.getDirector();
        
        pv2.getDirector();
        pc2.getDirector();
        
        ((DVD)pv2).getDirector();
        ((DVD)pc2).getDirector();
        
        p1 = p;
        p1.getDirector();
        p1 = v;
        p1.getDirector();
        p1 = c;
        p1.getDirector();        
    }
}
