package core;

import java.util.ArrayList;
import java.util.List;

public class Cube {


    //CUBE IS MADE OF SIX FACES, EACH CONTAINING 9 PIECES
    //FACE ORDER IS 0 up, 1 front, 2 right, 3 back, 4 left, 5 down




    List<Face> faces = new ArrayList<>();


    public void initializeCube(){

    faces.add(new Face(Color.RED));
    faces.add(new Face(Color.ORANGE));
    faces.add(new Face(Color.BLACK));
    faces.add(new Face(Color.WHITE));
    faces.add(new Face(Color.GREEN));
    faces.add(new Face(Color.BLUE));

    }

}
