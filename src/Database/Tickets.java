/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author boxro
 */
public class Tickets {
    private String id;
    private int revcount;
    private String title;
    private String desc;
    private String type;
    private String priority;
    private String department;
    private String personnel;
    private String dateCreated;
    private String dateUpdated;
    private String status;
    private String creator;
    private String notes;
    private int followup;

    public Tickets(String id, int revcount, String title, String desc, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes, int followup) {
        this.id = id;
        this.revcount = revcount;
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.priority = priority;
        this.department = department;
        this.personnel = personnel;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
        this.creator = creator;
        this.notes = notes;
        this.followup = followup;
    }    
    
    public Tickets(String id, String title, String desc, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.priority = priority;
        this.department = department;
        this.personnel = personnel;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
        this.creator = creator;
        this.notes = notes;
    }

    public Tickets(String title, String desc, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes) {
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.priority = priority;
        this.department = department;
        this.personnel = personnel;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
        this.creator = creator;
        this.notes = notes;
    }

    public Tickets(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getPriority() {
        return priority;
    }

    public String getDepartment() {
        return department;
    }

    public String getPersonnel() {
        return personnel;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public String getStatus() {
        return status;
    }

    public int getRevcount() {
        return revcount;
    }

    public String getCreator() {
        return creator;
    }

    public String getNotes(){
        return notes;
    }

    public int getFollowup() {
        return followup;
    }

}






