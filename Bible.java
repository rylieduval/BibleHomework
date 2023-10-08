public class Bible
{
    public static void main(String[] args)
    {
        System.out.println(calculateDisciplesTime(13, 2));
        System.out.println(DisciplesPerTime(50));
    }

    
    public static int calculateDisciplesTime(int numberOfDisciples,int disciplesTrained)
    {
        //total number of people on earth 
        long totalPeople = 7700000000L;
        //remembers the number of diciples before they all teach 2 people 
        long oldDiciples = numberOfDisciples;
        //the number of disciples after they teach 2 people
        long newDiciples = 0;
        //the counter of total years
        int totalYears = 0; 

        //loop will run if the total number of true diciples are less than the number of people on earth
        while (newDiciples + oldDiciples < totalPeople)
        {
            //have all the disciples train 2 people
            newDiciples = (oldDiciples * disciplesTrained) + oldDiciples;
            //set a new amount of old diciples each time (to remember how much to add after they train 2 people)
            oldDiciples = (oldDiciples * disciplesTrained);
            //add 3 to the total years
            totalYears = totalYears + 3;
        }
        //return the total number of years when total number of diciples is more than people on earth
        return totalYears;
    }
    
    public static int DisciplesPerTime(int numberOfYears)
    {
        //number of how many people the disciples train at a time
        int disciplesTrained = 2;
        
        while (true) 
        {
            //call back to the function to generate the amount of years to train everyone on earth 
            int years = calculateDisciplesTime(13,disciplesTrained);
            //if the amount of years returned is less than the desired time, return the amount of diciples trained at a time
            if (years <= numberOfYears) 
            {
                return disciplesTrained;
            }
            //if its more than the desired number of years add one to the amount of people are trained each time
            else 
            {
                disciplesTrained++;
            }
        }
    }
}
