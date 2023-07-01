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
        DistanceConverter mycon01 = new DistanceConverter (26,385);
        mycon01.conversion();
        System.out.println("The Distnce is : " + mycon01.kilometers + " km");
    }
}

