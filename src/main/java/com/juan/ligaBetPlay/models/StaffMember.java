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

    public int GetId() {
        return this.Id;
    }

    public String GetFullName() {
        return this.FullName;
    }

    public Role GetRole() {
        return this.StaffRole;
    }
}
