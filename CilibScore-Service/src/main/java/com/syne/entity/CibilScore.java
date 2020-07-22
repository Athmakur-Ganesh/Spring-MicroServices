package com.syne.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Data
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="synCibilScore")
public class CibilScore {
	
	 @Id
	 int  id;
	 String panNumber;
	 String firstName;
	 double score;
	
	 public CibilScore() {
		super();
		
		log.info("*** Cibil Score Initlaized ****");
	}

}
