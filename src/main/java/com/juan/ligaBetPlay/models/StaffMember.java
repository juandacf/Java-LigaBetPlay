package com.juan.ligaBetPlay.models;

public class StaffMember {
    private int Id;
    private String FullName;
    private Role StaffRole;

    public StaffMember(int id, String fullName, Role staffRole){
        this.Id = id;
        this.FullName = fullName;
        this.StaffRole = staffRole;
    }
}
