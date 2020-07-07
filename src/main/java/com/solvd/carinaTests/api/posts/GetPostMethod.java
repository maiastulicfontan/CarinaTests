package com.solvd.carinaTests.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetPostMethod extends AbstractApiMethodV2 implements IPostTest{
	public GetPostMethod() {
		super(null, GET_RS_PATH, PROPERTIES_PATH);
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
