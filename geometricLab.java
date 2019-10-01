/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class geometricLab {
        
    
    //main method
    public static void main (String[] args){
      
      
       Rectangle2 areaa = new Rectangle2();
       Box objj = new Box(2, 3, 4);

        
  
        System.out.println("Box a: " + objj.toString());
        System.out.println("Box a surface area: " + objj.surfacearea);
        System.out.println("Box b: " + areaa.toString());
        System.out.println("Box b surface area: " + areaa.area);
        System.out.print("Check if Box a and Box b are equal? " );
        objj.equal();
        
        IsoscelesRight test = new IsoscelesRight(3);
        Geometric4Tester tst = new Geometric4Tester();

        System.out.println("IsoscelesRight c" + test.toString());
        System.out.println("IsoscelesRight c area: " + test.getArea());


        System.out.println("IsoscelesRight d" + test.toString());
        System.out.println("IsoscelesRight d area: " + test.getArea());



        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + test.equals());
    }    


//start of Rectangle2 class
public static class Rectangle2{
    public int base,l=4,w=7,h=4;
    int area = ((l*w)+(l*h)+(w*h))*2;
   
    
    
    public void rectangleFormula(){
      
    }
        public int getArea(){
            
            return area;
        }
        
        public double getHeight(){
         return h; 
    }
      public String toString(){
        return "[length="+ l + " " + ", width="+ " " + w + ", height="+ " " + h + "]";
        }
    }//end of Rectangle2 class
    


       // class Box
    public static class Box extends Rectangle2{
    
   
    private int h=4;
    public int width=3, length=2;
    public int surfacearea=((length*width)+(length*h)+(width*h))*2; 
    int base;
 
    
    public Box(int l, int w, int h){
        
        rectangleFormula();
    }
    
    public void rectangleFormula(){
      
    }
    public int getArea(){
        
        return surfacearea;
    }
    
     public double getHeight(){
         return h; 
    }
    
    
    public String toString(){
        return "[length="+ length + " " + ", width="+ " " + width + ", height="+ " " + h + "]";
    }
    
    void equal(){
        if(area == surfacearea){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }   
    }
    
   
}//end of class Box

        
//start of Triangle2 class
public static class Triangle2{
    
    double equalSide = 3, area, sideC;
    String ans;

    public String equals(){
        if (equalSide == equalSide){
                ans = "true";
        }
        else{
                ans = "false";
        }

    return ans;
    }

    public double getArea(){
        area = (equalSide*equalSide­)/2;
        return area;
    }

   
}//end of Triangle2 class
    
        //IsoscelesRight class
    public static class IsoscelesRight extends Triangle2{
 
        public IsoscelesRight(doubl­e equalSize){

        }

     public double getEqualSide(){
        return equalSide;
    }   

    public double getNotEqualSide(){
        sideC = equalSide*Math.sqrt(2);
        return sideC;
    }

    public String toString(){
        return "[IsoscelesRight: equal_side = " + getEqualSide() + ",not_equal side = " + getNotEqualSide();
    }
}
//end of isoceles

    public static class Geometric4Tester{

        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
                tst.equalSide = 3.0;
        }
}

}
   
    

    
    

