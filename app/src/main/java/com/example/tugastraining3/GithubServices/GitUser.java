package com.example.tugastraining3.GithubServices;

import com.google.gson.annotations.SerializedName;

public class GitUser {

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("private")
	private boolean jsonMemberPrivate;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("node_id")
	private String nodeId;

	public Owner getOwner(){
		return owner;
	}

	public boolean isJsonMemberPrivate(){
		return jsonMemberPrivate;
	}

	public String getFullName(){
		return fullName;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getNodeId(){
		return nodeId;
	}
}