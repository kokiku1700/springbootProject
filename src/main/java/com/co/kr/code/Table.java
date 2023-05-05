package com.co.kr.code;

import lombok.Getter;

@Getter
public enum Table {

	REZ("rez");
	
	private String table;

	Table(String table){
		this.table = table;
	}
	
}