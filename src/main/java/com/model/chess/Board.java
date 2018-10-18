package com.model.chess;

public class Board {

	private Pawn piece[][] = new Pawn[8][8];

	public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate) {
		piece[xCoordinate][yCoordinate] = pawn;
	}

	public Pawn getPieceIn(int xCoordinate, int yCoordinate) {
		return piece[xCoordinate][yCoordinate];
	}

}
