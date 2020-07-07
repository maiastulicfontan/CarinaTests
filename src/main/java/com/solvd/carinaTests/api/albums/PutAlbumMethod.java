package com.solvd.carinaTests.api.albums;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutAlbumMethod extends AbstractApiMethodV2 implements IAlbumTest{
	public PutAlbumMethod() {
		super(PUT_RQ_PATH, PUT_RS_PATH, PROPERTIES_PATH);
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
