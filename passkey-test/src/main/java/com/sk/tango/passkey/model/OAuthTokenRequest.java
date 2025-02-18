package com.sk.tango.passkey.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthTokenRequest {
	String scope;
	String grant_type;

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	@Override
	public String toString() {
		return "OAuthTokenRequest [scope=" + scope + ", grant_type=" + grant_type + "]";
	}

}
