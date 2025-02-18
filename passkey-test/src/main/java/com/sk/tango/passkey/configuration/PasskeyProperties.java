//package com.sk.tango.passkey.configuration;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//@PropertySource(value = "properties/passkey.properties")
//public class PasskeyProperties {
//	@Value("${passkey.rp.id}")
//	String rpId;
//	@Value("${passkey.server.base-url}")
//	String baseUrl;
//	@Value("${passkey.server.api-version}")
//	String apiVersion;
//	@Value("${passkey.server.url-path.registration-request}")
//	String urlRegistrationRequest;
//	@Value("${passkey.server.url-path.registration-response}")
//	String urlRegistrationResponse;
//	@Value("${passkey.server.url-path.authentication-request}")
//	String urlAuthenticationRequest;
//	@Value("${passkey.server.url-path.authentication-response}")
//	String urlAuthenticationResponse;
//	@Value("${passkey.server.url-path.user}")
//	String urlUser;
//	@Value("${passkey.server.url-path.user-credential}")
//	String urlUserCredential;
//	@Value("${passkey.server.url-path.user-credentials}")
//	String urlUserCredentials;
//	
//	public String getRpId() {
//		return rpId;
//	}
//	public void setRpId(String rpId) {
//		this.rpId = rpId;
//	}
//	public String getBaseUrl() {
//		return baseUrl;
//	}
//	public void setBaseUrl(String baseUrl) {
//		this.baseUrl = baseUrl;
//	}
//	public String getApiVersion() {
//		return apiVersion;
//	}
//	public void setApiVersion(String apiVersion) {
//		this.apiVersion = apiVersion;
//	}
//	public String getUrlRegistrationRequest() {
//		return urlRegistrationRequest;
//	}
//	public void setUrlRegistrationRequest(String urlRegistrationRequest) {
//		this.urlRegistrationRequest = urlRegistrationRequest;
//	}
//	public String getUrlRegistrationResponse() {
//		return urlRegistrationResponse;
//	}
//	public void setUrlRegistrationResponse(String urlRegistrationResponse) {
//		this.urlRegistrationResponse = urlRegistrationResponse;
//	}
//	public String getUrlAuthenticationRequest() {
//		return urlAuthenticationRequest;
//	}
//	public void setUrlAuthenticationRequest(String urlAuthenticationRequest) {
//		this.urlAuthenticationRequest = urlAuthenticationRequest;
//	}
//	public String getUrlAuthenticationResponse() {
//		return urlAuthenticationResponse;
//	}
//	public void setUrlAuthenticationResponse(String urlAuthenticationResponse) {
//		this.urlAuthenticationResponse = urlAuthenticationResponse;
//	}
//	public String getUrlUser() {
//		return urlUser;
//	}
//	public void setUrlUser(String urlUser) {
//		this.urlUser = urlUser;
//	}
//	public String getUrlUserCredential() {
//		return urlUserCredential;
//	}
//	public void setUrlUserCredential(String urlUserCredential) {
//		this.urlUserCredential = urlUserCredential;
//	}
//	public String getUrlUserCredentials() {
//		return urlUserCredentials;
//	}
//	public void setUrlUserCredentials(String urlUserCredentials) {
//		this.urlUserCredentials = urlUserCredentials;
//	}
//	
//	@Override
//	public String toString() {
//		return "PasskeyProperties [rpId=" + rpId + ", baseUrl=" + baseUrl + ", apiVersion=" + apiVersion
//				+ ", urlRegistrationRequest=" + urlRegistrationRequest + ", urlRegistrationResponse="
//				+ urlRegistrationResponse + ", urlAuthenticationRequest=" + urlAuthenticationRequest
//				+ ", urlAuthenticationResponse=" + urlAuthenticationResponse + ", urlUser=" + urlUser
//				+ ", urlUserCredential=" + urlUserCredential + ", urlUserCredentials=" + urlUserCredentials + "]";
//	}
//	
//	
//	
//	
//	
//}
