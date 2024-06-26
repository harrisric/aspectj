/* *******************************************************************
 * Copyright (c) 1999-2001 Xerox Corporation,
 *               2002 Palo Alto Research Center, Incorporated (PARC).
 * All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *     Xerox/PARC     initial implementation
 * ******************************************************************/
package org.aspectj.testing.drivers;

import junit.framework.*;

public class TestingDriversModuleTests extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite(TestingDriversModuleTests.class.getName());
        suite.addTestSuite(HarnessSelectionTest.class);
        suite.addTest(AjcHarnessTestsUsingJUnit.suite());
        return suite;
    }

    public TestingDriversModuleTests(String name) { super(name); }

}
