
/**
 * Write a description of class Course here.
 *
 * @author (Trishala Prasai)
 * @version (11.0.02)
 */
public class Course
{
    //Four instance variable are created: CourseID,CourseName,CourseLeader,CourseDuration
    private String CourseID;
    private String CourseName;
    private String CourseLeader;
    private int CourseDuration;
    /*
     * A constructor is created with 3 parameters:
     * The CourseID,CourseName and CourseDuration are installed in the constructor by being assigned the value of the constructor's parameters.
     * The CourseLeader is initialized with empty string("") in the constructor.
     */
    
    Course(String CourseID,String CourseName, int CourseDuration)
    {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.CourseLeader = "";
        this.CourseDuration = CourseDuration;
    }
    //Accessor/getter method of CourseID
    public String getCourseID()
     {
       return this.CourseID;
    }
     //Accessor/getter method of CourseName
    public String getCourseName()
    {
        return this.CourseName;
    }
     //Accessor/getter method of CourseLeader
    public String getCourseLeader()
    {
        return this.CourseLeader;
    }
     //Mutator/Setter method of Course Leader
    public void setCourseLeader(String CourseLeader)
    {
        this.CourseLeader = CourseLeader;
    }
     //Accessor/getter method of CourseDuration
    public  int getCourseDuration()
    {
        return this.CourseDuration;
     }  
     //Method for displaying CourseID,CourseName,CourseLeader,CourseDuration
    public void display()
     {
        System.out.println("CourseID:"+getCourseID());
        System.out.println("CourseName:"+getCourseName());
       if (getCourseLeader() != "") {
        System.out.println("CousreLeader:"+getCourseLeader());
        }
     System.out.println("CousreDuration:"+getCourseDuration());
    }
}



    

