package com.training.tr.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.tr.bean.ComparatorTrainDestination;
import com.training.tr.bean.ComparatorTrainNumber;
import com.training.tr.bean.ComparatorTrainTime;
import com.training.tr.bean.Train;
import com.training.tr.bean.TrainTable;

public class TrainTableLogic {
	private TrainTable tb;
	private Comparator<Train> cTrainNumber;
	private Comparator<Train> cTrainDestination;
	private Comparator<Train> cTrainTime;

	{
		cTrainNumber = new ComparatorTrainNumber();
		cTrainDestination = new ComparatorTrainDestination();
		cTrainTime = new ComparatorTrainTime();
	}

	public TrainTableLogic() {
	}

	public TrainTableLogic(TrainTable tb) {
		this.tb = tb;
	}

	public TrainTable getTb() {
		return tb;
	}

	public void setTb(TrainTable tb) {
		this.tb = tb;
	}

	public TrainTable sortTrainByNumber() {
		List<Train> result = tb.getList();
		Collections.sort(result, cTrainNumber);

		// Сортировка пузырьком. Изначально сделал через компараторы, решил добавить
		// второй вариант

		/*for (int i = 0; i < result.size(); i++) {
			boolean needIteration = false;
			for (int j = 0; j < result.size() - 1; j++) {
				if (result.get(j).getNumberTrain() > result.get(j + 1).getNumberTrain()) {
					Collections.swap(result, j, j + 1);
					needIteration = true;
				}
			}
			
			if (needIteration == false) {
				break;
			}
		}*/

		return tb;
	}

	public TrainTable sortTrainByDestinationTime() {
		List<Train> result = tb.getList();

		Collections.sort(result, cTrainDestination.thenComparing(cTrainTime));
		
		//Здесь опять второй вариант решения. Сортировка пузырьком

		/*for (int i = 0; i < result.size(); i++) {
			boolean needIteration = false;

			for (int j = 0; j < result.size() - 1; j++) {
				needIteration = false;
				
				if (result.get(j).getDestination().compareTo(result.get(j + 1).getDestination()) > 0) {
					needIteration = true;
				} else if (result.get(j).getDestination().compareTo(result.get(j + 1).getDestination()) == 0) {

					if (result.get(j + 1).getTime().before(result.get(j).getTime())) {
						needIteration = true;
					}
				}
				if (needIteration == true) {

					Collections.swap(result, j, j + 1);
				}
			}
			if (needIteration == false) {
				break;
			}
		}*/

		return tb;
	}

	public Train getTrainByNumber(int number) {
		Train result = null;
		for (int i = 0; i < tb.getList().size(); i++) {
			if (tb.getList().get(i).getNumberTrain() == number) {
				result = tb.getList().get(i);
			}
		}
		return result;
	}

}
