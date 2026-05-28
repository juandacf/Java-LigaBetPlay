package com.juan.ligaBetPlay.models;

import java.util.*;

public class Staff {
    private List<StaffMember> StaffMembers; 
    
    public Staff(){
        this.StaffMembers = new ArrayList<>();
    }

    public List<StaffMember> getAllStaffMembers(){
        return this.StaffMembers;
    }
}
