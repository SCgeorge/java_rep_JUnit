import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gradeTest {
    @Test
    void mustBeACharA() {
        var mark = new grade();
        assertEquals('A', mark.chooseLetterGrade(91));
    }

    @Test
    void mustBeACharB() {
        var mark = new grade();
        assertEquals('B', mark.chooseLetterGrade(89));
    }
    @Test
    void mustBeACharF() {
        var mark = new grade();
        assertEquals('F', mark.chooseLetterGrade(0));
    }

}