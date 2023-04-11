package companylogic;

public class Employee
{
    private String name = "";
    private int age = 18;

    private Post post = new Post();

    private float salary = 100000.0f;

    private int ID = 0;

    public Employee() { }

    public Employee(String name, int age, Post post, float salary)
    {
        setName(name);
        setAge(age);
        setPost(post);
        setSalary(salary);
    }

    public Employee(Employee employee)
    {
        this(employee.name, employee.age, employee.post, employee.salary);
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", age: " + age + ", post: " + post.toString() + ", salary: " + salary + ", ID: " + ID + "\n\t" + post.toString();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age)
    {
        this.age = age;
    }

    public Post getPost() { return post; }
    public void setPost(Post post) { this.post.set(post); }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    public int getID() { return ID; }
    public void createUniqueID(Company company)
    {
        if(company.getEmployeesNum() > 0) {
            ID = company.getEmployee(company.getEmployeesNum() - 1).ID + 1;
        }
    }
}
