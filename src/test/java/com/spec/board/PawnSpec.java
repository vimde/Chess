package com.spec.board;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.Test;

import com.model.chess.Coordinate;
import com.model.chess.Pawn;

public class PawnSpec {

	@Test
	public void returnsOneOfTheNextPossiblePositionsFromTheCurrentPosition() {
		Pawn pawn = new Pawn();
		Stream<Coordinate> nextPossibleMove = pawn.getNextPossibleMoveFrom(2, 2);
		int nextPossible_X_Position = 2;
		int nextPossible_Y_Position = 3;
		assertTrue("Not a possible move for Pawn", nextPossibleMove
				.anyMatch(coordinate -> coordinate.getxCoordinate() == nextPossible_X_Position
				&& coordinate.getyCoordinate() == nextPossible_Y_Position));
	}
	
	@Test
	public void returns_2_4_AsOneOfTheNextPossibleMoveIfThePawnHasNotMovedYetFrom_2_2() {
		Pawn pawn = new Pawn();
		Stream<Coordinate> nextPossibleMove = pawn.getNextPossibleMoveFrom(2, 2);
		int nextPossible_X_Position = 2;
		int nextPossible_Y_Position = 4;
		assertTrue("Not a possible move for Pawn", nextPossibleMove
				.anyMatch(coordinate -> coordinate.getxCoordinate() == nextPossible_X_Position
				&& coordinate.getyCoordinate() == nextPossible_Y_Position));
	}
}
