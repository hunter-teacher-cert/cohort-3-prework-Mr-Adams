import java.io.*;
import java.util.*;
import java.lang.Math;

public class Loops {

  public static void main(String[] args) {
    System.out.println(squareroot(7.0));
    System.out.println(power(3.0,3));
    }
  
  public static double squareroot(double a) {
    double newguess = a/2.0;
    double oldguess = a/2.0;
    double difference = 0.0;
      do {
        newguess = (oldguess + (a/oldguess))/2.0;
        difference = Math.abs(newguess - oldguess);
      } while (difference < .0001); 
        return newguess;
    }
   public static double power(double x, int n) {
     double answer = 1.0;
     for (int i=0; i<n; i++){
       answer *= x; 
     }
     return answer;
  }  
  
}     
     
