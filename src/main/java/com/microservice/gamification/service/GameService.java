package com.microservice.gamification.service;

import com.microservice.gamification.domain.GameStats;

public interface GameService {

	GameStats newAttemptForUser(Long userId, Long attemptId, boolean correct);
	
	GameStats retrieveStatsForUser(Long userId);
	
}
