package com.datastructure;

public class Test2 {

	public static void main(String[] args) {

		User[] user;
		user = new User[5];
		user[0] = new User(101, "alex");
		user[1] = new User(102, "sam");
		user[2] = new User(103, "john");
		user[3] = new User(104, "samy");
		user[4] = new User(105, "kane");
		
		for(int i=0; i<user.length; i++) {
			System.out.println(i + " "+ user[i].user_id);
			System.out.println(i + " "+ user[i].user_name);

		}


	}

}
