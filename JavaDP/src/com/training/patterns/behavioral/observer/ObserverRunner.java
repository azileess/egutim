package com.training.patterns.behavioral.observer;

public class ObserverRunner {
	public static void main(final String[] args) {
		String[] observerClasses = new String[] { "com.training.patterns.behavioral.observer.DoorObserver",
		        "com.training.patterns.behavioral.observer.LightObserver" };

		for (String string : observerClasses) {
			try {
				Class<?> forName = Class.forName(string);
				forName.newInstance();
			} catch (Exception e) {
			}
		}

		Observer.getIntance()
		        .fire(EEventType.HIRSIZ_ON,
		              "Yang�n ba�lad�");
		System.out.println("------------------");
		Observer.getIntance()
		        .fire(EEventType.HIRSIZ_OFF,
		              "Yang�n bitti");

	}

}
