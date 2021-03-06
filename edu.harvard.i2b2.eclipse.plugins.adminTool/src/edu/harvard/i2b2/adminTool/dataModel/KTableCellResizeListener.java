/*******************************************************************************
 * Copyright (C) 2004 by Friederich Kupzog Elektronik & Software All rights
 * reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Friederich Kupzog - initial API and implementation
 * fkmk@kupzog.de www.kupzog.de/fkmk
 ******************************************************************************/

package edu.harvard.i2b2.adminTool.dataModel;

public interface KTableCellResizeListener {

	/**
	 * Is called when a row is resized.
	 */
	public void rowResized(int newHeight);

	/**
	 * Is called when a column is resized.
	 */
	public void columnResized(int col, int newWidth);

}