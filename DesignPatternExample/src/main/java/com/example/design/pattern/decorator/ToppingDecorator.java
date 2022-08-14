package com.example.design.pattern.decorator;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
