class CPUS {
    int price;
    CPUS(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(double core,String manufcturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"TB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class cpu
{
    public static void main(String ...a)
    {
        CPUS c = new CPUS(20000);
        CPUS.processor pr=c.new processor(6,"tony william");
        new CPUS.RAM(1,"tony william");

    }
}