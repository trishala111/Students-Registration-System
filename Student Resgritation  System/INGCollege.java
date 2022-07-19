
/**
 * Write a description of class INonGCollege here.
 *
 * @author (Trishala Prasai)
 * @version (11.0.02)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class INGCollege implements ActionListener
{
    //Declaration of instance variables
    //Instance Variable for JFrame
    private JFrame frame1, frame2,frame;

    //Instance variable for JPanel
    private JPanel panel1, panel2 ,panel;

    //Instance variable for text-labels --JLabels
    private JLabel academic_head_label,non_academic_head_label,add_one_label,
    courseid_one_label,courseid_two_label,course_name_label,duration_label,assessments_label,
    credit_label,level_label,register_one_label,course_leader_label,lecturer_name_label,start_date_label,
    complete_date_label,exam_date_label,choose_label,prerequisite_label;

    //Instance variable for textfields--JTextFields
    private JTextField prerequisite_text_field,courseid_text_field,n_courseid_text_field,
    courseid_two_text_field,n_courseid_two_text_field,course_name_text_field,n_course_name_text_field,
    course_leader_text_field,n_course_leader_text_field,duration_text_field,n_duration_text_field,
    lecturer_text_field,n_lecturer_text_field,level_text_field,credit_text_field,assessments_text_field;

    //Instance variables for JComboBox
    private JComboBox start_one_combobox,start_two_combobox,start_three_combobox,n_start_one_combobox,
    n_start_two_combobox,n_start_three_combobox,complete_one_combobox,complete_two_combobox,
    complete_three_combobox,n_complete_one_combobox,n_complete_two_combobox,n_complete_three_combobox,
    exam_one_combobox,exam_two_combobox,exam_three_combobox,n_exam_one_combobox,n_exam_two_combobox,n_exam_three_combobox;

    //Instance variables for Buttons --JButton
    private JButton clear_b,n_clear_b,display_b,n_display_b,register_b,n_register_b,add_b
    ,n_add_b,n_remove_b,acedemic_b,n_academic_b,change_b,n_change_b;

    //Instance variables for string
    private String Addacdemic_id, Addacademic_name,Addacademic_duration,AddAcademic_Level,
    AddAcademic_Credit,AddAcademic_Assessments,AddAcademic_Prerequisite,registerAcademic_id,AddNonAcademic_id,AddNonAcademic_name,
    AddNonAcademic_duration,AddAcademic_duration,AddNonAcademic_Prerequisite,AddAcademic_id,registeracademic_id,registerAcademic_Name,
    registerAcademic_Lecturer,NonregisterAcademic_Year,registerStart_Year,registerStart_Month,registerStart_Day,Start_Date,registerComplete_Year,
    registerComplete_Month,registerComplete_Day,Completion_Date,start_date,
    NonregisterStart_Year,NonregisterStart_Month,NonregisterStart_Day,NonregisterComplete_Year,NonregisterComplete_Month,NonregisterComplete_Day,
    NonregisterExam_Year,NonregisterExam_Month,NonregisterExam_Day,Exam_Date;

    //Instance variable for int
    private int a_assessments , a_Nonduration,a_duration;
    private AcademicCourse tt;
    private NonAcademicCourse pp;

    static AcademicCourse obj_Academic;
    static NonAcademicCourse obj_NonAcademic;

    static INGCollege main = new INGCollege();

    ArrayList<Course> alist = new ArrayList<Course>();
    private NonAcademicCourse AddNonAcademic_lecturer;

    //method for GUI of academic course
    public void GUI1()
    {
        frame1 = new JFrame("Academic Course Form");
        panel1 = new JPanel();
        panel1.setLayout(null); 
        Color panel1_color = new Color(221, 218, 240);
        panel1.setBackground(panel1_color);

        //JLabel -->Academic Course
        academic_head_label = new JLabel("Academic Course");
        academic_head_label.setBounds(180 , 20 , 500 , 20);
        Font academic_font = new Font ("Times New Roman" , Font.PLAIN,25);
        Color academic_color = new Color (25, 15, 84);
        academic_head_label.setForeground(academic_color);
        academic_head_label.setFont(academic_font);
        panel1.add(academic_head_label);

        //Creating a color for add section
        Color add_color = new Color(1, 10, 18);

        //JLabel -->add
        add_one_label = new JLabel ("Add course here.");
        add_one_label.setBounds (20 , 60 , 400 , 20);
        Font add_one_font_label = new Font("SansSerif",Font.PLAIN,20);
        add_one_label.setForeground(add_color);
        add_one_label.setFont(add_one_font_label);
        panel1.add(add_one_label);

        //JText Field Color
        Color field_color = new Color (245 , 245 , 245);

        //JLabel -->Course Id
        courseid_one_label = new JLabel ("Course ID:");
        courseid_one_label.setBounds (20 , 90 , 100 ,20);
        Font courseid_one_label_font = new Font ("SandSerif", Font.PLAIN,15);
        courseid_one_label.setForeground(add_color);
        courseid_one_label.setFont(courseid_one_label_font);
        panel1.add(courseid_one_label);

        //JTextField
        courseid_text_field = new JTextField();
        courseid_text_field.setBackground(field_color);
        courseid_text_field.setBounds (20, 105 ,200 ,35);
        panel1.add(courseid_text_field);

        //JLabel -->CourseName
        course_name_label = new JLabel ("Course Name");
        course_name_label.setBounds(20 , 145 , 200 , 20);
        Font course_name_label_Font = new Font ("SandSerif",Font.PLAIN,15);
        course_name_label.setForeground(add_color);
        course_name_label.setFont(course_name_label_Font);
        panel1.add(course_name_label);

        //JTextField
        course_name_text_field = new JTextField();
        course_name_text_field.setBackground(field_color);
        course_name_text_field.setBounds(20 , 160 ,200 ,35);
        panel1.add(course_name_text_field);

        //JLabel --> Duration
        duration_label = new JLabel ("Duration:");
        duration_label.setBounds (20 , 205 , 200 , 20);
        Font duration_Font_label=new Font("SandSerif" , Font.PLAIN,15);
        duration_label.setForeground (add_color);
        duration_label.setFont(duration_Font_label);
        panel1.add(duration_label);

        //JtextField 
        duration_text_field = new JTextField();
        duration_text_field.setBackground(field_color);
        duration_text_field.setBounds (20 , 220 , 200 ,35);
        panel1.add(duration_text_field);

        //JLabel --.Level
        level_label = new JLabel ("Level");
        level_label.setBounds (20 , 260 , 200 , 20);
        Font level_Font_label = new Font ("sanSerif" , Font.PLAIN,15);
        level_label.setForeground(add_color);
        level_label.setFont(level_Font_label);
        panel1.add(level_label);

        //JTextField
        level_text_field = new JTextField();
        level_text_field.setBackground(field_color);
        level_text_field.setBounds (20 , 275 , 200 , 35);
        panel1.add(level_text_field);

        //JLabel -->Credit
        credit_label = new JLabel ("Credit:");
        credit_label.setBounds (20, 315, 200, 20);
        Font credit_Font_label = new Font ("SandSerif", Font.PLAIN,15);
        credit_label.setForeground(add_color);
        credit_label.setFont(credit_Font_label);
        panel1.add(credit_label);

        //JTextField 
        credit_text_field = new JTextField();
        credit_text_field.setBackground(field_color);
        credit_text_field.setBounds (20 , 330 , 200 , 35);
        panel1.add(credit_text_field);

        //JLabel -->Number of Assesment
        assessments_label = new JLabel ("Number Of Assesssments:");
        assessments_label.setBounds (20 , 370 , 200 , 20);
        Font assessments_Font_label = new Font ("SandSerif",Font.PLAIN,15);
        assessments_label.setForeground(add_color);
        assessments_label.setFont(assessments_Font_label);
        panel1.add(assessments_label);

        //JTextField
        assessments_text_field = new JTextField();
        assessments_text_field.setBounds(20,385,200,35);
        assessments_text_field.setBackground(field_color);
        panel1.add(assessments_text_field);

        //JButton -->Add Course
        add_b = new JButton ("Add");
        add_b.setBounds(20 , 420 , 200 , 35);
        add_b.setForeground (add_color);
        add_b.addActionListener(this);
        panel1.add(add_b);

        //creating color for register section
        Color register_color = new Color (1, 10, 18);

        //JLabel -->register
        register_one_label = new JLabel ("Register course here.");
        register_one_label.setBounds (260 , 60 , 400 , 20);
        Font register_one_label_font = new Font ("SandsSerif",Font.PLAIN,20);
        register_one_label.setForeground(register_color);
        register_one_label.setFont(register_one_label_font);
        panel1.add(register_one_label);

        //JButton -->Register Course
        register_b = new JButton ("Register");
        register_b.setBounds (260 , 360 , 200 , 35);
        register_b.setForeground(register_color);
        register_b.setBackground(field_color);
        register_b.addActionListener(this);
        panel1.add(register_b);

        //JLabel -->Course Id 2
        courseid_two_label = new JLabel ("Course ID");
        courseid_two_label.setBounds (260 , 90 , 100 , 20);
        Font courseid_two_label_Font = new Font("SanSerif", Font.PLAIN,15);
        courseid_two_label.setForeground(register_color);
        courseid_two_label.setFont(courseid_two_label_Font);
        panel1.add(courseid_two_label);

        //JTextField
        courseid_two_text_field = new JTextField();
        courseid_two_text_field.setBounds (260 , 105 , 200 ,35);
        courseid_two_text_field.setBackground(field_color);
        panel1.add(courseid_two_text_field);

        //JLabel -->Course Leader
        course_leader_label = new JLabel ("Course Leader");
        course_leader_label.setBounds (260 , 145 , 200 , 20);
        Font course_leader_label_Font = new Font ("SandSerif", Font.PLAIN,15);
        course_leader_label.setForeground(register_color);
        course_leader_label.setFont(course_leader_label_Font);
        panel1.add(course_leader_label);

        //JTextField
        course_leader_text_field = new JTextField();
        course_leader_text_field.setBounds (260 , 160 , 200 , 35);
        course_leader_text_field.setBackground (field_color);
        panel1.add(course_leader_text_field);

        //JLabel -->Lecturer Name
        lecturer_name_label = new JLabel ("Lecturer Name");
        lecturer_name_label.setBounds (260 , 205 , 200 , 20);
        Font lecturer_name_label_Font = new Font ("SanSerif", Font.PLAIN,15);
        lecturer_name_label.setForeground (register_color);
        lecturer_name_label.setFont(lecturer_name_label_Font);
        panel1.add(lecturer_name_label);

        //JTextField 
        lecturer_text_field = new JTextField();
        lecturer_text_field.setBackground (field_color);
        lecturer_text_field.setBounds (260 , 220, 200 , 35);
        panel1.add(lecturer_text_field);

        //JLabel -->Starting Date
        start_date_label = new JLabel ("Starting Date:");
        start_date_label.setBounds(260 , 260 , 200 , 20);
        Font start_date_label_Font=new Font ("SandSerif",Font. PLAIN,15);
        start_date_label.setForeground(register_color);
        start_date_label.setFont(start_date_label_Font);
        panel1.add(start_date_label);

        //JComboBox
        //year
        String[] start_year_combobox = {"2018","2019","2020","2021","2022","2023","2024","2025","2026","2027"};
        start_one_combobox = new JComboBox(start_year_combobox);
        start_one_combobox.setBounds (260, 275 , 90 , 30);
        panel1.add(start_one_combobox);

        //Month
        String[] start_month_combobox = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        start_two_combobox = new JComboBox(start_month_combobox);
        start_two_combobox.setBounds (345 , 275 , 120 , 30);
        panel1.add(start_two_combobox);

        //Day
        String[] start_day_combobox = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        start_three_combobox = new JComboBox(start_day_combobox);
        start_three_combobox.setBounds(460 , 275 , 70 , 30);
        panel1.add(start_three_combobox);

        //JLabel -->Completion Date
        complete_date_label = new JLabel("Completion Date:");
        complete_date_label.setBounds (260, 315 , 200 , 20);
        Font complete_label_Font = new Font("SandSerif",Font.PLAIN,15);
        complete_date_label.setForeground(register_color);
        complete_date_label.setFont(complete_label_Font);
        panel1.add(complete_date_label);
        //JComboBox
        //Year
        String[] complete_year_combobox= {"2018","2019","2020","2021","2022","2023","2024","2025","2026","2027"};
        complete_one_combobox = new JComboBox (complete_year_combobox);
        complete_one_combobox.setBounds (260, 330 , 100 , 30);
        panel1.add(complete_one_combobox);
        //Month
        String[] complete_month_combobox={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        complete_two_combobox = new JComboBox(complete_month_combobox);
        complete_two_combobox.setBounds(350 , 330 , 120 , 30);
        panel1.add(complete_two_combobox);

        //Day
        String[] complete_day_combobox = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        complete_three_combobox = new JComboBox (complete_day_combobox);
        complete_three_combobox.setBounds (470, 330 , 70 , 30);
        panel1.add(complete_three_combobox);  

        //JButton -->Display
        display_b = new JButton("Display");
        display_b.setBounds (400 , 410 , 100 , 45);
        display_b.setForeground(Color.PINK);
        display_b.addActionListener(this);
        panel1.add(display_b);

        //JButton -->Clear
        clear_b = new JButton("Clear");
        clear_b.setBounds (260 , 410 , 100 , 45);
        clear_b.setForeground(Color.PINK);
        clear_b.addActionListener(this);
        panel1.add(clear_b);

        frame1.add(panel1);
        frame1.setBounds(30 , 40 ,550 , 500 );
        frame1.setResizable(false);
        frame1.setVisible(true);  
    }

    //method for GUI of Non_Academic Course
    public void GUI2()
    {
        frame2 = new JFrame("");
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        Color panel2_Color = new Color (221, 218, 240);
        panel2.setBackground(panel2_Color);

        //JLabel --> Non Academic Course
        non_academic_head_label = new JLabel ("Non Academic Course");
        non_academic_head_label.setBounds (200 , 20 , 200 , 20);
        Font non_academic_label_Font = new Font ("Times New Roman",Font.PLAIN,21);
        Color non_academic_label_Color = new Color (25, 15, 84);
        non_academic_head_label.setForeground (non_academic_label_Color);
        non_academic_head_label.setFont (non_academic_label_Font);
        panel2.add(non_academic_head_label);

        //Creating a color for add section
        Color add_color = new Color (1, 10, 18);

        //JLabel -->Add
        add_one_label = new JLabel ("Add Course Here.");
        add_one_label.setBounds (20 , 60 , 400 , 20);
        Font add_one_label_Font = new Font ("SansSerif",Font.PLAIN,20);
        add_one_label.setForeground (add_color);
        add_one_label.setFont (add_one_label_Font);
        panel2.add(add_one_label);

        //JText Field Color
        Color Field_color = new Color (245, 245 , 245);

        //JLabel -->Course Id
        courseid_one_label = new JLabel ("Course ID:");
        courseid_one_label.setBounds (20 , 90 , 100 , 20);
        Font courseid_one_label_Font = new Font ("SanSerif",Font.PLAIN,15);
        courseid_one_label.setForeground (add_color);
        courseid_one_label.setFont (courseid_one_label_Font);
        panel2.add(courseid_one_label);

        //JTextField
        n_courseid_text_field = new JTextField();
        n_courseid_text_field.setBackground(Field_color);
        n_courseid_text_field.setBounds (20 , 105 , 200 , 35);
        panel2.add(n_courseid_text_field);

        //JLabel  --> CourseName
        course_name_label = new JLabel ("Course Name");
        course_name_label.setBounds (20 , 145 , 200 , 20);
        Font course_name_label_Font = new Font ("SandSerif",Font.PLAIN,15);
        course_name_label.setForeground(add_color);
        course_name_label.setFont(course_name_label_Font);
        panel2.add(course_name_label);

        //JTextField
        n_course_name_text_field = new JTextField();
        n_course_name_text_field.setBounds (20 , 160 , 200 , 35);
        n_course_name_text_field.setBackground(Field_color);
        panel2.add (n_course_name_text_field);

        //JLabel -->Duration
        duration_label = new JLabel("Duration");
        duration_label.setBounds (20,205,200,20);
        Font duration_label_Font = new Font("SandSerif",Font.PLAIN,15);
        duration_label.setForeground(add_color);
        duration_label.setFont(duration_label_Font);
        panel2.add(duration_label);

        //JTextField
        n_duration_text_field = new JTextField();
        n_duration_text_field.setBackground(Field_color);
        n_duration_text_field.setBounds(20,220,200,35);
        panel2.add(n_duration_text_field);

        //JLabel -->prerequisite
        prerequisite_label = new JLabel ("Prerequisite:");
        prerequisite_label.setBounds (20 , 260 , 200 , 20);
        Font prerequisite_label_Font = new Font ("SandSerif",Font.PLAIN,15);
        prerequisite_label.setForeground(add_color);
        prerequisite_label.setFont(prerequisite_label_Font);
        panel2.add(prerequisite_label);

        //JTextField
        prerequisite_text_field = new JTextField();
        prerequisite_text_field.setBackground(Field_color);
        prerequisite_text_field.setBounds(20 , 275 , 200 ,35);
        panel2.add(prerequisite_text_field);

        //JButton -->Add Course
        n_add_b = new JButton ("Add");
        n_add_b.setBounds (20 , 315 , 200 ,35);
        n_add_b.setForeground (add_color);
        n_add_b.addActionListener(this);
        panel2.add(n_add_b);  

        //Creating Color For Register Section
        Color Register_Color = new Color (1, 10, 18);

        //JLabel -->Register
        register_one_label = new JLabel ("Register Course Here.");
        register_one_label.setBounds (260 , 60 , 200 , 20);
        Font register_one_label_Font = new Font ("SandSerif" , Font.PLAIN,18);
        register_one_label.setForeground(Register_Color);
        register_one_label.setFont(register_one_label_Font);
        panel2.add(register_one_label);

        //JLabel -->Course Id2
        courseid_two_label = new JLabel ("Course ID:");
        courseid_two_label.setBounds (260, 90 , 100 , 20);
        Font courseid_two_label_Font = new Font ("SandSerif" , Font.PLAIN,15);
        courseid_two_label.setForeground (Register_Color);
        courseid_two_label.setFont(courseid_two_label_Font);
        panel2.add(courseid_two_label);

        //JTextField
        n_courseid_two_text_field = new JTextField();
        n_courseid_two_text_field.setBounds (260 , 105 , 200 , 35);
        n_courseid_two_text_field.setBackground(Field_color);
        panel2.add(n_courseid_two_text_field);

        //JLabel -->Course Leader
        course_leader_label = new JLabel ("Course Leader:");
        course_leader_label.setBounds (260,145, 200 ,20);
        Font course_leader_label_Font = new Font ("SanSerif", Font.PLAIN,15);
        course_leader_label.setForeground (Register_Color);
        course_leader_label.setFont(course_leader_label_Font);
        panel2.add(course_leader_label);

        //JTextField
        n_course_leader_text_field = new JTextField();
        n_course_leader_text_field.setBounds (260, 160 , 200 , 35);
        n_course_leader_text_field.setBackground(Field_color);
        panel2.add(n_course_leader_text_field);

        //JLabel -->Lecturer Name
        lecturer_name_label = new JLabel ("Instructor name");
        lecturer_name_label.setBounds (260 , 205 , 200 , 20);
        Font lecturer_name_label_Font = new Font ("SandSerif",Font.PLAIN,15);
        lecturer_name_label.setForeground (Register_Color);
        lecturer_name_label.setFont (lecturer_name_label_Font);
        panel2.add(lecturer_name_label);

        //JTextField
        n_lecturer_text_field = new JTextField();
        n_lecturer_text_field.setBackground (Field_color);
        n_lecturer_text_field.setBounds(260 , 220 , 200 , 35);
        panel2.add(n_lecturer_text_field);

        //JLabel -->Starting Date
        start_date_label = new JLabel("Starting date");
        start_date_label.setBounds (260, 260 , 200 , 20);
        Font start_date_label_Font = new Font ("SandSerif",Font.PLAIN,15);
        start_date_label.setForeground(Register_Color);
        start_date_label.setFont(start_date_label_Font);
        panel2.add(start_date_label);

        //JComboBox
        //year
        String[] start_year_combobox = {"2019","2020","2021","2022","2023","2024","2025","2026"};
        n_start_one_combobox = new JComboBox (start_year_combobox);
        n_start_one_combobox.setBackground(Field_color);
        n_start_one_combobox.setBounds (260 , 275 , 90 , 30);
        panel2.add(n_start_one_combobox);

        //Month
        String[] start_month_combobox = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        n_start_two_combobox = new JComboBox (start_month_combobox);
        n_start_two_combobox.setBounds (345, 275, 120,30);
        panel2.add(n_start_two_combobox);

        //Day
        String[] start_day = {"1","2","3","4","5","6","7","8","9","10"};
        n_start_three_combobox = new JComboBox (start_day);
        n_start_three_combobox.setBounds (460, 275, 70, 30);
        panel2.add(n_start_three_combobox);

        //JLabel -->Completion Date
        complete_date_label = new JLabel ("Completion Date:");
        complete_date_label.setBounds (260 , 315 , 200 , 20);
        Font complete_label_Font = new Font ("SanSerif", Font.PLAIN,15);
        complete_date_label.setForeground(Register_Color);
        complete_date_label.setFont(complete_label_Font);
        panel2.add(complete_date_label);
        //JComboBox
        //year
        String[] complete_year_combobox = {"2019","2020","2021","2022","2023","2024","2025","2026"};
        n_complete_one_combobox = new JComboBox (complete_year_combobox);
        n_complete_one_combobox.setBounds (260 , 330 , 90 , 30);
        panel2.add (n_complete_one_combobox);

        //Month
        String[] complete_month_combobox = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        n_complete_two_combobox = new JComboBox (complete_month_combobox);
        n_complete_two_combobox.setBounds (345, 330 , 120 , 30 );
        panel2.add (n_complete_two_combobox);
        //Day
        String[] complete_day_combobox = {"1","2","3","4","5","6","7","8","9","10"};
        n_complete_three_combobox = new JComboBox (complete_day_combobox);
        n_complete_three_combobox.setBounds (460 , 330 ,70 , 30);
        panel2.add(n_complete_three_combobox);

        
        //JLabel -->Exam 
        exam_date_label = new JLabel ("Exam Date:");
        exam_date_label.setBounds (260 , 365 , 200 , 20);
        Font exam_label_Font = new Font ("SanSerif", Font.PLAIN,15);
        exam_date_label.setForeground(Register_Color);
        exam_date_label.setFont(exam_label_Font);
        panel2.add(exam_date_label);
        //JComboBox
        //year
        String[] exam_year_combobox = {"2019","2020","2021","2022","2023","2024","2025","2026"};
        n_exam_one_combobox = new JComboBox (exam_year_combobox);
        n_exam_one_combobox.setBounds (260 , 380 , 90 , 30);
        panel2.add (n_exam_one_combobox);

        //Month
        String[] exam_month_combobox = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        n_exam_two_combobox = new JComboBox (exam_month_combobox);
        n_exam_two_combobox.setBounds (345, 380 , 120 , 30 );
        panel2.add (n_exam_two_combobox);
        //Day
        String[] exam_day_combobox = {"1","2","3","4","5","6","7","8","9","10"};
        n_exam_three_combobox = new JComboBox (exam_day_combobox);
        n_exam_three_combobox.setBounds (460 , 380 ,70 , 30);
        panel2.add(n_exam_three_combobox);

        //JButton -->Display
        n_display_b = new JButton ("Display");
        n_display_b.setBounds (20,360,100,45);
        n_display_b.setForeground(Color.PINK);
        n_display_b.addActionListener(this);
        panel2.add(n_display_b);

        //JButton -->Clear 
        n_clear_b = new JButton ("Clear");
        n_clear_b.setBounds (120,360,100,45);
        n_clear_b.setForeground(Color.PINK);
        n_clear_b.addActionListener(this);
        panel2.add(n_clear_b);

        //JButton -->Register Course
        n_register_b = new JButton ("Register");
        n_register_b.setBounds (260 , 470 , 200 , 35);
        n_register_b.setForeground(Color.PINK);
        n_register_b.addActionListener(this);
        panel2.add(n_register_b);


        //JButton --Remove
        n_remove_b = new JButton("Remove");
        n_remove_b.setBounds(300,420,120,45);
        n_remove_b.setForeground (Color.PINK);
        n_remove_b.addActionListener(this);
        panel2.add(n_remove_b);

        frame2.add(panel2);
        frame2.setBounds (30 , 40 ,550 , 550);
        frame2.setResizable(false);
        frame2.setVisible(true);
    }
    //method for GUI of the main method
    public void GUI3()
    {
        frame = new JFrame ("Courses");
        panel = new JPanel();
        Color panel_color = new Color (221, 218, 240);
        panel.setBackground(panel_color);
        panel.setLayout(null);

        //JLabel -->Choice
        choose_label = new JLabel ("Which course would you like?");
        choose_label.setBounds (150,10,300,50);
        Font choose_label_Font = new Font ("Times New Roman", Font.PLAIN,20);
        choose_label.setFont(choose_label_Font);
        panel.add(choose_label);

        //JButton -->Academic Course 
        acedemic_b =new JButton ("Academic Course");
        acedemic_b.setBounds(20,60,250,45);
        acedemic_b.addActionListener(this);
        panel.add(acedemic_b);

        //JButton -->Non Academic Course
        n_academic_b = new JButton("Non-Academic Course");
        n_academic_b.setBounds(280,60,250,45);
        n_academic_b.addActionListener(this);
        panel.add(n_academic_b);

        frame.add(panel);
        frame.setBounds(300,300,550,200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    //main method
    public static void main (String[] args)
    {
        main.GUI3();
    }

    //Implementing the Action Performed;
    public void actionPerformed(ActionEvent e)
    {
        //to change the course form
        if(e.getSource() == change_b)
        {
            GUI2();
        }
        else if (e.getSource() == n_change_b)
        {
            GUI1();
        }

        //to choose either of a course
        if(e.getSource() == n_academic_b)
        {
            GUI2();
        }
        else if(e.getSource() == acedemic_b)
        {
            GUI1();
        } 

        //for add button in academic GUI
        if (e.getSource() == add_b)
        {

            Addacdemic_id= courseid_text_field.getText();

            Addacademic_name = course_name_text_field.getText();

            Addacademic_duration = duration_text_field.getText();

            AddAcademic_Level = level_text_field.getText();

            AddAcademic_Credit = credit_text_field.getText();

            //Calling the constructor of academic course class
            obj_Academic = new AcademicCourse(Addacdemic_id,Addacademic_name,a_duration,
                AddAcademic_Level,AddAcademic_Credit,a_assessments);

            // for(Course c : alist)
            // try
            // {a_duration = Integer.parseInt(Addacademic_duration);
            // a_assessments = Integer.parseInt(AddAcademic_Assessments);
            // }
            // catch(NumberFormatException e1)
            // {
            // JOptionPane.showMessageDialog(frame1, "Invailed number.In Check Duration and/oe In Number of Assessments");
            // break;
            // }

            //Comparing CourseID
            for(Course c:alist)
            {
                if(c.getCourseID().equals(courseid_text_field.getText()))
                {
                    JOptionPane.showMessageDialog(frame1, "The course is already added.");
                    return;
                }
            }
            //Adding to array list
            alist.add(obj_Academic);

            //checking empty fields
            for(Course c:alist)
            {
                if (courseid_text_field.getText().isEmpty() || course_name_text_field.getText().isEmpty() ||
                duration_text_field.getText().isEmpty() || level_text_field.getText().isEmpty() ||
                credit_text_field.getText().isEmpty() || assessments_text_field.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame,"Please check again.Empty field detected.");
                    break;
                }
                else
                {
                    //dialogue box
                    JOptionPane Dialog1 = new JOptionPane();
                    Dialog1.showMessageDialog(frame1,"The course is added.");
                    break;
                }
            }
        }
        //for register button in Academic GUI
        if(e.getSource() == register_b)
        {
            registerAcademic_id = courseid_two_text_field.getText();

            registerAcademic_Name = course_leader_text_field.getText();

            registerAcademic_Lecturer = lecturer_text_field.getText();
            //for starting date
            registerStart_Year = (start_one_combobox.getSelectedItem()).toString();
            registerStart_Month =(start_two_combobox.getSelectedItem()).toString();
            registerStart_Day = (start_three_combobox.getSelectedItem()).toString();

            Start_Date = registerStart_Year+registerStart_Month+registerComplete_Day;

            //for complete date
            registerComplete_Year = (complete_one_combobox.getSelectedItem()).toString();
            registerComplete_Month = (complete_two_combobox.getSelectedItem()).toString();
            registerComplete_Day =(complete_three_combobox.getSelectedItem()).toString();

            Completion_Date = registerComplete_Year + registerComplete_Month + registerComplete_Day;

            //for comparison of CourseId
            for(Course c : alist)
            {
                if (c.getCourseID().equals(registerAcademic_id))
                {
                    if(c instanceof AcademicCourse)
                    {
                        tt =(AcademicCourse)c;
                        if(tt.getIsRegistered() ==true)
                        {
                            JOptionPane.showMessageDialog(frame1,"The course  is already registered.");
                            break;
                        }
                        else if (tt.getIsRegistered() == false)
                        {
                            tt.register(registerAcademic_Name , registerAcademic_Lecturer,Start_Date,Completion_Date);
                            JOptionPane.showMessageDialog(frame1,"The course  is registered.");
                            break;
                        }
                    }
                }
                if(courseid_text_field.getText()!=(courseid_two_text_field.getText()))
                {
                    JOptionPane.showMessageDialog(frame1 , "The CourseId should be same for adding as well as registering the Course.");
                    break;
                }

                if(courseid_two_text_field.getText().isEmpty() || course_leader_text_field.getText().isEmpty() ||
                lecturer_text_field.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame,"Please check again.Empty field detected.");
                    break;
                }
            }
        }
        //Display button in Academic GUI
        if
        (e.getSource() == display_b)
        { for(Course c:alist)
            {
                if (c instanceof AcademicCourse ){
                    AcademicCourse AC = (AcademicCourse) c;
                    AC.display();}
            }
        }

        //for add button in non-academic GUI
        if(e.getSource() == n_add_b)
        {
            AddNonAcademic_id = n_courseid_text_field.getText();

            AddNonAcademic_name = n_course_name_text_field.getText();

            AddNonAcademic_duration = n_duration_text_field.getText();

            AddNonAcademic_Prerequisite = prerequisite_text_field.getText();

            //calling the constructor of non_academic course class
            obj_NonAcademic = new NonAcademicCourse(AddNonAcademic_id, AddNonAcademic_name,
                a_duration,AddNonAcademic_Prerequisite);

            //for validating the value of duration
            for(Course c :alist )
                try
                {
                    a_duration = Integer.parseInt(n_duration_text_field.getText());
                }
                catch(NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(frame2, "Invalid Number.\n Check Duration");
                    return;
                }
            //Comparing CourseId
            for (Course c:alist)
            {
                //if(c.CourseID().equals(n_courseid_text_field.getText()))
                {
                    JOptionPane.showMessageDialog(frame2, "This Course is already added.");
                    return;
                }
            }
            //Adding to array list
            alist.add(obj_NonAcademic);

            //checking empty fields
            for (Course c:alist)
            {
                if(n_courseid_text_field.getText().isEmpty() ||n_course_name_text_field.getText().isEmpty() ||
                n_duration_text_field.getText().isEmpty() || prerequisite_text_field.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame, "Please check again. Empty field detected.");
                    break;
                }
                else
                {
                    //dialoug box
                    JOptionPane dialog2 = new JOptionPane();
                    dialog2.showMessageDialog(frame2,"The Non-Academic course is added.");
                    return;
                }
            }
        }
        //Register Button in Non_Academic GUI
        if(e.getSource() == n_register_b)
        {
            AddNonAcademic_id = n_courseid_two_text_field.getText();

            AddNonAcademic_name = n_course_leader_text_field.getText();
            String InstructorName = n_lecturer_text_field.getText();

            //for starting date
            NonregisterStart_Year = (n_start_one_combobox.getSelectedItem()).toString();
            NonregisterStart_Month = (n_start_two_combobox.getSelectedItem()).toString();
            NonregisterStart_Day = (n_start_three_combobox.getSelectedItem()).toString();

            Start_Date =NonregisterStart_Year + NonregisterStart_Month + NonregisterComplete_Day;

            //for complete date
            NonregisterComplete_Year = (n_complete_one_combobox.getSelectedItem()).toString();
            NonregisterComplete_Month = (n_complete_two_combobox.getSelectedItem()).toString();
            NonregisterComplete_Day = (n_complete_three_combobox.getSelectedItem()).toString();

            Completion_Date = NonregisterComplete_Year + NonregisterComplete_Month +NonregisterComplete_Day;

            //for exam date
            NonregisterExam_Year = (n_exam_one_combobox.getSelectedItem()).toString();
            NonregisterExam_Month = (n_exam_two_combobox.getSelectedItem()).toString();
            NonregisterExam_Day = (n_exam_three_combobox.getSelectedItem()).toString();

            Exam_Date = NonregisterExam_Year +NonregisterExam_Month + NonregisterExam_Day;

            //for comparision of CourseId
            for(Course c:alist)
            {
                if (c.getCourseID().equals(AddNonAcademic_id))
                {
                    if(c instanceof NonAcademicCourse)
                    {
                        pp=(NonAcademicCourse)c;
                        if(pp.getIsRegisterd() == true)
                        {
                            JOptionPane.showMessageDialog(frame2, "The course is already registered.");
                            break;
                        }
                        else if(pp.getIsRegisterd() == false)
                        {
                            pp.register(AddNonAcademic_name , InstructorName,Start_Date,Completion_Date,Exam_Date);
                            JOptionPane.showMessageDialog(frame1,"The course  is registered.");
                            break;
                        }
                    }

                }
            }
        }
        //Display button in Non_Academic GUI

        if(e.getSource() ==n_display_b)
        { 

            for(Course a:alist)
            {
                if (a instanceof NonAcademicCourse ){
                    NonAcademicCourse AC = (NonAcademicCourse) a;
                    AC.display();
                }
            }
        }
            //Clear Button for academic field
            if(e.getSource() == clear_b)
            {
                courseid_text_field.setText(" ");
                courseid_two_text_field.setText(" ");
                course_leader_text_field.setText(" ");
                duration_text_field.setText(" ");
                credit_text_field.setText(" ");
                lecturer_text_field.setText(" ");
                assessments_text_field.setText(" ");
                level_text_field.setText(" ");
                course_name_text_field.setText(" ");
                return;
            }

            //clear button for Non_Academic Field 
            if(e.getSource() == n_clear_b)
            {
                n_courseid_text_field.setText(" ");
                n_courseid_two_text_field.setText(" ");
                prerequisite_text_field.setText(" ");
                n_course_name_text_field.setText(" ");
                n_course_leader_text_field.setText(" ");
                n_duration_text_field.setText(" ");
                n_lecturer_text_field.setText(" ");
                return;
            }
            //remove button for Non_Academic Field
            if(e.getSource() == n_remove_b)
            {
                for(Course b:alist)
                {
                    if (n_courseid_text_field.getText().equals(n_courseid_text_field.getText()) && b instanceof NonAcademicCourse)
                    {
                        NonAcademicCourse NaCourse =(NonAcademicCourse)  b;
                        NaCourse.remove();
                        JOptionPane.showMessageDialog(frame2, "The Course has been removed.");
                    }
                }
            }
        

        }
    }


 
    


