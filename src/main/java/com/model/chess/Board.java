package com.model.chess;

public class Board {

	private static final int SIZE = 8;
	private Pawn piece[][] = new Pawn[SIZE][SIZE];

	public void addPiece(Pawn pawn, Coordinate position) {
		piece[position.getxCoordinate()][position.getyCoordinate()] = pawn;
	}

	public Pawn getPieceIn(int xCoordinate, int yCoordinate) {
		return piece[xCoordinate][yCoordinate];
	}

}
