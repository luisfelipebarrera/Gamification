package com.microservice.gamification.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class GameStats {
	
	private final Long userID;
	private final int score;
	private final List<Badge> badges;
	
	//Empty constructor for JSON / JPA
	public GameStats () {
		this.userID =0L;
		this.score =0;
		this.badges = new ArrayList<>();
			
	}
	
	public static GameStats emptyStats (final Long userID) {
		return new GameStats(userID, 0, Collections.emptyList());
	}
	
	public List<Badge> getBadges(){
		return Collections.unmodifiableList(badges);
	}

}
