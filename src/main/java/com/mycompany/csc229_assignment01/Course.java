/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {

    private String name;
    private String code;
    private int ID;

    // Default constructor
    public Course() {
        this.ID = 12012;
        this.name = "Moaath";
        this.code = "CSC229";
    }

    // Overloaded constructor with 3 parameters
    public Course(int ID, String name, String code) {
        this.ID = ID;
        this.name = name;
        this.code = code;
    }

    // Getter and setter methods for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for ID
    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    // Getter and setter methods for Code
    public String getCode(){
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
