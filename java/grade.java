public class grade {

    public char chooseLetterGrade(int numGrade){
        if(numGrade < 0){
            throw new IllegalArgumentException("Undefined");
        }
        else if(numGrade < 40){
            return 'F';
        }
        else if(numGrade < 60){
            return 'D';
        }
        else if(numGrade < 70){
            return 'C';
        }
        else if(numGrade < 90){
            return 'B';
        }
        else if(numGrade < 100){
            return 'A';
        }
        return 0;
    }
}