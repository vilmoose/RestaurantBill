/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantbill;

import java.text.DecimalFormat;

/**
 *
 * @author vifeh1685
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double tax, cost, total, main, side;
     main=14.99;
     side= 5.99;
     cost = main + side;
     tax = .13*cost;
     total = cost + tax;
    
     DecimalFormat x= new DecimalFormat ("$###.##");
     System.out.println(" Main = $14.99 "  + " \n Side = $5.99 " + " \n Tax = " + x.format (tax) + "\n Total = " + x.format(total) );
       
    }
    
}
