package com.example.design.pattern.command;

public class ActionCookFood implements ActionListenerCommand{
	
	private Food food;
	 
    public ActionCookFood(Food food) {
        this.food = food;
    }
    @Override
    public void execute() {
        food.cookFood();
    }

}
