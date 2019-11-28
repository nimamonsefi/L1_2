/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        
        System.out.print("Enter Your Math Mark : ");
        student.setMathMark(scanner.nextDouble());
        
        System.out.print("Enter Your Physic Mark : ");
        student.setPhysicMark(scanner.nextDouble());
        
        System.out.print("Enter Your Chemistry Mark : ");
        student.setChemistryMark(scanner.nextDouble());
        
        System.out.println("Your Average Is : "+student.average());
        student.pass();
    }
    
}
