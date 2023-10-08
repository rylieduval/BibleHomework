public class Bible
{
    public static void main(String[] args)
    {
        System.out.println(calculateDisciplesTime(13, 2));
        System.out.println(DisciplesPerTime(50));
    }
    
    public static int calculateDisciplesTime(int numberOfDisciples,int disciplesTrained)
    {
        long totalPeople = 7700000000L;
        long oldDiciples = numberOfDisciples;
        long newDiciples = 0;
        int totalYears = 0; 
        
        while (newDiciples + oldDiciples < totalPeople)
        {
            newDiciples = (oldDiciples * disciplesTrained) + oldDiciples;
            oldDiciples = (oldDiciples * disciplesTrained);
            totalYears = totalYears + 3;
        }
        
        return totalYears;
    }
    
    public static int DisciplesPerTime(int numberOfYears)
    {
        int disciplesTrained = 2;
        
        while (true) 
        {
            int years = calculateDisciplesTime(13,disciplesTrained);

            if (years <= numberOfYears) 
            {
                return disciplesTrained;
            }
            else 
            {
                disciplesTrained++;
            }
        }
    }
}