package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    Character[] r1 = getRow1();
    Character[] r2 = getRow2();
    Character[] r3 = getRow3();
    Character[] c1 = getCol1();
    Character[] c2 = getCol1();
    Character[] c3 = getCol1();

    //This is essentially a setter. It is setting the board, there is no return value.
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Character[] getRow1() {
        Character[] row1 = matrix[0];
        return row1;
    }

    public Character[] getRow2() {
        Character[] row2 = matrix[1];
        return row2;
    }

    public Character[] getRow3() {
        Character[] row3 = matrix[2];
        return row3;
    }

    public Character[] getCol1() {
        Character[] col1 = {matrix[0][0], matrix[1][0], matrix[2][0]};
        return col1;
    }

    public Character[] getCol2() {
        Character[] col2 = {matrix[0][1], matrix[1][1], matrix[2][1]};
        return col2;
    }

    public Character[] getcol3() {
        Character[] col3 = {matrix[0][2], matrix[1][2], matrix[2][2]};
        return col3;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 : {
                    if (r1[i].equals('X'))
                        return true; }
                break;
                case 1 : {
                    if (r2[i].equals('X'))
                        return true; }
                break;
                case 2 : {
                    if (r3[i].equals('X'))
                        return true; }
                break;
                case 3 : {
                    if (c1[i].equals('X'))
                        return true; }
                break;
                case 4 : {
                    if (c2[i].equals('X'))
                        return true; }
                break;
                case 5 : {
                    if (c3[i].equals('X'))
                        return true; }
                break;
            }
        } return false;
    }

        // Begin with stubs then flesh out processes.
        // First, create a method that retrieves any of the three rows.
        // Next, create a method to retrieve any of the three columns.
        // Then, create a method that iterates through either row or column and compares values at each index.
        // Establish winning conditions and return isWinner==true.
        // From established conditions return isLoser (!isWinner).
        // From established conditions return isTie.

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 : {
                    if (r1[i].equals('O'))
                        return true; }
                break;
                case 1 : {
                    if (r2[i].equals('O'))
                        return true; }
                break;
                case 2 : {
                    if (r3[i].equals('O'))
                        return true; }
                break;
                case 3 : {
                    if (c1[i].equals('O'))
                        return true; }
                break;
                case 4 : {
                    if (c2[i].equals('O'))
                        return true; }
                break;
                case 5 : {
                    if (c3[i].equals('O'))
                        return true; }
                break;
            }
        } return false;
    }

    public Boolean isTie() {
        if (isInFavorOfX() && isInFavorOfO()) {
            return true;
        } return false;
    }

    public String getWinner() {
        if (isInFavorOfX() && !isInFavorOfO() && !isTie()) {
            return "X marks the spot! X's win!";
        } else if (isInFavorOfO() && !isInFavorOfX() && !isTie()) {
            return "O, O, O you sly fox, you! O's wins!";
        } return null;
    }
}
