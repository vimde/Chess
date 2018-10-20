package com.model.chess;

import java.util.stream.Stream;

public class Pawn {

	public Stream<Coordinate> getNextPossibleMoveFrom(int xCoordinate, int yCoordinate) {
		return Stream.of(new Coordinate(xCoordinate, yCoordinate + 1));
	}

}
