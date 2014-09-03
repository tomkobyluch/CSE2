public class Cyclometer{
    //the main method which runs all other methods and code
    public static void main(String[] args){
        
        int secsTrip1 = 480;    //time elapsed for trip one
        int secsTrip2 = 3220;   //TIME ELAPSED FOR TRIP TWO
        int countsTrip1 = 1561; //number of roations of bike wheel for trip one
        int countsTrip2 = 9037; //numbers of rotations of bike wheel for trip two
        
        double wheelDiameter = 27.0; //double storing diamter of bike wheel
        double PI = 3.14159; // double storing value of pi
        double feetPerMile = 5280; // double defining feet in a mile
        double inchesPerFoot = 12;  //double defining inches in a foot
        double secondsPerMinute = 60;   //double defining seconds in a minute
        double distanceTrip1,distanceTrip2,totalDistance;   //declaring variables thats will be defined later. 
        
        System.out.println("Trip1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");  //Outputs time of trip in minutes and the amount of wheel rotatations for trip one
        System.out.println("Trip2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");  //Outputs time of trip in minutes and the amount of wheel rotatations for trip two
        
        distanceTrip1=(countsTrip1*wheelDiameter*PI);   //defines distanceTrip1 as 2(PI)R (circumference) times rotations to get total length of trip
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles, converts 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //defines distanceTrip2 as the distance in miles of tri 2
        totalDistance=distanceTrip1+distanceTrip2;  //defines total distance of both trips as the first trips distance + the secodn's
        
        System.out.println("Trip1 was "+distanceTrip1+" miles"); //outputs the first trips distance
        System.out.println("Trip2 was"+distanceTrip2+" miles"); //outputs the seconds trips distance
        System.out.println("The total distance was "+totalDistance+" miles");   //outputs the total distance
        
    }//end of main method
}//end of class