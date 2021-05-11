@Entity

public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ElementCollection(targetClass = EmployeeSkill.class)
    private Set<EmployeeSkill> skills = new  HashSet<>();

    @ElementCollection(targetClass = DaysOfWeek.class)
    private Set<DaysOfWeek> daysAvailable = new HashSet<>();

    public Employee() {}

    public Employee(long id, String name, Set<EmployeeSkill> skills, Set<DayOfWeek> daysAvailable) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.daysAvailable = daysAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}