/* *******************************************************************
 * Copyright (c) 2002 Palo Alto Research Center, Incorporated (PARC).
 * All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *     PARC     initial implementation
 * ******************************************************************/
package org.aspectj.weaver.patterns;

import org.aspectj.weaver.IHasPosition;

public class ParserException extends RuntimeException {
	private IHasPosition token;

	public ParserException(String message, IHasPosition token) {
		super(message);
		this.token = token;
	}

	public IHasPosition getLocation() {
		return token;
	}

}
