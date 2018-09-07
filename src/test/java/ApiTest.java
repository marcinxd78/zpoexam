



import org.springframework.test.context.ContextConfiguration;

import com.app.entity.Actor;
import com.app.entity.Spectacle;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

@ContextConfiguration
public class ApiTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testActor() {
		Spectacle spectacle = new Spectacle();
		Actor actor = new Actor(10, "Andrzej", "Jagiełło", 10000, spectacle);
		assertEquals("UWAGA TESTUJE", 1000, actor.getId());
	}

}
