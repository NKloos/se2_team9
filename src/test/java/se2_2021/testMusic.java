package se2_2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMusic {

	@Test
	void testPlay() throws Exception {
		Music m = new Music(); 
		m.createPlaylist();
		assertEquals(m.playSong(1),"Like a Rolling Stone");
		assertEquals(m.playSong(5),"Respect");
	}
}
