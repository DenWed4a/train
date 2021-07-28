package com.training.tr.bean;

import java.util.Comparator;

public class ComparatorTrainTime implements Comparator<Train>{

	@Override
	public int compare(Train o1, Train o2) {
		if (o1.getTime().getHour() > o2.getTime().getHour()) {
			return 1;
		} else if (o1.getTime().getHour() < o2.getTime().getHour()) {
			return -1;
		} else if (o1.getTime().getMinutes() > o2.getTime().getMinutes()) {
			return 1;
		} else if (o1.getTime().getMinutes() < o2.getTime().getMinutes()) {
			return -1;
		} else
			return 0;
	}

}
