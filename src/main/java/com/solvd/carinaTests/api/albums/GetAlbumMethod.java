package com.solvd.carinaTests.api.albums;


import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetAlbumMethod  extends AbstractApiMethodV2 implements IAlbumTest{
	public GetAlbumMethod () {
		super(null, GET_RS_PATH, PROPERTIES_PATH);
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
