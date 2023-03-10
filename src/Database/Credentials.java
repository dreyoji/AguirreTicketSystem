package Database;

/**
 * Credentials class contains the user credentials and personal information for
 * the employee.
 */
public class Credentials {

    // instance variables
    private int _num;               // unique identification number
    private String _empNum;         // employee number
    private String _username;       // username
    private String _password;       // password
    private String _email;          // email address
    private String _firstName;      // first name
    private String _middleName;     // middle name
    private String _lastName;       // last name
    private int _age;               // age
    private String _birthday;       // date of birth
    private String _phoneNumber;    // phone number
    private String _gender;         // gender
    private String _residence;      // residence address
    private String _activityType;   // activity type
    private String _startDate;      // start date
    private String _department;     // department
    private String _position;       // position

    public Credentials(String empNum, String username, String password, String email, String firstName, String middleName, String lastName, int age, String birthday, String phoneNumber, String gender, String residence, String activityType, String startDate, String department, String position) {
        _empNum = empNum;
        _username = username;
        _password = password;
        _email = email;
        _firstName = firstName;
        _middleName = middleName;
        _lastName = lastName;
        _age = age;
        _birthday = birthday;
        _phoneNumber = phoneNumber;
        _gender = gender;
        _residence = residence;
        _activityType = activityType;
        _startDate = startDate;
        _department = department;
        _position = position;
    }

    public Credentials(int num, String empNum, String username, String password, String email, String firstName, String middleName, String lastName, int age, String birthday, String phoneNumber, String gender, String residence, String activityType, String startDate, String department, String position) {
        _num = num;
        _empNum = empNum;
        _username = username;
        _password = password;
        _email = email;
        _firstName = firstName;
        _middleName = middleName;
        _lastName = lastName;
        _age = age;
        _birthday = birthday;
        _phoneNumber = phoneNumber;
        _gender = gender;
        _residence = residence;
        _activityType = activityType;
        _startDate = startDate;
        _department = department;
        _position = position;
    }

    // Getter methods for all variables
    public int getNum() {
        return _num;
    }

    public String getEmpNum() {
        return _empNum;
    }

    public String getUsername() {
        return _username;
    }

    public String getPassword() {
        return _password;
    }

    public String getEmail() {
        return _email;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getMiddleName() {
        return _middleName;
    }

    public String getLastName() {
        return _lastName;
    }

    public int getAge() {
        return _age;
    }

    public String getBirthday() {
        return _birthday;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public String getGender() {
        return _gender;
    }

    public String getResidence() {
        return _residence;
    }

    public String getActType() {
        return _activityType;
    }

    public String getStartdate() {
        return _startDate;
    }

    public String getDepartment() {
        return _department;
    }

    public String getPosition() {
        return _position;
    }
}
