
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {

    public static void main(String[] args) {
        // Instantiate Course using default constructor
        Course defaultCourse = new Course();

        // Display default values
        System.out.println("Default Course Values:");
        displayCourseDetails(defaultCourse);

        // Instantiate Course using overloaded constructor
        Course customCourse = new Course(13445, "John Doe", "CSC229");

        // Display custom values
        System.out.println("\nCustom Course Values:");
        displayCourseDetails(customCourse);

        // Update values using setters
        customCourse.setID(22312);
        customCourse.setName("John Doe2");
        customCourse.setCode("CSC229");

        // Display updated values using getters
        System.out.println("\nUpdated Course Values:");
        displayCourseDetails(customCourse);
    }

    private static void displayCourseDetails(Course course) {
        System.out.println("ID: " + course.getID());
        System.out.println("Name: " + course.getName());
        System.out.println("Code: " + course.getCode());
        System.out.println();
    }
}