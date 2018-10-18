package com.spec.board;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.model.chess.Board;
import com.model.chess.Pawn;

public class BoardSpec {

	private Board board;
	private Pawn pawn;

	@Before
	public void setup() {
		board = new Board();
		pawn = new Pawn();
	}

	@Test
	public void doesNotThrowExceptionWhenAddingAPieceToAnUnoccupiedSquareOnTheBoard() {
		board.addPiece(pawn, 1, 2);
	}

	@Test
	public void shouldBeAbleToRetrieveThePieceThatHasAlreadyBeenAdded() {
		board.addPiece(pawn, 1, 2);
		assertEquals(pawn, board.getPieceIn(1, 2));
	}
}
