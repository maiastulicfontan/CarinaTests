package com.solvd.carinaTests.api.comments;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostCommentMethod extends AbstractApiMethodV2 implements ICommentTest {
	public PostCommentMethod() {
		super(POST_RQ_PATH, POST_RS_PATH, PROPERTIES_PATH);
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
