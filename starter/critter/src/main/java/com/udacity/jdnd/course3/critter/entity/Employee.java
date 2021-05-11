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



}