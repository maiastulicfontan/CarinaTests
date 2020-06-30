package com.solvd.carinaTests.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostPostMethod extends AbstractApiMethodV2 {
	public PostPostMethod() {
		super("api/posts/_post/rq.json", "api/posts/_post/rs.json", "api/posts/post.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
