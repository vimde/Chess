package com.spec.board;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.model.chess.Board;
import com.model.chess.Coordinate;
import com.model.chess.Pawn;
import com.model.chess.Rook;

public class BoardSpec {

	private Board board;
	private Pawn pawn;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void setup() {
		board = new Board();
		pawn = new Pawn();
	}

	@Test
	public void doesNotThrowExceptionWhenAddingAPawnToAnUnoccupiedSquareOnTheBoard() {
		board.addPiece(pawn, new Coordinate(1, 2));
	}

	@Test
	public void shouldBeAbleToRetrieveThePawnThatHasAlreadyBeenAdded() {
		board.addPiece(pawn, new Coordinate(1, 2));
		assertEquals(pawn, board.getPieceIn(new Coordinate(1, 2)));
	}
	
	@Test
	public void shouldThrowExceptionForXCoordinateLessThanOrEqualToZero() {
		exception.expect(IllegalArgumentException.class);
		board.addPiece(pawn, new Coordinate(-14, 2));
	}
	
	@Test
	public void shouldThrowExceptionForYCoordinateLessThanOrEqualToZero() {
		exception.expect(IllegalArgumentException.class);
		board.addPiece(pawn, new Coordinate(2, -14));
	}
	
	@Test
	public void shouldThrowExceptionIfXCoordinateIsGreaterThanSizeOfBoard() {
		exception.expect(IllegalArgumentException.class);
		board.addPiece(pawn, new Coordinate(14, 2));
	}
	
	@Test
	public void shouldThrowExceptionIfYCoordinateIsGreaterThanSizeOfBoard() {
		exception.expect(IllegalArgumentException.class);
		board.addPiece(pawn, new Coordinate(2, 14));
	}
	
	@Test
	public void doesNotThrowExceptionWhenRookIsAddedToASquareWithinBounds() {
		Rook rook = new Rook();
		Coordinate position = new Coordinate(3, 4);
		board.addPiece(rook, position);
	}
}
