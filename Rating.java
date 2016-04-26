/*
 * Rating.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Rating {
	
	private String itemRated;
	private int maxRating = 10;
	private int rating;
	
	public Rating(){ // default constructor
		itemRated = "unrated thingy.";
		rating = 0;
		}
	
	public Rating(String newDescription, int newUserRating){
		itemRated = newDescription;
		if (newUserRating > maxRating || newUserRating < 0) {
			System.out.println("Cannot exceed 10; must be non negative.");
			System.exit(0);
			}
		else {
			rating = newUserRating;
			}
		}
	
	private int getMaxRating(){
		return maxRating;
		}
	private int getRating(){
		return rating;
		}
	private String getItemRated(){
		return itemRated;
		}
	
	public void setItemRated(String item){
		itemRated = item;
		}
	public void setRating(int newRating){
		rating = newRating;
		}
	public void getFormattedRating(){
		System.out.println("Title: " + this.getItemRated());
		System.out.println("Rated: " + this.getRating());
		System.out.println("out of: " + this.getMaxRating());
		}
		
	public static void main (String args[]) {
		
		Rating demo = new Rating();
		demo.setItemRated("Cloud Atlas");
		demo.setRating(3);
		demo.getFormattedRating();
		
		Rating SWIV = new Rating("Star Wars Episode IV", 10);
		SWIV.getFormattedRating();
		
	}
}

