package person.birch.chuckjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokesServiceImplTest {

    private JokesServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new JokesServiceImpl(new ChuckNorrisQuotes());
    }

    @Test
    void getRandomJoke() {
        String actual = service.getRandomJoke();

        System.out.println(actual);

        assertNotNull(actual);
        assertTrue(actual.length() > 0);
    }
}
