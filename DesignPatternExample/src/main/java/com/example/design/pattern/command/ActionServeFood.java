package com.example.design.pattern.command;

public class ActionServeFood implements ActionListenerCommand{

	private Food food;

    public ActionServeFood(Food food) {
        this.food = food;
    }
    @Override
    public void execute() {
        food.serveFood();
    }

}
