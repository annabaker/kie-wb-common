/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.workbench.common.services.backend.project;

import org.junit.Before;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.java.nio.fs.file.SimpleFileSystemProvider;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

abstract public class ProjectTestBase {

    protected final SimpleFileSystemProvider fs = new SimpleFileSystemProvider();

    @Inject
    protected Paths paths;

    @Inject
    BeanManager beanManager;

    @Before
    public void setUp() {
        // Ensure URLs use the default:// scheme
        fs.forceAsDefault();
    }

}
