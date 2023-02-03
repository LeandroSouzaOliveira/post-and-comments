package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment commentOne = new Comment("Have a nice trip");
		Comment commentTwo = new Comment("Wow that's awesome!");
		Post postOne = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		postOne.addComment(commentOne);
		postOne.addComment(commentTwo);
		
		Comment commentTree = new Comment("Good night");
		Comment commentFor = new Comment("May the Force be with you");
		Post postTwo = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		postTwo.addComment(commentTree);
		postTwo.addComment(commentFor);
		
		System.out.println(postOne);
		System.out.println(postTwo);

	}

}
