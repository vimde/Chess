package com.spec.rook;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.chess.Piece;
import com.model.chess.Rook;

public class RookSpec {

	@Test
	public void rookIsAnInstanceOfPiece() {
		Rook rook = new Rook();
		assertTrue("Rook is not an instance of Piece", (rook instanceof Piece));
	}
}
