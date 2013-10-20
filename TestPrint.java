/** Testing print methods
 * No print method in Item.
 * Reduced print methods in DVD and CD
 */

public class TestPrint
{
    private DVD v; 
    private CD c = new CD("Metallica", "Metallica",9,75);
    private Item p = new Item("xxx",  100);
    
    public TestPrint()
    {
        v = new DVD("Matilda","Disney",94);
    }
    
    public void doTestPrint()
    {         
        p.setComment("Not Sure");
        v.setComment("Wicked");
        c.setComment("Loud");
        System.out.println("***print Item***");
        p.print(); 
        System.out.println("***print DVD***");
        v.print();
        System.out.println("***print CD***");
        c.print();
    } 
}
