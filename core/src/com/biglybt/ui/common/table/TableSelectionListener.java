/*
 * Copyright (C) Azureus Software, Inc, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */

package com.biglybt.ui.common.table;

import com.biglybt.core.util.Debug;

/**
 * @author TuxPaper
 * @created Feb 2, 2007
 *
 */
public interface TableSelectionListener
{
	public void selected(TableRowCore[] row);

	public void deselected(TableRowCore[] rows);

		/**
		 * Use this instead of selected/deselected if it makes more sense
		 * @param old_rows
		 * @param new_rows
		 */
	
	public default void
	selectionChanged(
		TableRowCore[] 		selected_rows,
		TableRowCore[] 		deselected_rows )
	{	
	}
	
	public void focusChanged(TableRowCore focus);

	public void defaultSelected(TableRowCore[] rows, int stateMask );
	public void defaultSelected(TableRowCore[] rows, int stateMask, int orgin );
/* Default methods minSDK 24 
	default public void defaultSelected(TableRowCore[] rows, int stateMask )
	{
		Debug.out( "Implement one of the two defaultSelected methods (" + getClass()+ ")" );
	}

	default public void defaultSelected(TableRowCore[] rows, int stateMask, int orgin )
	{
		defaultSelected( rows, stateMask );
	}
*/

	public void mouseEnter(TableRowCore row);

	public void mouseExit(TableRowCore row);
}
