import java.util.Scanner;

class DistanceConverter 
{
        int miles;
        int yards;
        double kilometers;

    public DistanceConverter ( int txtmiles ,int txtyards )        
    {
        miles = txtmiles;
        yards = txtyards;            
    }

    public void conversion()
    {
        kilometers = (miles * 1.609 + yards / 1760.0 * 1.609);
    }
    
    public static void main(String[] args) 
    {
        Scanner obj01 = new Scanner(System.in);

        System.out.println("Enter your Miles : ");
        int Ipnutmiles = obj01.nextInt();

        System.out.println("Enter your Yards : ");
        int Ipnutyards = obj01.nextInt();

        DistanceConverter mycon01 = new DistanceConverter (Ipnutmiles,Ipnutyards);
        mycon01.conversion();
        System.out.println("The Distnce is : " + mycon01.kilometers + " km");

        obj01.close();
    }
}

