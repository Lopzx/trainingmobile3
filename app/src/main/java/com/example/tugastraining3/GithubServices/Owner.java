package com.example.tugastraining3.GithubServices;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Owner")
public class Owner{
	public Owner(String gistsUrl, String reposUrl, String followingUrl, String starredUrl, String login, String followersUrl, String type, String url, String subscriptionsUrl, String receivedEventsUrl, String avatarUrl, String eventsUrl, String htmlUrl, boolean siteAdmin, int id, String gravatarId, String nodeId, String organizationsUrl) {
		this.gistsUrl = gistsUrl;
		this.reposUrl = reposUrl;
		this.followingUrl = followingUrl;
		this.starredUrl = starredUrl;
		this.login = login;
		this.followersUrl = followersUrl;
		this.type = type;
		this.url = url;
		this.subscriptionsUrl = subscriptionsUrl;
		this.receivedEventsUrl = receivedEventsUrl;
		this.avatarUrl = avatarUrl;
		this.eventsUrl = eventsUrl;
		this.htmlUrl = htmlUrl;
		this.siteAdmin = siteAdmin;
		this.id = id;
		this.gravatarId = gravatarId;
		this.nodeId = nodeId;
		this.organizationsUrl = organizationsUrl;
	}
	public Owner(Owner e) {
		this.gistsUrl = e.gistsUrl;
		this.reposUrl = e.reposUrl;
		this.followersUrl = e.followersUrl;
		this.starredUrl = e.starredUrl;
		this.login = e.login;
		this.followersUrl = e.followersUrl;
		this.type = e.type;
		this.url = e.url ;
		this.subscriptionsUrl = e.subscriptionsUrl ;
		this.receivedEventsUrl = e.receivedEventsUrl ;
		this.avatarUrl = e.avatarUrl ;
		this.eventsUrl = e.eventsUrl ;
		this.htmlUrl = e.htmlUrl ;
		this.siteAdmin = e.siteAdmin ;
		this.id = e.id ;
		this.gravatarId = e.gravatarId ;
		this.nodeId = e.nodeId ;
		this.organizationsUrl = e.organizationsUrl ;
	}

	@SerializedName("gists_url")
	private String gistsUrl;

	@SerializedName("repos_url")
	private String reposUrl;

	@SerializedName("following_url")
	private String followingUrl;

	@SerializedName("starred_url")
	private String starredUrl;

	@SerializedName("login")
	private String login;

	@SerializedName("followers_url")
	private String followersUrl;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("subscriptions_url")
	private String subscriptionsUrl;

	@SerializedName("received_events_url")
	private String receivedEventsUrl;

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("events_url")
	private String eventsUrl;

	@SerializedName("html_url")
	private String htmlUrl;

	@SerializedName("site_admin")
	private boolean siteAdmin;

	@PrimaryKey
	@SerializedName("id")
	private int id;

	@SerializedName("gravatar_id")
	private String gravatarId;

	@SerializedName("node_id")
	private String nodeId;

	@SerializedName("organizations_url")
	private String organizationsUrl;

	public String getGistsUrl(){
		return gistsUrl;
	}

	public String getReposUrl(){
		return reposUrl;
	}

	public String getFollowingUrl(){
		return followingUrl;
	}

	public String getStarredUrl(){
		return starredUrl;
	}

	public String getLogin(){
		return login;
	}

	public String getFollowersUrl(){
		return followersUrl;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}

	public String getSubscriptionsUrl(){
		return subscriptionsUrl;
	}

	public String getReceivedEventsUrl(){
		return receivedEventsUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public String getEventsUrl(){
		return eventsUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public boolean isSiteAdmin(){
		return siteAdmin;
	}

	public int getId(){
		return id;
	}

	public String getGravatarId(){
		return gravatarId;
	}

	public String getNodeId(){
		return nodeId;
	}

	public String getOrganizationsUrl(){
		return organizationsUrl;
	}
}