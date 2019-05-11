package com.microservice.gamification.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservice.gamification.domain.BadgeCard;

public interface BadgeCardRepository extends CrudRepository<BadgeCard, Long> {

	List<BadgeCard> findByUserIdOrderByBadgeTimeStampDesc(final Long userID);
	
}
