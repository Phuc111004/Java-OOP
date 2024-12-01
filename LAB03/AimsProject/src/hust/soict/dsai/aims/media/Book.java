package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public Book() {
	}
	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) { // Kiểm tra nếu chưa tồn tại trong danh sách
            authors.add(authorName);
            System.out.println("Added author: " + authorName);
        } else {
            System.out.println("Author " + authorName + " is already in the list.");
        }
    }

    // Phương thức xóa tác giả
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) { // Kiểm tra nếu có trong danh sách
            authors.remove(authorName);
            System.out.println("Removed author: " + authorName);
        } else {
            System.out.println("Author " + authorName + " is not in the list.");
        }
    }

}
