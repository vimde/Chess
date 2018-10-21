package com.model.chess;

import java.util.stream.Stream;

public class Pawn extends Piece {
	
	private boolean pawnHasNotMoved;
	
	public Pawn() {
		pawnHasNotMoved = true;
	}

	public Stream<Coordinate> getNextPossibleMoveFrom(int xCoordinate, int yCoordinate) {
		Stream<Coordinate> possibleMove = Stream.empty();
		if(pawnHasNotMoved) {
			possibleMove = Stream.of(new Coordinate(xCoordinate, yCoordinate + 2));
		}
		Stream<Coordinate> anotherPossibleMove = Stream.of(new Coordinate(xCoordinate, yCoordinate + 1));
		return Stream.concat(possibleMove, anotherPossibleMove);
	}

	public void move() {
		pawnHasNotMoved = false;
	}

}
