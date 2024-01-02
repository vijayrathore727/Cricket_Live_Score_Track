package com.crick.apis.service;

import java.util.List;

import com.crick.apis.entities.Match;

public interface CricketService {
	  List<Match> getLiveMatchScores();
	    List<List<String>> getCWC2023PointTable();

	    List<Match> getAllMatches();
}
