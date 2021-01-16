package com.test03;

public class MyFood {

	private Food favoriteFood;
	private Food unFavoriteFood;

	public MyFood() {

		this.favoriteFood = new Food("회", 150);
		this.unFavoriteFood = new Food("해물탕", 500);
	}

	public MyFood(Food favoriteFood, Food unFavoriteFood) {

		super();

		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;

	}

	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}

	@Override
	public String toString() {
		return "좋아하는 음식=" + favoriteFood + " \t싫어하는 음식=" + unFavoriteFood;
	}

}
