package edu.uaslp.objetos.shoppingcart.ShoppingCart;

import java.math.BigDecimal;

public class Item {

    int Code;
    int ProviderCode;
    int Quantity;
    int UnitCost;
    protected Item next;
    protected Item previous;



    public int getCode() {
        return  Code;
    }

    public int getProviderCode() {
        return ProviderCode;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getUnitCost() {
        return UnitCost;
    }


    public void setCode(String itemCode) {
    }

    public void setProviderCode(String providerCode) {
    }

    public void setQuantity(int i) {
    }

    public void setUnitCost(BigDecimal bigDecimal) {
    }
}
