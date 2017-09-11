//package com.example.android.reportcard;
//
///**
// * Created by me on 8/24/17.
// */
//
//public class ReportCard {
//
//    // Student name
//    private String studentName;
//    // Course grades
//    private int english;
//    private int maths;
//    private int science;
//    private int history;
//    private int art;
//    private int music;
//    // GPA
//    private float gpa;
//
//    // Constructor
//    // I'm not sure of the purpose of this here. Should everything be initialized to empty string, 0, etc...?
//    public ReportCard (String cStudentName, int cEnglish, int cMaths, int cScience, int cHistory, int cArt, int cMusic, float cGpa) {
//        // Can the params share the same name as the private properties or would they shadow them?
//        studentName = cStudentName;
//        english = cEnglish;
//        maths = cMaths;
//        science = cScience;
//        history = cHistory;
//        art = cArt;
//        music = cMusic;
//        gpa = cGpa;
//    }
//
//    // Set name and grades
//    public void setStudentName(String name) {
//        studentName = name;
//    }
//    public void setEnglishGrade(int grade) {
//        english = grade;
//    }
//    public void setMathsGrade(int grade) {
//        maths = grade;
//    }
//    public void setScienceGrade(int grade) {
//        science = grade;
//    }
//    public void setHistoryGrade(int grade) {
//        history = grade;
//    }
//    public void setArtGrade(int grade) {
//        art = grade;
//    }
//    public void setMusicGrade(int grade) {
//        music = grade;
//    }
//
//    // Get name, grades, and gpa
//    public String getStudentName() {
//        return studentName;
//    }
//    public int getEnglishGrade() {
//        return english;
//    }
//    public int getMathsGrade() {
//        return maths;
//    }
//    public int getScienceGrade() {
//        return science;
//    }
//    public int getHistoryGrade() {
//        return history;
//    }
//    public int getArtGrade() {
//        return art;
//    }
//    public int getMusicGrade() {
//        return music;
//    }
//    public float getGpa() {
//            float average = (english + maths + science + history + art + music) / 6;
//            return (average / 100) * 4;
//    }
//
//    // Stringify the report card data
//    @Override
//    public String toString() {
//        // I'm unclear on whether I should be using private variables or the getters here;
//        // On the one hand it seems weird to have getters I'm not using (also do getters in Java not share the same name as their properties?)
//        // On the other it seems weird to have private variables if I'm not going to use them...
//        return "Name: " + studentName + "\n" +
//                "English: " + english + "\n" +
//                "Maths: " + maths + "\n" +
//                "Science: " + science + "\n" +
//                "History: " + history + "\n" +
//                "Art: " + art + "\n" +
//                "Music: " + music + "\n" +
//                "GPA: " + gpa;
//    }
//
//}
