package com.example.design.pattern.command;

public class CommandPatternClient {
	
	
	public static void main(String[] args) {
        Food doc = new Food();
        
        ActionListenerCommand takeOrder = new ActionTakeOrder(doc);
        ActionListenerCommand cookFood = new ActionCookFood(doc);
        ActionListenerCommand serveFood = new ActionServeFood(doc);
        
        MenuOptions menu = new MenuOptions(takeOrder, cookFood, serveFood);
        
        menu.takeOrder();
        menu.cookFood();
        menu.serveFood();
       
        
    }

}
