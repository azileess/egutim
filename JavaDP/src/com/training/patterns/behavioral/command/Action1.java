package com.training.patterns.behavioral.command;

public class Action1 implements ICommand {

	@Override
	public void execute() {
		System.out.println("Action 1");
	}

	@Override
	public String getDesc() {
		return "Action1";
	}

}
