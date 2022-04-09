import org.hamcrest.MatcherAssert;
import org.hamcrest.generator.HamcrestFactoryWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

public class PhoneBookTest {
    PhoneBook sut;
    @BeforeEach
    public void init(){
        System.out.println("test started");
        sut = new PhoneBook();
    }

    @AfterEach
    public void finished(){
        System.out.println("test finished");
    }

    @Test
    void testAddGroup() {
        //arrange
        String s = "Family";
        Map map;

        //act
        sut.addGroup(s);
        map = sut.getListHashMap();


        //assert
        Assertions.assertTrue(map.size() > 0);

    }

    @Test
    void testAddContactToGroup() {
        //arrange
        String s = "Family";
        Contact contact = new Contact("Vasya", "978-498-15-26");
        Map map;
        sut.addGroup(s);


        //act
        sut.addContactToGroup(s, contact);
        map = sut.getListHashMap();

        //assert
        Assertions.assertNotNull(map.get(s));

    }

    @Test
    void testFindContactByNumber() {
        //arrange
        String s = "Family";
        Contact contact = new Contact("Vasya", "978-498-15-26");
        sut.addGroup(s);
        sut.addContactToGroup(s, contact);

        //assert
        Assertions.assertEquals(sut.findContactByGroup(contact.getPhoneNumber()), contact.getPhoneNumber());


    }
}
