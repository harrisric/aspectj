/*******************************************************************************
 * Copyright (c) 2010 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *     Andy Clement (SpringSource) - initial implementation
 *******************************************************************************/
package org.aspectj.weaver.patterns;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.ConstantPoolReader;
import org.aspectj.weaver.ConstantPoolWriter;

public class ConstantPoolSimulator implements ConstantPoolWriter, ConstantPoolReader {
	List<String> list = new ArrayList<>();

	public int writeUtf8(String string) {
		int i = list.indexOf(string);
		if (i != -1) {
			return i;
		}
		list.add(string);
		return list.indexOf(string);
	}

	public String readUtf8(int constantPoolIndex) {
		return list.get(constantPoolIndex);
	}

}
