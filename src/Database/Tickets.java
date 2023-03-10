package Database;

public class Tickets {

    private String _id;             // unique ID of the ticket
    private int _revcount;          // revision count of the ticket
    private String _title;          // title of the ticket
    private String _desc;           // description of the ticket
    private String _type;           // type of the ticket
    private String _priority;       // priority of the ticket
    private String _department;     // department associated with the ticket
    private String _personnel;      // personnel assigned to handle the ticket
    private String _dateCreated;    // date when the ticket was created
    private String _dateUpdated;    // date when the ticket was last updated
    private String _status;         // current status of the ticket
    private String _creator;        // creator of the ticket
    private String _notes;          // notes associated with the ticket
    private int _followup;          // follow-up count of the ticket

    // Constructor for creating a ticket with all attributes
    public Tickets(String id, int revCount, String title, String description, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes, int followup) {
        _id = id;
        _revcount = revCount;
        _title = title;
        _desc = description;
        _type = type;
        _priority = priority;
        _department = department;
        _personnel = personnel;
        _dateCreated = dateCreated;
        _dateUpdated = dateUpdated;
        _status = status;
        _creator = creator;
        _notes = notes;
        _followup = followup;
    }
    
    // Constructor for creating a ticket with all attributes except revision count and follow-up status
    public Tickets(String id, String title, String description, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes) {
        _id = id;
        _title = title;
        _desc = description;
        _type = type;
        _priority = priority;
        _department = department;
        _personnel = personnel;
        _dateCreated = dateCreated;
        _dateUpdated = dateUpdated;
        _status = status;
        _creator = creator;
        _notes = notes;
    }

    // Constructor for creating a ticket with all attributes except ID, revision count and follow-up status
    public Tickets(String title, String description, String type, String priority, String department, String personnel, String dateCreated, String dateUpdated, String status, String creator, String notes) {
        _title = title;
        _desc = description;
        _type = type;
        _priority = priority;
        _department = department;
        _personnel = personnel;
        _dateCreated = dateCreated;
        _dateUpdated = dateUpdated;
        _status = status;
        _creator = creator;
        _notes = notes;
    }

    public Tickets(String id) {
        _id = id;
    }

    // Getter methods for all variables
    public String getId() {
        return _id;
    }

    public String getTitle() {
        return _title;
    }

    public String getDescription() {
        return _desc;
    }

    public String getType() {
        return _type;
    }

    public String getPriority() {
        return _priority;
    }

    public String getDepartment() {
        return _department;
    }

    public String getPersonnel() {
        return _personnel;
    }

    public String getDateCreated() {
        return _dateCreated;
    }

    public String getDateUpdated() {
        return _dateUpdated;
    }

    public String getStatus() {
        return _status;
    }

    public int getRevCount() {
        return _revcount;
    }

    public String getCreator() {
        return _creator;
    }

    public String getNotes() {
        return _notes;
    }

    public int getFollowup() {
        return _followup;
    }
}
