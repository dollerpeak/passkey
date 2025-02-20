/*
 * Copyright (C) 2023 SK TELECOM CO., LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sk.tango.model.transport;

import com.sk.tango.model.ServerPublicKeyCredentialDescriptor;
import com.sk.tango.model.ServerUserVerificationRequirement;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@Jacksonized
@SuperBuilder
public class AssertionOptions extends ServerOptions {
    private String challenge;
    private Long timeout;
    private String rpId;
    @Builder.Default
    private List<ServerPublicKeyCredentialDescriptor> allowCredentials = Collections.emptyList();
    @Builder.Default
    private ServerUserVerificationRequirement userVerification = ServerUserVerificationRequirement.PREFERRED;
    private Map<String, Object> extensions;
}
