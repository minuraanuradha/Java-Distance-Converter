class DistanceConverter 
{
    public static void main(String[] args) 
    {
        int miles = 26;
        int yards = 385 ;
        double kilometers;

        kilometers = (miles * 1.609 + yards / 1760.0 * 1.609);
        System.out.println("The Distnce is : " + kilometers + " km");

    }
}
    
