package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date date;
	private String title;
	private String content;
	private Integer likes;
	
	private List<comment> comments = new ArrayList<>();
	
	public post (Date date2) {
		
	}

	public post(Date date2, String title, String content, Integer likes) {
		this.date = date2;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<comment> getComments() {
		return comments;
	}

	public void addComment(comment Comment) {
		comments.add(Comment);
	}
	public void RemoveComment(comment Comment) {
		comments.remove(Comment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(date) + "\n");
		sb.append(content + "\n");
		String comment = ("Comments: ");
		sb.append(comment + "\n");
		for(comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
		
		
	}
}
