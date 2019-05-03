package com.school.studentDetails.dto;

public class BookDTO {

	private int id;
	private String bookName;
	private String bookPublisher;
	private String authorName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return String.format("BookDTO [id=%s, bookName=%s, bookPublisher=%s, authorName=%s]", id, bookName,
				bookPublisher, authorName);
	}

}
