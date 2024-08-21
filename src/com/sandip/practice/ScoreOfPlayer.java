package com.sandip.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScoreOfPlayer {
	
	record Player(String name, Integer score, String type ) {
		
	}
	
	public static void main(String[] args) {
		List<Player> pList = List.of(
				new Player("Sandip", 20, "Batsman"),
				new Player("Siru", 10, "Bowler"),
				new Player("movek", 20, "WicketKeepr"),
				new Player("nishesh", 15, "Batsman")
				);
		//sum of score of all players
		double sum = pList.stream().mapToInt(Player::score).sum();
		System.out.println(sum);
		
		//group the player based on their skill sets
		Map<String, List<Player>> groupBY =pList.stream()
				.collect(Collectors.groupingBy(Player::type));
		
		System.out.println(groupBY);
	}

}
