package client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client c1 = new Client("Stephen", 22, Gender.MALE);;
    private Client c2 = new Client("Mary", 20, Gender.FEMALE);

    @Test
    void getName() {
        assertEquals("Stephen", c1.getName());
        assertEquals("Mary", c2.getName());
    }

    @Test
    void getAge() {
        assertEquals(22, c1.getAge());
        assertEquals(20, c2.getAge());
    }

    @Test
    void getSex() {
        assertEquals(Gender.MALE, c1.getSex());
        assertEquals(Gender.FEMALE, c2.getSex());
    }
}