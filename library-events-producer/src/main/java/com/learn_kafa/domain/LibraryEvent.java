package com.learn_kafa.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class LibraryEvent {
	
	private Integer libraryEventId;
	private LibraryEventType libraryEventType;
	private Book book;
	
}
