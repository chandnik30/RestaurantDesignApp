package com.example.design.pattern.command;

public class MenuOptions {

	private ActionListenerCommand takeOrder;
    private ActionListenerCommand cookFood;
    private ActionListenerCommand serveFood;
 
    public MenuOptions(ActionListenerCommand takeOrder, ActionListenerCommand cookFood, ActionListenerCommand serveFood) {
        this.takeOrder = takeOrder;
        this.cookFood = cookFood;
        this.serveFood = serveFood;
    }
    public void takeOrder(){
        takeOrder.execute();
    }
    public void cookFood(){
        cookFood.execute();
    }
    public void serveFood(){
        serveFood.execute();
    }

	
}
