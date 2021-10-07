import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/*
* Lav TDD på den første user story
		a. Som bruger vil jeg gerne kunne se alle film.

	1. Lav test cases
		a. TESTCASE 1: Er der en film?
		b. TESTCASE 2: Er der flere end en film?
        c. TESTCASE 3: Er der flere end en film fra en liste?
*/

class TDDTest {

    //TESTCASE 1
    @Test
    public void doesMovieExist() {
        Movie movie = new Movie();
        ArrayList<Movie> arrayList = new ArrayList<Movie>();
        arrayList.add(movie);

        int arrayOutput = arrayList.size();
        boolean result;

        //if expectedOutput is bigger than 0 - pass
        //if expectedOutput is smaller than 0 - fail
        if(arrayOutput==0) {
            result=false;
        }else{
            result=true;
        }

        assertEquals(true, result);
    }
}