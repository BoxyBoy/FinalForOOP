package com.example.finalprojectminigame;

import android.content.Intent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prompt {

    ArrayList<String> bracketCommands = BracketCommands.bracketCommands;
    String resetTries = BracketCommands.resetTries;
    ArrayList<String> wrongEasyAnswers = VocabEasy.wrongEasyAnswers;
    String correctEasyAnswer = VocabEasy.correctAnswer;
    ArrayList<String> wrongMediumAnswers= VocabMedium.wrongMediumAnswers;
    String correctMediumAnswer = VocabMedium.correctAnswer;
    ArrayList<String> wrongHardAnswers = VocabHard.wrongHardAnswers;
    String correctHardAnswer = VocabHard.correctAnswer;


    String thePrompt;

    public void stringCall(String difficulty){
        if(difficulty.equals("easy")){
            thePrompt = "[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongEasyAnswers.get(0) + "><-\n+#$!@%$#@"
                    + wrongEasyAnswers.get(1) + ")(!#**@\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2)
                    + "))(#$$\n@!-.<'" + wrongEasyAnswers.get(2) + "!#@-]{|!!>\n" + correctEasyAnswer + "$%#@!':.@/<+*&%$\n" + bracketCommands.get(3) + "?$#%[}("
                    + bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongEasyAnswers.get(3) + "(}][}\n'$?;<!#%@%z^&*" + wrongEasyAnswers.get(4)
                    + ")!]\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongEasyAnswers.get(5)
                    + ",,.?//)(\n" + wrongEasyAnswers.get(6) + "!@##$%--" + wrongEasyAnswers.get(7) + "/><#\n%%^$@*;:" + wrongEasyAnswers.get(8) + "!^*^#@#<";
        } else if (difficulty.equals("medium")){
            thePrompt = "[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongMediumAnswers.get(0) + "-\n+#$!@%$#@"
                    + wrongMediumAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2)
                    + "))(#$$\n@!-.<'" + wrongMediumAnswers.get(2) + "!#@-]{|!\n" + correctMediumAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}("
                    + bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongMediumAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongMediumAnswers.get(4)
                    + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongMediumAnswers.get(5)
                    + ",,.?//\n" + wrongMediumAnswers.get(6) + "!@##$%--" + wrongMediumAnswers.get(7) + "\n%%^$@*;:" + wrongMediumAnswers.get(8) + "!^*^#@";
        } else if(difficulty.equals("hard")){
            thePrompt = "[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;}" + bracketCommands.get(0) + "!@\n%$#:!><./#}{" + wrongHardAnswers.get(0) + "-\n#$!@%$#@"
                    + wrongHardAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2)
                    + "))(#$$\n@.<'" + wrongHardAnswers.get(2) + "!#@-]{|!\n" + correctHardAnswer + "$%#':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}("
                    + bracketCommands.get(4) + "\n$,-=+!-+=" + wrongHardAnswers.get(3) + "(}]\n'$?;<%@%z^&*" + wrongHardAnswers.get(4)
                    + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongHardAnswers.get(5)
                    + ".?//\n" + wrongHardAnswers.get(6) + "##$%" + wrongHardAnswers.get(7) + "\n%$@*;:" + wrongHardAnswers.get(8) + "!^*^#@";
        }
    }

}
