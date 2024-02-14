package com.example.demo240214;

public class Task {
    private String name;
    private String stratDate;
    private String dueDate;
    private String groupName;
    private boolean partClass;

    public Task(String name, String stratDate, String dueDate, String groupName, boolean partClass) {
        this.name = name;
        this.stratDate = stratDate;
        this.dueDate = dueDate;
        this.groupName = groupName;
        this.partClass = partClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStratDate() {
        return stratDate;
    }

    public void setStratDate(String stratDate) {
        this.stratDate = stratDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean isPartClass() {
        return partClass;
    }

    public void setPartClass(boolean partClass) {
        this.partClass = partClass;
    }
}
