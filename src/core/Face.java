package core;

import java.util.ArrayList;
import java.util.List;

public class Face {

    // PIECES ARE PLACED IN THE FOLLOWING MANNER
    //1 2 3
    //4 5 6
    //7 8 9

    List<Piece> pieces = new ArrayList<>();

    public Face(Color color){
        initialize(color);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void initialize(Color color){
        for (int i = 0; i < 9; i++)
            pieces.add(new Piece(color));

    }


    public void printFace(){
        System.out.println("");
        System.out.print(pieces.get(0).color.toString()+ " ");
        System.out.print(pieces.get(1).color.toString()+ " ");
        System.out.print(pieces.get(2).color.toString()+ " ");
        System.out.println("");

        System.out.print(pieces.get(3).color.toString() + " ");
        System.out.print(pieces.get(4) .color.toString()+ " ");
        System.out.print(pieces.get(5).color.toString()+ " ");

        System.out.println("");
        System.out.print(pieces.get(6).color.toString()+ " ");
        System.out.print(pieces.get(7).color.toString()+ " ");
        System.out.print(pieces.get(8).color.toString()+ " ");
        System.out.println("");
    }




}
