package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaPartyTest {


		@Test
		public void testIsWomanNotKnighted() {
			TeaParty teaParty = new TeaParty();
			assertEquals("Welcome Ms. Austen", teaParty.welcome("Austen", true, false));
		}

		@Test
		public void testIsManNotKnighted() {
			TeaParty teaParty = new TeaParty();
			assertEquals("Welcome Mr. Orwell", teaParty.welcome("Orwell", false, false));
		}

		@Test
		public void testIsManKnighted() {
			TeaParty teaParty = new TeaParty();
			assertEquals("Welcome Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
		}

		@Test
		public void testIsWomanKnighted() {
			TeaParty teaParty = new TeaParty();
			assertEquals("Welcome Lady Laura", teaParty.welcome("Laura", true, true));
		}

	}


