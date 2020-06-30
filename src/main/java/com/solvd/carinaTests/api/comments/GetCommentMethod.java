package com.solvd.carinaTests.api.comments;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetCommentMethod extends AbstractApiMethodV2{
	public GetCommentMethod() {
		super(null, "api/comments/_get/rs.json", new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}

}
