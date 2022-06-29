package com.example.tugastraining3.GithubServices;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

@Entity(tableName = "repo")
public class GitUser {

	@Ignore
	@SerializedName("owner")
	private Owner owner;

	@SerializedName("private")
	private boolean jsonMemberPrivate;

	@ColumnInfo(name = "full_name")
	@SerializedName("full_name")
	private String fullName;

	@ColumnInfo(name = "name")
	@SerializedName("name")
	private String name;

	@PrimaryKey
	@SerializedName("id")
	private int id;

	@SerializedName("node_id")
	private String nodeId;

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setJsonMemberPrivate(boolean jsonMemberPrivate) {
		this.jsonMemberPrivate = jsonMemberPrivate;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

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