package com.example.finalprojectminigame;

import java.util.ArrayList;

public class BracketCommands {
   //these "bracket commands" will aide the player in finding the correct answer or reset their tries
    static ArrayList<String> bracketCommands = new ArrayList<>();

    static void removeDudCommands(){
        bracketCommands.add("<>");
        bracketCommands.add("[./:#@!]");
        bracketCommands.add("{>}");
        bracketCommands.add("(,.#)");
        bracketCommands.add("<<;?#!@>");
        bracketCommands.add("(.$%&)");
    }
    static String resetTries = "<#/[:!>";
}
