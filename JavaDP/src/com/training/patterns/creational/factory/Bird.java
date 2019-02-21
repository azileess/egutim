package com.training.patterns.creational.factory;

import com.training.oo.basics.AbstractAnimal;

public class Bird extends AbstractAnimal {

	public Bird() {
		super(30);
	}

	@Override
	public String move(final int m) {
		return "U�uyorum";
	}

	@Override
	public String getName() {
		return "Ku�";
	}

}
