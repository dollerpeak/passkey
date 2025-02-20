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

package com.sk.tango.mapper.authentication;

import com.sktelecom.authentication.fido2.server.dto.authentication.AssertionResponseDto;
import com.sktelecom.authentication.fido2.server.dto.common.PublicKeyCredentialDto;
import com.sk.tango.mapper.common.PublicKeyCredentialTypeMapper;
import com.sk.tango.model.transport.AssertionResponse;
import com.sk.tango.model.transport.AuthenticatorResponseServerRequest;
import com.sk.tango.model.transport.lv3.AuthenticatorResponseServerRequestLv3;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
    uses = {
        AssertionResponseMapper.class,
        PublicKeyCredentialTypeMapper.class
    },
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AuthenticatorAssertionResponseServerRequestMapper {
    @Mapping(target = "clientExtensionResults", source = "getClientExtensionResults")
    PublicKeyCredentialDto<AssertionResponseDto> toWebauthnServerDto(
        AuthenticatorResponseServerRequest<AssertionResponse> rpServer);

    PublicKeyCredentialDto<AssertionResponseDto> toWebauthnServerDtoLv3(
        AuthenticatorResponseServerRequestLv3<AssertionResponse> rpServer);
}
