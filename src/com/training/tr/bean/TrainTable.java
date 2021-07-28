package com.training.tr.bean;

import java.util.ArrayList;
import java.util.List;

public class TrainTable {
	
	private List<Train> trainTable;
	
	public TrainTable() {
		trainTable = new ArrayList<Train>();
	}	
	
	public TrainTable(List<Train> trainTable) {
		this.trainTable = trainTable;
	}
	
	public void add(Train train) {
		trainTable.add(train);
	}
	
	public void remove(Train train) {
		trainTable.remove(train);
	}
	
	public List<Train> getList() {
		return trainTable;
	}

	public void setList(List<Train> litrainTable) {
		this.trainTable = litrainTable;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trainTable == null) ? 0 : trainTable.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainTable other = (TrainTable) obj;
		if (trainTable == null) {
			if (other.trainTable != null)
				return false;
		} else if (!trainTable.equals(other.trainTable))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrainTable [trainTable=" + trainTable + "]";
	}

	

}
