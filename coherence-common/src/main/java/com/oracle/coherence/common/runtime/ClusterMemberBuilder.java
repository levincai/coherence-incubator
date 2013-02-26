/*
 * File: ClusterMemberBuilder.java
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * The contents of this file are subject to the terms and conditions of 
 * the Common Development and Distribution License 1.0 (the "License").
 *
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the License by consulting the LICENSE.txt file
 * distributed with this file, or by consulting https://oss.oracle.com/licenses/CDDL
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file LICENSE.txt.
 *
 * MODIFICATIONS:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 */

package com.oracle.coherence.common.runtime;

import java.util.Properties;

/**
 * <strong>This package is now deprecated.  Please use the com.oracle.tools package instead.</strong>
 * <p>
 * A {@link ClusterMemberBuilder} is a specialized {@link AbstractJavaApplicationBuilder} that's designed
 * for realizing {@link ClusterMember}s.
 * <p>
 * Copyright (c) 2010. All Rights Reserved. Oracle Corporation.<br>
 * Oracle is a registered trademark of Oracle Corporation and/or its affiliates.
 *
 * @author Brian Oliver
 */
@Deprecated
public class ClusterMemberBuilder
    extends AbstractJavaApplicationBuilder<ClusterMember, ClusterMemberSchema, ClusterMemberBuilder>
    implements JavaApplicationBuilder<ClusterMember, ClusterMemberSchema, ClusterMemberBuilder>
{
    /**
     * Construct a {@link ClusterMemberBuilder}.
     */
    public ClusterMemberBuilder()
    {
        super();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected ClusterMember createJavaApplication(Process            process,
                                                  String             name,
                                                  ApplicationConsole console,
                                                  Properties         environmentVariables,
                                                  Properties         systemProperties)
    {
        return new ClusterMember(process, name, console, environmentVariables, systemProperties);
    }
}
