
package se2_2021;

import java.util.HashMap;

public class Music {
	HashMap<Integer, String> playlist = new HashMap<Integer, String>();
	
  void createPlaylist() {
	  	  if (playlist.isEmpty()) {
	  playlist.put(3,"Imagine");
	  playlist.put( 2 ,"(I Can't Get No) Satisfaction");
	  playlist.put(1, "Like a Rolling Stone"	);
	  playlist.put(4, "What's Going On");
	  playlist.put(  6	, "Good Vibrations");
	  playlist.put(5,	"Respect");
	  playlist.put( 7,"Johnny B. Goode");
	  playlist.put( 8, "Hey Jude"	);
	  	 }
	 
  }
  
  
  
  String playSong(int num) throws Exception {
	  if(playlist.isEmpty())
		  throw new Exception("is empty");
	  return playlist.get(num);
	  
  }
  
}
