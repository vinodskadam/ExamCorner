package com.skew.exammania;

/**
 * Created by vinodskadam on 18-12-2016.
 */
public class GetQuestionDetails {
    String questionInfoTemp = "fill-blanks";
    String questionTextTemp = "As Beijing serenades Nepal’s Prime Minister K P Oli in China this week, should New Delhi be__________about the expanding partnership between our two northern__________?";
    String optionATemp = "avoided, differences";
    String optionBTemp = "concerned, neighbours";
    String optionCTemp = "ignored, unfriendly";
    String optionDTemp = "neglected, distinct";
    String correctAnsTemp = "optionB";
    String topicTemp = "English";
    String questByClassTemp = "Reliable";

    public String getTopicTemp(String qID){
        return topicTemp;
    }
    public String getQuestByClassTemp(String qID){
        return questByClassTemp;
    }
    public String getQuestionText(String qID){
        return questionTextTemp;
    }
    public String getQuestionInfo(String qID){
        return questionInfoTemp;
    }
    public String getOptionA(String qID){
        return optionATemp;
    }
    public String getOptionB(String qID){
        return optionBTemp;
    }
    public String getOptionC(String qID){
        return optionCTemp;
    }
    public String getOptionD(String qID){
        return optionDTemp;
    }
    public String getCorrectAns(String qID){
        return correctAnsTemp;
    }
}
