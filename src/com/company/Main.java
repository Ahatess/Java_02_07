package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Irasykite savo svori KG");
	float a = sc.nextFloat();
	System.out.println("Irasyktie savo ugi M");
	float b = sc.nextFloat();

    System.out.println("Jusu KMI: " + kmi(a,b));
}
    public static float kmi(float a, float b){
    return (a/(b*b));}
}

