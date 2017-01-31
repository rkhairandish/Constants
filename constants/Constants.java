/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/**
 *
 * @author Ramesh
 */
   class Constants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Code to create and intialise three intger constants
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
        
        //declared four regular integer variables 
        int td, pat, fg, total;
        
        //Initialise the regular variables - using multiples of the constant values
        td = 4*TOUCHDOWN;
        pat = 3*CONVERSION;
        fg = 2*FIELDGOAL;
        total = (td+pat+fg);
        
        //this line displays total score 
        System.out.println("Score: "+ total);
        
    }
    
}
