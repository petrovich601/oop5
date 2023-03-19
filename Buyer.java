package model;

public abstract class Buyer implements BuyerBehavior {
    public String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    public abstract String getName();
}
