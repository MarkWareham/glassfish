/*
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package myweb;

import java.util.Iterator;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import java.io.Serializable;
import java.rmi.RemoteException; 
import javax.naming.*;
import javax.xml.rpc.Service;
import javax.xml.rpc.server.ServiceLifecycle;
import javax.xml.namespace.QName;
import javax.servlet.SingleThreadModel;

public class FindInterestServletImpl implements 
			SingleThreadModel, ServiceLifecycle {

    public FindInterestServletImpl() {
        System.out.println("FindInterestServletImpl() instantiated");
    }

    public void init(Object context) {
        System.out.println("Got ServiceLifecycle::init call " + context);
    }

    public void destroy() {
        System.out.println("Got ServiceLifecycle::destroy call");
    }

    public double calculateInterest(double balance, double period) {
	System.out.println("calculateInterest invoked from servlet endpoint");
	return 0.2*balance*period;
    }
}
