package com.dimtsk.assignment3.model;

public class TShirt {

    private Color color;
    private Size size;
    private Fabric fabric;
    private int price;

    public TShirt() {
    }

    public TShirt(Color color, Size size, Fabric fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.price = 
                //index of enum element
                30+(int)(this.getColor().ordinal()*0.2)+
                (int)(this.getSize().ordinal()*0.8)+
                (int)(this.getFabric().ordinal()*1.2);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt{color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }



}
