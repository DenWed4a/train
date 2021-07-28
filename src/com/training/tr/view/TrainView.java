package com.training.tr.view;

import java.util.Scanner;

import com.training.tr.bean.Train;
import com.training.tr.bean.TrainTable;
import com.training.tr.logic.TrainTableLogic;

public class TrainView {

	public void printTrain(TrainTableLogic tl) {
		System.out.println("Введите номер поезда ->");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
		}
		int number = sc.nextInt();

		if (tl.getTrainByNumber(number) == null) {
			System.out.println("Поезда с таким номером нет");
			printTrain(tl);
		} else {
			System.out.println(tl.getTrainByNumber(number));
		}
		sc.close();

	}

	public void printTrain(TrainTable tb) {
		for (Train element : tb.getList()) {
			System.out.println(element);
		}
	}

}
