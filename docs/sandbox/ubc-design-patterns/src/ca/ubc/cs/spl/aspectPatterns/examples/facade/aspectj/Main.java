package ca.ubc.cs.spl.aspectPatterns.examples.facade.aspectj;

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

/**
 * Implements the driver for the Facade design pattern example.<p>
 *
 * Intent: <i>Provide a unified interface to a set of interfaces in a
 * subsystem. Facade defines a higher-level interface that makes the
 * subsystem easier to use.</i><p>
 *
 * The <i>subsystem</i> consists of three classes that provide low-level
 * string manipulation and output functionality: <code>RegularScreen</code>,
 * <code>Decoration</code>, and <code>StringTransformer</code>. The <i>Facade
 * </i> class <code>OutputFacade</code> procides a higher-level interface
 * to output strings. This class calls methods on that higer-level interface.
 *
 *  * <p><i>This is the AspectJ version.</i><p>
 *
 * For this pattern, both Java and AspectJ implementations are identical.
 * The pattern introduces no crosscutting and is not abstractable. However,
 * this example illustrates that AspectJ can be used to enforce the facade's
 * encapsulation of the subsystem in question. Both <code>declare warning
 * </code> and <code>declare error</code> can be used to that effect.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.11, 03/29/04
 */

public class Main {

	/**
	 * Tests the higher-level interface of <code>OutputFacade</code>.
	 *
	 * @param args Command-line parameters, ignored here
	 */

	public static void main(String[] args) {
		OutputFacade facade = new OutputFacade();

		System.out.println("Testing regular Facade access...");
		facade.printDecoration();

		facade.printNormal("Facade: this is normal printing");
		facade.printFancy ("Facade: this is fancy  printing");

		System.out.println("\nCircumventing Facade encapsulation...");

		// Note that the compiler warning caused by the next line is
		// intentional. See FacadePolicyEnforcement for details.
		RegularScreen.print("It works, but should create a compiler warning");

		System.out.println();
	}
}
