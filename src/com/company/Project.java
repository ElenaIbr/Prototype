package com.company;

public class Project implements Copyable {
    private int id;
    private String ProjectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        ProjectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, ProjectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", ProjectName='" + ProjectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
