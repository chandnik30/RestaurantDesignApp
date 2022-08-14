package com.example.design.pattern.command;

public class ActionTakeOrder implements ActionListenerCommand{
	
	private Food food;
	 
    public ActionTakeOrder(Food food) {
        this.food = food;
    }
    @Override
    public void execute() {
        food.takeOrder();
    }

}
