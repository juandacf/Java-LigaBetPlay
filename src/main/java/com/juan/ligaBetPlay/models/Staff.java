package com.juan.ligaBetPlay.models;

import java.util.*;

public class Staff {
    private List<StaffMember> StaffMembers; 
    
    public Staff(){

    }

    public List<StaffMember> getAllStaffMembers(){
        return this.StaffMembers;
    }
}
