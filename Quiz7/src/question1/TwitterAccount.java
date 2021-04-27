package question1;

import java.util.ArrayList;
import java.util.Collections;

public class TwitterAccount implements Comparable<TwitterAccount>{
    private int numberOfFollowers;
    private String username;

    public TwitterAccount(int numberOfFollowers, String username) {
        this.numberOfFollowers = numberOfFollowers;
        this.username = username;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return numberOfFollowers + ", " + username;
    }
    

	@Override
	public int compareTo(TwitterAccount o) {
		int accounts = (this.getUsername().compareTo(o.getUsername()));
		 if (accounts != 0) {
	            return accounts;
	        }
	        return this.getNumberOfFollowers() - o.getNumberOfFollowers();
	}
	
	  public boolean equals(Object a)
	    {
	        TwitterAccount b = (TwitterAccount)a;
	        if ((this.compareTo(b))==0)
	        {
	            return true;
	        }
	        return false;
	    }
	  
	  public static void main(String[] args) {
		    ArrayList<TwitterAccount> accounts = new ArrayList<>();
		    accounts.add(new TwitterAccount(22, "maria"));
		    accounts.add(new TwitterAccount(550900, "lexfridman"));
		    accounts.add(new TwitterAccount(340900, "foundmyfitness"));
		    accounts.add(new TwitterAccount(22, "abcdxyz"));

		    Collections.sort(accounts);
		    for (TwitterAccount acc : accounts) {
		        System.out.println(acc);
		    }
		}
	  
	  public int hashCode()
	    {
	        return username.hashCode() + numberOfFollowers;
	    }
	  
	  
}