package com.model.chess;

public class Coordinate {

	private int xCoordinate;
	private int yCoordinate;

	public Coordinate(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public boolean isNotWithinBoundsOf(int boardSize) {
		return checkIfTheCoordinateIsWithinBounds(this.getxCoordinate(), boardSize)
				|| checkIfTheCoordinateIsWithinBounds(this.getyCoordinate(), boardSize);
	}

	private boolean checkIfTheCoordinateIsWithinBounds(int coordinate, int boardSize) {
		return coordinate <= 0 || coordinate > boardSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xCoordinate;
		result = prime * result + yCoordinate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (xCoordinate != other.xCoordinate)
			return false;
		if (yCoordinate != other.yCoordinate)
			return false;
		return true;
	}

}
