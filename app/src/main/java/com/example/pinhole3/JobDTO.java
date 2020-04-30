package com.example.pinhole3;

public class JobDTO {
    String ANNUAL_SALARY;
    String HOURLY_RATE;
    String JOB_TITLE;
    String MAJOR;

    public JobDTO() {
    }

    public JobDTO(String ANNUAL_SALARY, String HOURLY_RATE, String JOB_TITLE, String MAJOR) {
        this.ANNUAL_SALARY = ANNUAL_SALARY;
        this.HOURLY_RATE = HOURLY_RATE;
        this.JOB_TITLE = JOB_TITLE;
        this.MAJOR = MAJOR;
    }

    public String getANNUAL_SALARY() {
        return ANNUAL_SALARY;
    }

    public void setANNUAL_SALARY(String ANNUAL_SALARY) {
        this.ANNUAL_SALARY = ANNUAL_SALARY;
    }

    public String getHOURLY_RATE() {
        return HOURLY_RATE;
    }

    public void setHOURLY_RATE(String HOURLY_RATE) {
        this.HOURLY_RATE = HOURLY_RATE;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public void setJOB_TITLE(String JOB_TITLE) {
        this.JOB_TITLE = JOB_TITLE;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public void setMAJOR(String MAJOR) {
        this.MAJOR = MAJOR;
    }
}
