package com.spec.board;

import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.model.chess.Coordinate;
import com.model.chess.Pawn;
import com.model.chess.Piece;

public class PawnSpec {

	private Piece pawn;
	private Stream<Coordinate> nextPossibleMove;

	@Before
	public void setup() {
		pawn = new Pawn();
		nextPossibleMove = pawn.getNextPossibleMoveFrom(2, 2);
	}

	@Test
	public void returnsOneOfTheNextPossiblePositionsFromTheCurrentPosition() {
		Coordinate nextPosition = new Coordinate(2, 3);
		assertTrue("Not a possible move for Pawn",
				nextPossibleMove.anyMatch(coordinate -> coordinate.equals(nextPosition)));
	}

	@Test
	public void returns_2_4_AsOneOfTheNextPossibleMoveIfThePawnHasNotMovedYetFrom_2_2() {
		Coordinate nextPosition = new Coordinate(2, 4);
		assertTrue("Not a possible move for Pawn",
				nextPossibleMove.anyMatch(coordinate -> coordinate.equals(nextPosition)));
	}

	@Test
	public void doesNotReturn_2_4_AsOneOfTheNextPossibleMoveIfThePawnHasMovedFrom_2_2() {
		Pawn pawn = new Pawn();
		pawn.move();
		Stream<Coordinate> nextPossibleMove = pawn.getNextPossibleMoveFrom(2, 2);
		Coordinate nextPosition = new Coordinate(2, 4);
		assertTrue("Not a possible move for pawn",
				nextPossibleMove.noneMatch(coordinate -> coordinate.equals(nextPosition)));
	}
}
