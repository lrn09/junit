import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandidatesComparatorTest {
    CandidatesComparator sut;

    @BeforeEach
    public void init(){
        System.out.println("test started");
        sut = new CandidatesComparator();
    }

    @AfterEach
    public void finished(){
        System.out.println("test finished");
    }

    @Test
    public void testCompareByName(){
        //arrange
        Candidate candidate1 = new Candidate("Ivan Ivanov",
                "male",
                "18",
                5,
                4);
        Candidate candidate2 = new Candidate("Ivan Ivanov",
                "male",
                "81",
                2,
                3);
        int expected = 0;
        //act
        int result = sut.compare(candidate1, candidate2);

        //assert
        assertEquals(expected, result);

    }
    @Test
    public void testCompareByRelevance(){
        //arrange
        Candidate candidate1 = new Candidate("Ivan Ivanov",
                "male",
                "18",
                2,
                5);
        Candidate candidate2 = new Candidate("Petr Sidorov",
                "male",
                "29",
                4,
                5);
        int expected = -1;

        //act
        int result = sut.compare(candidate1, candidate2);

        //assert
        assertEquals(expected, result);

    }
    @Test
    public void testCompareByRating(){
        //arrange
        Candidate candidate1 = new Candidate("Ivan Ivanov",
                "male",
                "18",
                5,
                5);
        Candidate candidate2 = new Candidate("Ivan Neivanov",
                "male",
                "81",
                5,
                4);
        int expected = 1;
        //act
        int result = sut.compare(candidate1, candidate2);

        //assert
        assertEquals(expected, result);

    }


}
