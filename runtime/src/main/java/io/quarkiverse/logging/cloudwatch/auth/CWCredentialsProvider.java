/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.quarkiverse.logging.cloudwatch.auth;

import com.amazonaws.auth.AWSCredentials;

import io.quarkiverse.logging.cloudwatch.CWConfig;

/**
 * @author hrupp
 */
public class CWCredentialsProvider implements com.amazonaws.auth.AWSCredentialsProvider {

    private final CWConfig config;

    public CWCredentialsProvider(CWConfig config) {
        this.config = config;
    }

    @Override
    public AWSCredentials getCredentials() {
        return new CWCredentials(config);
    }

    @Override
    public void refresh() {
        // TODO: Customise this generated block
    }
}
