import org.junit.jupiter.api.*;

public class loginTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("    это метод beforeAll");
    }

    @BeforeEach
       void beforeEach(){
        System.out.println("    это метод beforeEach");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("    это метод afterAll");
    }

    @Test
    void testlogin(){
        System.out.println("Test first");
        Assertions.assertTrue(3>2);
    }

    @Test
    void testlogin2(){
        System.out.println("Test second");
        Assertions.assertTrue(3>2);
    }

}
