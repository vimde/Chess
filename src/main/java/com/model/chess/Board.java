package com.model.chess;

public class Board {

	private static final int SIZE = 8;
	private Pawn piece[][] = new Pawn[SIZE][SIZE];

	public void addPiece(Pawn pawn, Coordinate position) {
		if(isAnInvalid(position))
			throw new IllegalArgumentException("Position is invalid");
		piece[position.getxCoordinate()][position.getyCoordinate()] = pawn;
	}

	private boolean isAnInvalid(Coordinate position) {
		return position.getxCoordinate() <= 0  || position.getxCoordinate() > SIZE 
				|| position.getyCoordinate() <= 0 || position.getyCoordinate() > SIZE;
	}

	public Pawn getPieceIn(Coordinate position) {
		return piece[position.getxCoordinate()][position.getyCoordinate()];
	}

}
