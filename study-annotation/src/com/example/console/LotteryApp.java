package com.example.console;

import com.example.model.LotteryViewModel;
import com.example.service.business.RandomNumberGenerator;

public class LotteryApp {

	public static void main(String[] args) {
		LotteryViewModel model = new LotteryViewModel();
		RandomNumberGenerator.generate(model);
		System.out.println(model.getNumbers());

	}

}
