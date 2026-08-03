package com.medhat.example;

public class AuthRequest {

    private Long id;
    private String employeeName;
    private String requestDetails;
    private RequestStatus status;

    public AuthRequest() {
    }

    public AuthRequest(Long id, String employeeName, String requestDetails, RequestStatus status) {
        this.id = id;
        this.employeeName = employeeName;
        this.requestDetails = requestDetails;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }
}