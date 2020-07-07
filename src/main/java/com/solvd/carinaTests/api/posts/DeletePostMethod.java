package com.solvd.carinaTests.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePostMethod extends AbstractApiMethodV2 implements IPostTest {
	public DeletePostMethod() {
		super(DELETE_RQ_PATH, DELETE_RS_PATH, PROPERTIES_PATH);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
