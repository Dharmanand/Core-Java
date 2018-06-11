package com.kd.designpattern.kd;

/**
 * Listener interface which defines changes to an underlying data model. 
 *
 */

public interface DataListener {
	
	/**
	 * Called when data has changed. 
	 * @param dataObject The object that has changed
	 */
	public void dataChanged(Object dataObject);

}
