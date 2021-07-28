package com.training.tr.bean;

import java.util.Comparator;

public class ComparatorTrainDestination implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		
		return o1.getDestination().compareTo(o2.getDestination());
	}

}
