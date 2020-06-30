package com.solvd.carinaTests.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePostMethod extends AbstractApiMethodV2 {
	public DeletePostMethod() {
		super("api/posts/_delete/rq.json", "api/posts/_delete/rs.json", "api/posts/post.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
