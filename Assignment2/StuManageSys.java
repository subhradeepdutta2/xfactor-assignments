import java.util.*;

class Student
{
    private String name, gender, address;
    private int age;

    
    Student() //constructor
    {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.address = "";
    }
    
    public void setName(String name) // setters
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    
    public String getName() // getters
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getAddress()
    {
        return address;
    }
}

class Department
{
    private String deptName, hodName;

    
    Department()// constructor
    {
        this.deptName = "";
        this.hodName = "";
    }

    public void setName(String deptName)// setters
    {
        this.deptName = deptName;
    }

    public void setHODName(String hodName)
    {
        this.hodName= hodName;
    }

    public String getName()// getters
    {
        return this.deptName;
    }

    public String getHODName()
    {
        return this.hodName;
    }
}
class StuManageSys{
    static void drawline(int n,int ch)
    {
        for(int i=0;i<n;i++)
            System.out.print("_");
        
        if(ch==1)
            System.out.println();
    }
    public static void main(String[] args){

        int choice, studAge;
        String flag = "Y";
        String studName, studGender, studAddr, deptName, deptHOD;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Department> departments = new ArrayList<Department>();

        System.out.println("Welcome to Student Management System "+"\n");

        while(flag.equalsIgnoreCase("Y"))
        {
            System.out.println("\n1. Add Student\n2. List Student\n3. Remove Student\n4. Add Department\n5. List Department\n6. Remove Department\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    Student ob = new Student();
                    System.out.print("\nEnter name: ");
                    ob.setName(sc.nextLine());
                    System.out.print("\nEnter age: ");
                    ob.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.print("\nEnter gender: ");
                    ob.setGender(sc.nextLine());
                    System.out.print("\nEnter address: ");
                    ob.setAddress(sc.nextLine());
                    students.add(ob);
                    
                    System.out.println("\nStudent added.");
                    drawline(100,1);
                    break;

                case 2:
                    System.out.println("Student Database: \n");

                    System.out.print("Name \t | \t Age \t | \t Gender \t | \t Address\n\n");

                    for(Student s : students)
                        System.out.print(s.getName() + "\t\t" + s.getAge() + "\t\t" +s.getGender() + "\t\t" +s.getAddress() + "\n\n");
                        drawline(100,1);
                    break;

                case 3:
                    System.out.print("\nEnter student name for deletion: ");
                    studName = sc.nextLine();
                    System.out.println();
                    boolean flag1 = false;

                    ArrayList<Student> temp = new ArrayList<Student>();

                    for(Student st : students){
                        if(st.getName().equalsIgnoreCase(studName)){
                            flag1 = true;
                            temp.add(st);
                        }
                    }

                    if(flag1)
                    {
                        students.removeAll(temp);
                        System.out.println("\nStudent record deleted successfully\n");
                    }
                    else{
                        System.out.println("\nStudent name does not exist"+"\n");
                    }
                    drawline(100,1);
                    break;

                case 4:
                    Department dept = new Department();
                    System.out.print("\nEnter name of department: ");
                    dept.setName(sc.nextLine());
                    System.out.println();
                    System.out.print("Enter name of HOD: ");
                    dept.setHODName(sc.nextLine());
                    departments.add(dept);
                    System.out.println("\nDepartment added\n");
                    drawline(100,1);
                    break;

                case 5:
                    System.out.println("\nList of Departments: \n");
                    System.out.println("Dept \t | \t HOD\n");

                    for(Department dt : departments)
                        System.out.print(dt.getName() + "\t\t" + dt.getHODName() + "\n\n");
                    
                    drawline(100,1);
                    break;

                
                case 6:
	                System.out.print("\nEnter the department name for deletion: ");
	                deptName = sc.nextLine();
	                System.out.println();
	                boolean dFlag = false;

	                ArrayList<Department> dtemp = new ArrayList<Department>();

	                for(Department dt : departments){
	                    if(dt.getName().equalsIgnoreCase(deptName)){
	                        dFlag = true;
	                        dtemp.add(dt);
	                    }
	                }

	                if(dFlag)
                    {
	                    departments.removeAll(dtemp);
	                    System.out.println("\nDepartment removed successfully"+"\n");
	                }
	                else
                    {
	                    System.out.println("Department name does not exist"+"\n");
	                }
	                break;

                default: 
                    System.out.println("Invalid Option :(\n");
            }
            System.out.print("Enter Y/N to continue/exit: ");
            flag = sc.nextLine();
        }
        System.out.println("Thank You for using Student Management System");
        sc.close();
    }
}