/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Student {
    private double MathMark;
    private double PhysicMark;
    private double ChemistryMark;

    public void setMathMark(double MathMark) {
        this.MathMark = MathMark;
    }

    public void setPhysicMark(double PhysicMark) {
        this.PhysicMark = PhysicMark;
    }

    public void setChemistryMark(double ChemistryMark) {
        this.ChemistryMark = ChemistryMark;
    }
    public double average(){
        return (MathMark+ChemistryMark+PhysicMark)/3;
    }
    public void pass(){
        if(average()>=10){
            System.out.println("Passed !!!");
        }
        else{
            System.out.println("Failed !!!");
        }
    }
    
    

    
}
