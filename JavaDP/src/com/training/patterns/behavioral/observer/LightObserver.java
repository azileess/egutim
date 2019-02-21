package com.training.patterns.behavioral.observer;

public class LightObserver extends AbstractObserver {

	public LightObserver() {
		Observer.getIntance()
		        .register(EEventType.YANGIN_ON,
		                  this);
		Observer.getIntance()
		        .register(EEventType.YANGIN_OFF,
		                  this);
	}

	@Override
	public void fire(final EEventType eEventType, final String str) {
		switch (eEventType) {
		case YANGIN_OFF:
			System.out.println("I��klar hala a��k");
			break;
		case YANGIN_ON:
			System.out.println("I��klar a��ld�");
			break;
		case HIRSIZ_OFF:
		case HIRSIZ_ON:
		default:
			break;
		}
	}

}
