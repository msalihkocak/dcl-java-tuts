package com.example.model;

import java.util.List;

public class LotteryViewModel {
	@Random(max=72)
	private List<Integer> numbers;

	public LotteryViewModel() {
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

}
