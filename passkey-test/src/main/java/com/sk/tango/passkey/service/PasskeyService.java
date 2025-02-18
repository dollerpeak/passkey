package com.sk.tango.passkey.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sk.tango.passkey.model.OAuthTokenRequest;
import com.sk.tango.passkey.model.UserInfo;

@Service
@PropertySource(value = "properties/passkey.properties")
public class PasskeyService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//RestTemplate restTemplete;	
	//WebClient webClient;
	
	@Value("${passkey.client.id}")
	String clientId;
	@Value("${passkey.client.secret}")
	String clientSecret;
	@Value("${passkey.url.oauth}")
	String urlOauth;	
	
	

	public void getOauth2(UserInfo userInfo) {
		logger.info("PasskeyService.getOauth2() ==================");
		logger.info("==> clientId = " + clientId);
		logger.info("==> clientSecret = " + clientSecret);
		logger.info("==> urlOauth = " + urlOauth);
		
		RestTemplate restTemplete = new RestTemplate();		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> requesEntity;
		
		// header
		headers.setBasicAuth(clientId, clientSecret);
		logger.info("==> headers = " + headers.toString());
		//body
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("grant_type", "client_credentials");
		map.add("scope", "passkey:rp");
		logger.info("==> map = " + map.toString());
		requesEntity = new HttpEntity<>(map, headers);
		
//		OAuthTokenRequest oauthRequest = new OAuthTokenRequest();
//		oauthRequest.setGrant_type("client_credentials");
//		oauthRequest.setScope("passkey:rp");
//		logger.info("==> oauthRequest = " + oauthRequest.toString());
//		requesEntity = new HttpEntity<>(oauthRequest, headers);
		
		
		logger.info("==> requesEntity = " + requesEntity.toString());
		
		try {
			클랙스에 한번에 담아보자
			ResponseEntity<Map> respons = restTemplete.exchange(urlOauth, HttpMethod.POST, requesEntity, Map.class);
			
			// respons.getHeaders();
			// respons.getBody();
			if (respons.getStatusCode().is2xxSuccessful() == true) {
				logger.info("==> success");
			} else if (respons.getStatusCode().is4xxClientError() == true) {
				logger.error("==> client error");
			} else if (respons.getStatusCode().is5xxServerError() == true) {
				logger.error("==> server error");
			} else {
				logger.error("==> anyware error");
			}
		} catch (Exception e) {
			logger.error("==> error, e = " + e.toString());
		}
		
		
		//logger.info("==> respons = " + respons.toString());
		
//		@Mapping(target = "user", source = "rpServer")
//	    @Mapping(target = "excludeCredentials", constant = "true")
//	    @Mapping(target = "timeout", constant = "300000L")
//	    RegistrationOptionsServerRequestDto toWebauthnServerDto(AttestationOptionsServerRequest rpServer);
		
		/***
		 url
		 	https://stg-oauth2.daplatform.kr/oauth2/token
		 	
		 header		 	
			Client ID: stg.tango.sktelecom.com
			Client Secret: 2qNXHo35ojCOTUM747Ve4b9KDWUnK01s
		
		body
			grant_type: client_credentials
			scope: passkey:rp
			
			
		 */
	}

}
