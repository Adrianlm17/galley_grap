package edu.craptocraft.galley_grap.items;

import org.junit.Test;

public class RetailPriceTest {
    
    @Test

    public void crearItemExtra(){
        RetailPrice.init_prices();
        System.out.print("\n\t --- PRICES ---  \n");
        RetailPrice.display();
    }
}
