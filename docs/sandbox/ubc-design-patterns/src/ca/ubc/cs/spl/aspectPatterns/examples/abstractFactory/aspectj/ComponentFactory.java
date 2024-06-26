package ca.ubc.cs.spl.aspectPatterns.examples.abstractFactory.aspectj;

/* -*- Mode: Java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This file is part of the design patterns project at UBC
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * either https://www.mozilla.org/MPL/ or https://aspectj.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is ca.ubc.cs.spl.aspectPatterns.
 *
 * For more details and the latest version of this code, please see:
 * https://www.cs.ubc.ca/labs/spl/projects/aodps.html
 *
 * Contributor(s):
 */

import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Defines the interface for creating products. The only factory methods are
 * <code>createLabel()</code> and <code>createButton(..)</code>.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.1, 01/20/04
 *
 */

public interface ComponentFactory {

    /**
     * Creates factory-specific <code>JLabel</code> products.
     *
     * @return the factory-specific <code>JLabel</code>
     */

	public JLabel createLabel();

    /**
     * Creates factory-specific <code>JButton</code> products.
     *
     * @return the factory-specific <code>JButton</code>
     */

	public JButton createButton(String label);


    /**
     * Returns the name of the factory.
     *
     * @return the name of the factory
     */

	public String getName();
}
