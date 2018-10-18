package com.model.chess;

public class Pawn {

	public Coordinate getNextPossibleMoveFrom(int xCoordinate, int yCoordinate) {
		return new Coordinate(xCoordinate, yCoordinate + 1);
	}

}
