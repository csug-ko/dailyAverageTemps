import java.util.*;
//import java.util.ArrayList;

public class dailyAverageTemps
{


public static void main(String[] args)
{
 ArrayList<Integer>dailyTemps = new ArrayList<Integer>();
 ArrayList<Integer>averageTemps = new ArrayList<Integer>();
 int [][] tempMatrix = new int[7][3];
 int totalTempSum = 0;
 Scanner scanner = new Scanner(System.in);
 String tempDay;
 int tempInt;
int dayCounter=0;
    boolean tryme = true;
//tempMatrix[6][2] = -99;
for(int i = 0;i<7;i++)
{


try{
System.out.print("Please enter the weekday : ");
    scanner.reset();
    tempDay = scanner.next();
    scanner.reset();
System.out.print("Please enter the tempature : ");
    scanner.reset();
    tempInt = scanner.nextInt();
    scanner.reset();

totalTempSum += tempInt;
++dayCounter;

System.out.println("Weekday : " + tempDay +"\nTempature : " + tempInt + "\nAverage daily tempature : " + totalTempSum/dayCounter);

//tempMatrix[i][0]=i;
//tempMatrix[i][1]=tempInt;
dailyTemps.add(tempInt);
   // tempMatrix[i][2] = totalTempSum/dayCounter;
averageTemps.add(totalTempSum/dayCounter);
 
 
}
catch (Exception e)
{
System.out.println("You entered an incorrect data type. Please try again.\n"+e.getMessage());
scanner.reset();

}}
scanner.close();}
}