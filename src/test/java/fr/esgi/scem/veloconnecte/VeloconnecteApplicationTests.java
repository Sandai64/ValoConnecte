package fr.esgi.scem.veloconnecte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.esgi.scem.veloconnecte.business.User;
import fr.esgi.scem.veloconnecte.enums.Gender;

@SpringBootTest
class VeloconnecteApplicationTests
{

	@Test
	void testUser()
	{
		User user = new User(0, 1994, 64.2f, 178, "+33 6 12 34 56 78", "anonymous", "anonymous@example.com", Gender.MALE);

		assertEquals(0, user.getID());
		assertEquals(1994, user.getBirthYear());
		assertEquals(64.2f, user.getWeight());
		assertEquals(178f, user.getHeight());
		assertEquals("+33 6 12 34 56 78", user.getPhoneNumber());
		assertEquals("anonymous", user.getName());
		assertEquals("anonymous@example.com", user.getEmail());
		assertEquals(Gender.MALE, user.getGender());
	}

}
