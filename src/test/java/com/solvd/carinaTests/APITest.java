package com.solvd.carinaTests;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carinaTests.api.albums.DeleteAlbumMethod;
import com.solvd.carinaTests.api.albums.GetAlbumMethod;
import com.solvd.carinaTests.api.albums.PostAlbumMethod;
import com.solvd.carinaTests.api.albums.PutAlbumMethod;
import com.solvd.carinaTests.api.comments.GetCommentMethod;
import com.solvd.carinaTests.api.comments.PostCommentMethod;
import com.solvd.carinaTests.api.posts.DeletePostMethod;
import com.solvd.carinaTests.api.posts.GetPostMethod;
import com.solvd.carinaTests.api.posts.PostPostMethod;
import com.solvd.carinaTests.api.posts.PutPostMethod;

public class APITest extends AbstractTest {
	
	@Test
	@MethodOwner(owner="Maia")
	public void testGetPosts () {
		GetPostMethod getPostMethod = new GetPostMethod();
		getPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPostMethod.callAPI();
		getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getPostMethod.validateResponseAgainstJSONSchema("api/posts/_get/rs.schema");
	}
	
	@Test
	@MethodOwner(owner= "Maia")
	public void testDeletePosts() {
		DeletePostMethod deletePostMethod = new DeletePostMethod();
		deletePostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deletePostMethod.callAPI();
		deletePostMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testCreatePost() {
		PostPostMethod postPostMethod = new PostPostMethod();
		postPostMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postPostMethod.callAPI();
		postPostMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testPutPost() {
		PutPostMethod putPostMethod = new PutPostMethod();
		putPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		putPostMethod.callAPI();
		putPostMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testGetAlbums () {
		GetAlbumMethod getAlbumMethod = new GetAlbumMethod();
		getAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getAlbumMethod.callAPI();
		getAlbumMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getAlbumMethod.validateResponseAgainstJSONSchema("api/albums/_get/rs.schema");
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testDeleteAlbums() {
		DeleteAlbumMethod deleteAlbumMethod = new DeleteAlbumMethod();
		deleteAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteAlbumMethod.callAPI();
		deleteAlbumMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testCreateAlbum() {
		PostAlbumMethod postAlbumMethod = new PostAlbumMethod();
		postAlbumMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postAlbumMethod.callAPI();
		postAlbumMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testPutAlbum() {
		PutAlbumMethod putAlbumMethod = new PutAlbumMethod();
		putAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		putAlbumMethod.callAPI();
		putAlbumMethod.validateResponse();
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testGetComments() {
		GetCommentMethod getCommentMethod = new GetCommentMethod();
		getCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getCommentMethod.callAPI();
		getCommentMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getCommentMethod.validateResponseAgainstJSONSchema("api/comments/_get/rs.schema");
		
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testCreateComment() {
		PostCommentMethod postCommentMethod = new PostCommentMethod();
		postCommentMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postCommentMethod.callAPI();
		postCommentMethod.validateResponse();	
	}
}