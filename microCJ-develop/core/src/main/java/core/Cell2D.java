package core;

import geom.Point;
import geom.twoDim.Point2D;
import update.UpdateCollector;

public class Cell2D extends Cell{
	private Point2D location;

	public Cell2D(double radius, String celltype, String graphFile, boolean randomiseDecisionWindow, UpdateCollector updateCollector) {
		super(radius, celltype, graphFile, randomiseDecisionWindow, updateCollector);
	}

	public Cell2D(Point2D location, String celltype, double radius, String graphFile, boolean randomiseDecisionWindow, UpdateCollector updateCollector) {
		this(radius, celltype, graphFile, randomiseDecisionWindow, updateCollector);
		this.location = location;
	}

	public Point2D getPoint2D() {
		return location;
	}

	@Override
	public Cell createCopy() {
		return new Cell2D(radius, celltype, graphFile, true, updateCollector);
	}

	@Override
	public Point getLocation() {
		return getPoint2D();
	}

	@Override
	public boolean is3D() {
		return false;
	}

	public void setLocation(Point2D location) {
		this.location = location;
	}
}
