package com.training.tr.bean;

import java.util.Comparator;

public class ComparatorTrainNumber implements Comparator<Train>{	

	@Override
	public int compare(Train o1, Train o2) {
		return o1.getNumberTrain() - o2.getNumberTrain();
	}

}
