package com.model.chess;

public class Board {

	private static final int SIZE = 8;
	private Pawn piece[][] = new Pawn[SIZE][SIZE];

	public void addPiece(Pawn pawn, Coordinate position) {
		if(position.isNotWithinBoundsOf(SIZE))
			throw new IllegalArgumentException("Position is invalid");
		piece[position.getxCoordinate()][position.getyCoordinate()] = pawn;
	}

	public Pawn getPieceIn(Coordinate position) {
		return piece[position.getxCoordinate()][position.getyCoordinate()];
	}

}
