package com.spec.board;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.chess.Coordinate;
import com.model.chess.Pawn;

public class PawnSpec {

	@Test
	public void returnsTheNextPositionFromTheCurrentPosition() {
		Pawn pawn = new Pawn();
		Coordinate nextPossibleMove = pawn.getNextPossibleMoveFrom(2, 2);
		assertEquals(new Coordinate(2, 3), nextPossibleMove);
	}
}
