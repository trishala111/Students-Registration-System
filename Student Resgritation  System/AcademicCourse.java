
/**
 * Write a description of class AcademicCourse here.
 *
 * @author (Trishala Prasai)
 * @version (11.0.02)
 */
public class  AcademicCourse extends Course
{
    //7 instance variables are created: LectureName,Level,Credit,StartDate,CompletionDate,NumberofAssessment,IsRegistered,Isremoved.
    private String LecturerName,Level,Credit,StartDate,CompletionDate ;
    private int NumberofAssessments;
    private boolean IsRegistered;
    /*
     * A constructor is created with 6 parameters:CourseID,CourseID,CourseName,CourseDuration,Level,Credit,NumberofAssessments
     * A call is made to the superclass constructor with three parameters,the  CourseID,CourseName,and CourseDuration.
     * In the constructor,LecturerName,StartingDate and CompletionDate are initialized as an empty ("") string IsRegistered status is initialized false.
     */
    AcademicCourse(String CourseID,String CourseName,int CourseDuration,String Level,String Credit,int NumberofAssessments)
    {
        super(CourseID,CourseName,CourseDuration);
        this.LecturerName ="" ;
        this.StartDate ="";
        this.CompletionDate ="";
        this.IsRegistered = false;
    }
    //Accessor/getter method of LecturerName
    public String getLecturerName()
    {
        return this.LecturerName;
    }
    //Accessor/getter method of Level
    public String getLevel()
    {
        return this.Level;
    }
    //Accessor/getter method of Credit
    public String getCredit()
    {
        return this.Credit;
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
    //Accessor/getter method of Assessments
    public int getNumberofAssessments()
    {
    return this.NumberofAssessments;
    }
    //Mutator/setter method of IsRegistered
    public boolean getIsRegistered()
    {
        return this.IsRegistered;
    }
    //Mutator/setter method of LecturerName
    public void setLecturerName(String LecturerName)
    {
        this.LecturerName = LecturerName;
    }
    //Mutator/setter method of NumberofAssessments
    public void setNumberofAssessments(int NumberofAssessments)
    {
        this.NumberofAssessments = NumberofAssessments;
    }
    //Method to register courses
    public void register(String CourseLeader,String LecturerName,String StartDate,String CompletionDate)
    {
        if(IsRegistered == true) {
            System.out.println("The course is already registered");
            System.out.println("LectureName:" + LecturerName);
            System.out.println("StartingDate:" + StartDate);
            System.out.println("CompletionDate:" + CompletionDate);
        }
        else{
            super.setCourseLeader(CourseLeader);
            this.LecturerName = LecturerName;
            this.StartDate = StartDate;
            this.CompletionDate = CompletionDate;
            this.IsRegistered = true;
        }
    }
    /*
     * A method display calls display method of the superclass
     * Display LecturerName,Level,Credit,StartDate,CompletionDate,NumberofAssessments if the course is already registered
     */
    public void display()
    {
        super.display();
        if (IsRegistered == true) {
            System.out.println("LecturerName:"+ getLecturerName());
            System.out.println("Level:"+ getLevel());
            System.out.println("Credit"+ getCredit());
            System.out.println("StartingDate:"+ getStartDate());
            System.out.println("CompletionDate"+ getCompletionDate());
            System.out.println("NumberofAssessments:"+ getNumberofAssessments());
        }
    }
}
        
            
            
    
    
    
    
    

        
        
    
    
        
        
        
        
        
    

        
    
   

