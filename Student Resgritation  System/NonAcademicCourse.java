
/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (Trishala Prasai)
 * @version (11.0.02)
 */
public class  NonAcademicCourse extends Course
   {
    //7 instance variable are created InstructorName,StartDate,CompleteionDate,ExamDate,Prerequisite,IsRegistered,IsRemoved
    private String InstructorName,StartDate,CompletionDate,ExamDate,Prerequisite;
    private int CourseDuration;
    private boolean IsRegistered,IsRemoved;

    NonAcademicCourse(String CourseID,String CourseName,int CourseDuration,String Prerequisite)
    {
        /*
         * A constructor is created with 4 parameters: CourseID,CourseName,CourseDuration,Prerequissite
         * A call is made to superclass constructor with three parameters,the CourseID,CourseName,and Duration.
         * In the constructor ,StartDate ,CompletionDate and ExamDate are initialized as an empty string(""),and IsRegisterd and IsRemoved.
         */
        super(CourseID,CourseName,CourseDuration);
        this.Prerequisite = Prerequisite;
        this.StartDate = "";
        this.CompletionDate ="";
        this.ExamDate = "";
        this.IsRegistered = false;
        this.IsRemoved = false;
    }
    //Accessor/getter method of InstructorName 
    public String getInstructorName()
    {
        return this.InstructorName;
    }
    //Accessor/getter method of StartDate
    public String getStartDate()
    {
        return this.StartDate;
    }
    //Accessor/getter method of CompletionDate
    public String getCompletionDate()
    {
       return this.CompletionDate;
    }
    //Accessor/getter method of ExamDate
    public String getExamDate()
    {
        return this.ExamDate;
     }
     //Accessor/getter method of Prerequisite
    public String getPrerequisite()
    {
        return this.Prerequisite;
    }
    //Accessor/getter method of IsRegistered
    public boolean getIsRegisterd()
    {
        return this.IsRegistered;
    }
    //Accessor/getter method of IsRemoved
    public boolean getIsRemoved()
    {
        return this.IsRemoved;
    }
    //Mutator/setter method of InstructorName
    public void setInstructorName(String InstructorName)
    {
        if (IsRegistered == false){
            this.InstructorName = InstructorName;
        }
         else if (IsRegistered == true) {
           System.out.println("The course is already registered.Therefore, the instructor name can't be changed.");
        }
    }
    //Method to register a course
    public void register(String CourseLeader,String InstructorName,String StartDate,String CompletionDate,String ExamDate)
    {
        if (IsRegistered == false) {
            setInstructorName(InstructorName);
            this.IsRegistered = true;
        }
        else { 
            System.out.println("The cousre is already registered.");
        }
    }
    //Method to remove a course
    public void remove()
    { 
        if (IsRemoved == true) {
            System.out.println("The course is already removed");
        }
        else if (IsRemoved == false) {
            super.setCourseLeader("");
            this.InstructorName = "";
            this.StartDate = "";
            this.CompletionDate = "";
            this.ExamDate = "";
            this.IsRegistered = false;
            this.IsRemoved = true;
        }
    }
    /*
     * A method display calls display method of the superclass
     * Display InstructorName,StartDate,CompletionDate,ExamDate if the course is already registered
     */
    public void display()
    {
       super.display();
          if (IsRegistered == true) {
          System.out.println("InstructorName:" + getInstructorName());
          System.out.println("StartingDate:" + getStartDate());
          System.out.println("CompletionDate:" + getCompletionDate());
          System.out.println("ExamDate:" + getExamDate());
            }
        }
    }
            
            
            

        
    
    
