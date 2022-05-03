package edu.uaslp.objetos.shoppingcart.ShoppingCart;

import java.util.List;

public class ShoppingCart {

    private int ProviderCode;
    private int Code;
    private int Quantity;
    private int UnitCost;
    private int TotalCost;
    protected Item head;
    protected Item tail;
    private int size;




    public boolean isEmpty() {
        return isEmpty();
    }

    public boolean getItemsCount() {

    }

    public boolean getTotalCost() {
    }


    public void removeItem(String itemCode1) {
    }

    public int getProviderCode() {
        return ProviderCode;
    }

    public void setProviderCode(int providerCode) {
        ProviderCode = providerCode;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(int unitCost) {
        UnitCost = unitCost;
    }

    public void setTotalCost(int totalCost) {
        TotalCost = totalCost;
    }

    public List<Item> getItems() {

    }

    public void addItem(Item item) {
        if (head==null)
        {
            head=Item;
            size++;
        }else{
            Item head = this.head;
            item=aux head;

        }
    }


}
