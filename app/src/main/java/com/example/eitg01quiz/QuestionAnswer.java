package com.example.eitg01quiz;

public class QuestionAnswer {


    public static String[] questions= {
            "På vilket lager i OSI-modellen jobbar vi med Segment",
            "På vilket lager i OSI-modellen finns protokollen UDP och TCP",
            "Hur många bitars address har IPV4",
            "På vilket lager i OSI-modellen hittar vi protokollet HDLC"
    };

    public static String [][] choices= {
            {"Transport","Nätverk","Datalänk","Session"},
            {"Datalänk","Applikation","Transport","Nätverk"},
            {"32","64","128","4"},
            {"Applikation","Session","Nätverk","Datalänk"}
    };

    public static String[] correctAnswers ={
            "Transport",
            "Transport",
            "32",
            "Datalänk"

    };

}
