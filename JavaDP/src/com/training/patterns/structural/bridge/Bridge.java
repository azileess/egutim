package com.training.patterns.structural.bridge;

public class Bridge {
	public static void main(final String[] args) {
		Araba araba = new BMW(new HybridYakitTipi());
		araba.ileriGit();
	}
}
