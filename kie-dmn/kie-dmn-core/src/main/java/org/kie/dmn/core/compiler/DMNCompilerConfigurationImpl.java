/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.kie.dmn.core.compiler;

import org.kie.dmn.api.core.DMNCompilerConfiguration;
import org.kie.dmn.api.marshalling.v1_1.DMNExtensionRegister;

import java.util.ArrayList;
import java.util.List;

public class DMNCompilerConfigurationImpl implements DMNCompilerConfiguration {

    private List<DMNExtensionRegister> registeredExtensions = new ArrayList<>();

    public void addExtensions(List<DMNExtensionRegister> extensionRegisters) {
        this.registeredExtensions.addAll(extensionRegisters);
    }

    public void addExtension(DMNExtensionRegister extensionRegister) {
        this.registeredExtensions.add(extensionRegister);
    }

    public List<DMNExtensionRegister> getRegisteredExtensions() {
        return this.registeredExtensions;
    }

}