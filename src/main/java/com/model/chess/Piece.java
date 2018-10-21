package com.model.chess;

import java.util.stream.Stream;

public abstract class Piece {

	public abstract Stream<Coordinate> getNextPossibleMoveFrom(int xCoordinate, int yCoordinate);
}
