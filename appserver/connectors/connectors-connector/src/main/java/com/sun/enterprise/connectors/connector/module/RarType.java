/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.enterprise.connectors.connector.module;

import org.glassfish.api.deployment.archive.ArchiveType;

import org.jvnet.hk2.annotations.Service;

/**
 * {@link ArchiveType} corresponding to {@link javax.enterprise.deploy.shared.ModuleType#RAR}.
 *
 * @author sanjeeb.sahoo@oracle.com
 */
@Service(name = RarType.ARCHIVE_TYPE)
@javax.inject.Singleton
public class RarType extends ArchiveType {
    /**
     * same as what's returned by {@link javax.enterprise.deploy.shared.ModuleType#RAR#toString()}
     * We have inlined the value here as opposed to initializing by calling a method on ModuleType.toString().
     * This is done so that we can refer it in annotation attributes
     */
    public static final String ARCHIVE_TYPE = "rar";

    /**
     * same as what's returned by {@link javax.enterprise.deploy.shared.ModuleType#RAR#getExtension()}
     * This has been inlined so that other modules can refer to it as a constant in annotation attributes for example.
     */
    public static final String ARCHIVE_EXTENSION = ".rar";

    public RarType() {
        super(ARCHIVE_TYPE, ARCHIVE_EXTENSION);
    }
}
