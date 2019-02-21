package com.training.patterns.creational.absfactory;

public class HaliflexYikama implements IYikama {

	@Override
	public void kopurt() {
		System.out.println("Haliflex kopurtme yap�ld�");
	}

	@Override
	public void yika() {
		System.out.println("Haliflex y�kama yap�ld�");
	}

}
