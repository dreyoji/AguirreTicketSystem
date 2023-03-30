/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author boxro
 */
public class Credentials {
    private int num;
    private String empnum;    
    private String u_name;
    private String pass;    
    private String email;       
    private String f_name;
    private String m_name;
    private String l_name;
    private int age;
    private String bday;
    private String phonenum;
    private String gender;
    private String residence;
    private String actType;
    private String startdate;
    private String department;
    private String position;

    public Credentials(String empnum, String u_name, String pass, String email, String f_name, String m_name, String l_name, int age, String bday, String phonenum, String gender, String residence, String actType, String startdate, String department, String position) {
        this.empnum = empnum;
        this.u_name = u_name;
        this.pass = pass;
        this.email = email;
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
        this.age = age;
        this.bday = bday;
        this.phonenum = phonenum;
        this.gender = gender;
        this.residence = residence;
        this.actType = actType;
        this.startdate = startdate;
        this.department = department;
        this.position = position;
    }

    public Credentials(int num, String empnum, String u_name, String pass, String email, String f_name, String m_name, String l_name, int age, String bday, String phonenum, String gender, String residence, String actType, String startdate, String department, String position) {
        this.num = num;
        this.empnum = empnum;
        this.u_name = u_name;
        this.pass = pass;
        this.email = email;
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
        this.age = age;
        this.bday = bday;
        this.phonenum = phonenum;
        this.gender = gender;
        this.residence = residence;
        this.actType = actType;
        this.startdate = startdate;
        this.department = department;
        this.position = position;
    }


    public int getNum() {
        return num;
    }

    public String getEmpnum() {
        return empnum;
    }

    public String getU_name() {
        return u_name;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return f_name;
    }

    public String getM_name() {
        return m_name;
    }

    public String getL_name() {
        return l_name;
    }

    public int getAge() {
        return age;
    }

    public String getBday() {
        return bday;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getGender() {
        return gender;
    }

    public String getResidence() {
        return residence;
    }

    public String getActType() {
        return actType;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }


    
}

