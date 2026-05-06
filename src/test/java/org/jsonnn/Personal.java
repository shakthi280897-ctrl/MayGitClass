package org.jsonnn;

public class Personal {
	
	public Personal(String best_friend, String favorite_color, String favorite_word) {
		super();
		this.best_friend = best_friend;
		this.favorite_color = favorite_color;
		this.favorite_word = favorite_word;
	}
	private String best_friend;
	private String  favorite_color;
	private String  favorite_word;
	
	public String getBest_friend() {
		return best_friend;
	}
	public void setBest_friend(String best_friend) {
		this.best_friend = best_friend;
	}
	public String getFavorite_color() {
		return favorite_color;
	}
	public void setFavorite_color(String favorite_color) {
		this.favorite_color = favorite_color;
	}
	public String getFavorite_word() {
		return favorite_word;
	}
	public void setFavorite_word(String favorite_word) {
		this.favorite_word = favorite_word;
	}
	
}
