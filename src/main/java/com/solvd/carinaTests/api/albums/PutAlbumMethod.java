package com.solvd.carinaTests.api.albums;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutAlbumMethod extends AbstractApiMethodV2{
	public PutAlbumMethod() {
		super("api/albums/_put/rq.json", "api/albums/_put/rs.json", "api/albums/album.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
