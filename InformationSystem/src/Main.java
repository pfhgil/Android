import companylogic.Employee;
import companylogic.Company;
import companylogic.Post;

public class Main
{
    private static Company company = new Company();

    public static void main(String[] args)
    {
        company.setName("Фаргус");

        Employee romanEmployee = new Employee("Роман", 17, new Post(Post.PostType.Junior, "балбесик ну вообще тупенький"), 1000);

        Employee vladEmployee = new Employee("Влад", 21, new Post(Post.PostType.Middle, "балбесик поумнее"), 200000);
        Employee ivanEmployee = new Employee("Иван", 20, new Post(Post.PostType.Middle, "балбесик поумнее"), 200000);
        Employee ilyaEmployee = new Employee("Илья", 20, new Post(Post.PostType.Senior, "самый умный балбесик"), 300000);

        // добавление сотрудников
        company.addEmployee(romanEmployee);
        company.addEmployee(vladEmployee);
        company.addEmployee(ivanEmployee);
        company.addEmployee(ilyaEmployee);

        System.out.println(company);

        System.out.println("\n---------------------------------\n");

        // удаление сотрудника по инстансу
        company.removeEmployee(vladEmployee);
        // уадление сотрудника по ID
        company.removeEmployee(ivanEmployee.getID());

        System.out.println(company);

        System.out.println("\n---------------------------------\n");

        // поиск сотрудника
        Employee foundIlyaEmployee = company.findEmployee(2);

        System.out.println(foundIlyaEmployee);
    }
}