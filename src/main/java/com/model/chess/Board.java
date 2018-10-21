package com.model.chess;

public class Board {

	private static final int SIZE = 8;
	private Piece pieces[][] = new Piece[SIZE][SIZE];

	public void addPiece(Piece piece, Coordinate position) {
		if(position.isNotWithinBoundsOf(SIZE))
			throw new IllegalArgumentException("Position is invalid");
		this.pieces[position.getxCoordinate()][position.getyCoordinate()] = piece;
	}

	public Piece getPieceIn(Coordinate position) {
		return pieces[position.getxCoordinate()][position.getyCoordinate()];
	}

}
