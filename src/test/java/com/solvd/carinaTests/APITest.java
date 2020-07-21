package com.solvd.carinaTests;

import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
//import com.jayway.jsonpath.JsonPath;

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
	public void testCRUDPosts () {
		PostPostMethod postPostMethod = new PostPostMethod();
		postPostMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		String rsBody = postPostMethod.callAPI().asString();
		postPostMethod.validateResponse();
		JSONObject obj = new JSONObject(rsBody);
		String postId = ((Integer)obj.optInt("id")).toString();
		
		GetPostMethod getPostMethod = new GetPostMethod();
		getPostMethod.replaceUrlPlaceholder("post_id", postId);
		getPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPostMethod.callAPI();
		getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getPostMethod.validateResponseAgainstSchema("api/posts/_get/rs.schema");
		
		PutPostMethod putPostMethod = new PutPostMethod();
		putPostMethod.replaceUrlPlaceholder("post_id", postId);
		putPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		putPostMethod.callAPI();
		putPostMethod.validateResponse();
		
		DeletePostMethod deletePostMethod = new DeletePostMethod();
		deletePostMethod.replaceUrlPlaceholder("post_id", postId);
		deletePostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deletePostMethod.callAPI();
		deletePostMethod.validateResponse();
	}	
	
	
	@Test
	@MethodOwner(owner="Maia")
	public void testCRUDAlbums () {
		PostAlbumMethod postAlbumMethod = new PostAlbumMethod();
		postAlbumMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		String rsBody = postAlbumMethod.callAPI().asString();
		postAlbumMethod.validateResponse();
		JSONObject obj = new JSONObject(rsBody);
		String albumId = ((Integer)obj.optInt("id")).toString();
		
		GetAlbumMethod getAlbumMethod = new GetAlbumMethod();
		getAlbumMethod.replaceUrlPlaceholder("album_id", albumId);
		getAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getAlbumMethod.callAPI();
		getAlbumMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getAlbumMethod.validateResponseAgainstSchema("api/albums/_get/rs.schema");
		
		PutAlbumMethod putAlbumMethod = new PutAlbumMethod();
		putAlbumMethod.replaceUrlPlaceholder("album_id", albumId);
		putAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		putAlbumMethod.callAPI();
		putAlbumMethod.validateResponse();
		
		DeleteAlbumMethod deleteAlbumMethod = new DeleteAlbumMethod();
		deleteAlbumMethod.replaceUrlPlaceholder("album_id", albumId);
		deleteAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteAlbumMethod.callAPI();
		deleteAlbumMethod.validateResponse();
	}
	
	
	@Test
	@MethodOwner(owner="Maia")
	public void testCreateAndGetComment() {
		PostCommentMethod postCommentMethod = new PostCommentMethod();
		postCommentMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		String rsBody = postCommentMethod.callAPI().asString();
		postCommentMethod.validateResponse();
		JSONObject obj = new JSONObject(rsBody);
		String commentId = ((Integer)obj.optInt("id")).toString();
		
		GetCommentMethod getCommentMethod = new GetCommentMethod();
		getCommentMethod.replaceUrlPlaceholder("comment_id", commentId);
		getCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getCommentMethod.callAPI();
		getCommentMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getCommentMethod.validateResponseAgainstSchema("api/comments/_get/rs.schema");
		
	}
	
}
