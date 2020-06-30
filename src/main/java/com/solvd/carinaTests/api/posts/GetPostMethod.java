package com.solvd.carinaTests.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import java.util.Properties;

public class GetPostMethod extends AbstractApiMethodV2 {
	public GetPostMethod() {
		super(null, "api/posts/_get/rs.json", new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
