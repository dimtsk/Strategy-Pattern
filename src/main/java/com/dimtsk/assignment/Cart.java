package com.dimtsk.assignment;

import com.dimtsk.assignment.payment.IPaymentMethod;
import com.dimtsk.assignment3.model.TShirt;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<TShirt> orderItem;
    
    public void Cart(){
        orderItem= new ArrayList<TShirt>();
    }
    
    public void addItem(TShirt tshirt){
        if(orderItem==null){
            orderItem= new ArrayList<TShirt>();
        }
        orderItem.add(tshirt);
    }
    public void removeItem(TShirt tshirt){
        orderItem.remove(tshirt);
    }

    public double totalOrderCost(){
        int sum=0;
        
        for(TShirt tshirt:orderItem){
            sum+=tshirt.getPrice();
        }
        
        return sum;
    }
    
    public void executePaymant(IPaymentMethod paymentMethod){
        paymentMethod.payment((int) totalOrderCost());
    }
    
}
