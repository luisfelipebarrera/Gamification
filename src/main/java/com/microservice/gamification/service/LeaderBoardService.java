package com.microservice.gamification.service;

import java.util.List;

import com.microservice.gamification.domain.LeaderBoardRow;

public interface LeaderBoardService {
	
	List<LeaderBoardRow> getCurrentLeaderBoard();

}
