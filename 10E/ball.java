import java.util.*;

public class ball {


    public static void main(String[] args)
    {

        //////////////////////////////////////////////////////////////////////
        //match results
        /////////////////////

        String[][] resultsArray ={
                {"Germany", "2", "Scotland", "1"},
                {"Poland", "2", "Germany", "0"},
                {"Germany", "1", "Ireland", "1"},
                {"Poland", "2", "Scotland", "2"},
                {"Scotland", "1", "Ireland", "0"},
                {"Ireland", "1", "Poland", "1"},
                {"Ireland", "1", "Scotland", "1"},
                {"Germany", "3", "Poland", "1"},
                {"Scotland", "2", "Germany", "3"},
                {"Ireland", "1", "Germany", "0"},
                {"Scotland", "2", "Poland", "2"},
                {"Poland", "2", "Ireland", "1"} };

        ///////////////////////////////////////////////////////////////////////

        //points///////

        //{Germany - Ireland - Poland - Scotland}

        int[] pointsArray ={0, 0, 0, 0};

        ///////////////


        System.out.println(
                "\n\n\n\n\nGermany:" + pointsArray[0]
                        +
                        "\nIreland:" + pointsArray[1]
                        +
                        "\nPoland:" + pointsArray[2]
                        +
                        "\nScotland:" + pointsArray[3]
        );



        System.out.println();



        // System.out.println(java.util.Arrays.toString(pointsArray));
        ////////////prints all objects in an array as strings




    }

}