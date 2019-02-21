package com.training.patterns.behavioral.observer;

public class DoorObserver extends AbstractObserver {

	public DoorObserver() {
		Observer.getIntance()
		        .register(EEventType.HIRSIZ_ON,
		                  this);
		Observer.getIntance()
		        .register(EEventType.HIRSIZ_OFF,
		                  this);
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
		case HIRSIZ_OFF:
			System.out.println("kap�lar hala kapal�");
			break;
		case HIRSIZ_ON:
			System.out.println("kap�lar kitlendi");
			break;
		case YANGIN_OFF:
			System.out.println("kap�lar a��ld�");
			break;
		case YANGIN_ON:
			System.out.println("kap�lar kitlendi");
			break;
		default:
			break;
		}
	}

}
