package de.codecentric.centerdevice.javafxsvg.dimension;

public class Dimension {
	private final float width;
	private final float height;

	public Dimension(float width, float height) {
		this.width = width;
		this.height = height;
	}

	/**
	 *
	 * @return 文档的宽度
	 */
	public float getWidth() {
		return width;
	}

	/**
	 *
	 * @return 文档的高度
	 */
	public float getHeight() {
		return height;
	}
}
