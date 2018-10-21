package com.spec.coordinate;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.chess.Coordinate;

public class CoordinateSpec {
	
	private static final int BOARD_SIZE = 8;

	@Test
	public void checkIfTheCoordinateIsWithinBounds() {
		Coordinate coordinate = new Coordinate(1,2);
		assertFalse("Coordinate is not within bounds", coordinate.isNotWithinBoundsOf(BOARD_SIZE));
	}
	
	@Test
	public void checkIfThe_X_CoordinateIsNotWithinBounds() {
		Coordinate coordinate = new Coordinate(12, 3);
		assertTrue("Coordinate is within bounds", coordinate.isNotWithinBoundsOf(BOARD_SIZE));
	}
	
	@Test
	public void checkIfThe_Y_CoordinateIsNotWithinBounds() {
		Coordinate coordinate = new Coordinate(6, 12);
		assertTrue("Coordinate is within bounds", coordinate.isNotWithinBoundsOf(BOARD_SIZE));
	}
}
