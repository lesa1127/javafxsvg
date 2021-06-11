package de.codecentric.centerdevice.javafxsvg.dimension;

import org.w3c.dom.Document;

public interface DimensionProvider {
	/**
	 *
	 * @param document svg 文档
	 * @return fx宽高
	 */
	Dimension getDimension(Document document);
}
