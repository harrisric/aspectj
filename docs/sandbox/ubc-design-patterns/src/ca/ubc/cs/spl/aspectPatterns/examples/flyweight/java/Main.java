package ca.ubc.cs.spl.aspectPatterns.examples.flyweight.java;

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
 * Implements the driver for the Flyweight design pattern example.<p>
 *
 * Intent: <i>Use sharing to support large numbers of fine-grained objects
 * efficiently.</i><p>
 *
 * Participating <i>Flyweight</i> classes are <code>CharacterFlyweight</code>
 * and <code>WhitespaceFlyweight</code>. Both implement the <code>
 * PrintableFlyweight</code> interface. Flyweights are generated via the
 * <code>PrintableFlyweightFactory</code>. <P>
 *
 * These are the pattern roles: <UL>
 *
 * <LI> CharacterFlyweightFactory: FlyweightFactory
 * <LI> PritableFlyweight: Flyweight
 * <LI> CharacterFlyweight:	ConcreteFlyweight
 * <LI> WhitespaceFlyweight: ConcreteFlyweight
 * <LI> Main: Client
 * </UL>
 *
 * Intrinsic state: The character to print,
 * Extrinsic state: Whether the char is upper case or lower case
 *
 * This example creates a sentence out of <code>PrintableFlyweight</i>s
 * (characters and whitespaces).
 *
 * <p><i>This is the Java version.</i><p>
 *
 * This implementation is analoguous to the GoF book's description.
 * For this version, we only use two classes for the flyweights,
 * CharacterFlyweight and WhitespaceFlyweight. Plus, this implementation
 * uses an optimized factory that keeps a hashtable of created Flyweights
 * and employs creation of demand.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.1, 02/11/04
 *
 * @see PrintableFlyweight
 * @see PrintableFlyweightFactory
 */

public class Main {

    /**
     * Implements the driver for the Flyweight design pattern example.<p>
     *
     * This example creates a sentence out of <code>PrintableFlyweight</i>s
     * (characters and whitespaces).
     */

	public static void main(String[] args) {

		System.out.println("This is a test for the java Flyweight pattern "
		    + "implementation.");
		System.out.println("The client will use char flyweights to print the "
		    + "phrase");
		System.out.println("\"This Is A Test\".\n");
		System.out.println("Testing Pattern: Flyweight - STARTING\n");

		PrintableFlyweightFactory pff = new PrintableFlyweightFactory();

		PrintableFlyweight T = pff.getPrintableFlyweight('t');
		PrintableFlyweight H = pff.getPrintableFlyweight('h');
		PrintableFlyweight I = pff.getPrintableFlyweight('i');
		PrintableFlyweight S = pff.getPrintableFlyweight('s');
		PrintableFlyweight A = pff.getPrintableFlyweight('a');
		PrintableFlyweight E = pff.getPrintableFlyweight('e');
		PrintableFlyweight Empty = pff.getPrintableFlyweight(' ');

		// Printing: "This Is A Test"

		T.print(true);
		H.print(false);
		I.print(false);
		S.print(false);

		Empty.print(true);

		I.print(true);
		S.print(false);

		Empty.print(true);

		A.print(true);

		Empty.print(true);

		T.print(true);
		E.print(false);
		S.print(false);
		T.print(false);

		System.out.println();

		System.out.println("\nTesting Pattern: State - FINISHED");
	}
}
