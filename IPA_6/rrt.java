package IPA_6;

public class rrt {
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    rrt(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public int getTicketNo() {
        return this.ticketNo;
    }

    public String getRaisedBy() {
        return this.raisedBy;
    }

    public String getAssignedTo() {
        return this.assignedTo;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getProject() {
        return this.project;
    }
}
