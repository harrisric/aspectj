/********************************************************************
 * Copyright (c) 2007 Contributors. All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors: IBM Corporation - initial API and implementation
 * 				 Helen Hawkins   - initial version (bug 148190)
 *******************************************************************/
package org.aspectj.ajde;

/**
 * Interface to enable users to specify which class to run
 */
public interface IRuntimeProperties {

	/**
	 * @return class which contains the main method and should
	 * be used to run the application
	 */
	String getClassToExecute();

	 /**
	  * @return args which should be used as part of the execution
	  * of the application
	  */
	 String getExecutionArgs();

}
