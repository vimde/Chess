package com.spec.board;

import org.junit.Test;

import com.model.chess.Board;
import com.model.chess.Pawn;

public class BoardSpec {

	@Test
	public void doesNotThrowExceptionWhenAddingAPieceToAnUnoccupiedSquareOnTheBoard() {
		Board board = new Board();
		board.addPiece(new Pawn(), 1, 2);
	}
}
