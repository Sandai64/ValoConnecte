package fr.esgi.scem.veloconnecte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.esgi.scem.veloconnecte.business.BikeConfig;

@SpringBootTest
class VeloconnecteApplicationBikeConfigTests
{

	@Test
	void testBikeConfig()
	{
		BikeConfig config = new BikeConfig(16);
		assertNotNull(config);
		assertEquals(16, config.getWheelRadius());
	}

}
