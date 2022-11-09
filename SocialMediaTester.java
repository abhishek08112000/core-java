package com.xworkz.inheritance;

import com.xworkz.inheritance.socialmedia.SocialMedia;

public class SocialMediaTester {
	 public static void main(String[] args) {
		 SocialMedia media = new SocialMedia();
		 media.toDoReels("instaa");
		 System.out.println("To make " + media.reel);
		 
		 Instagram gram = new Instagram();
		 gram.toDoReels("videos");
		 
	 }

}
