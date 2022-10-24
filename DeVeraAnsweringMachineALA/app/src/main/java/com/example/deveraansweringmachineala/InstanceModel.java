package com.example.deveraansweringmachineala;

import androidx.recyclerview.widget.RecyclerView;

class InstanceModel{
    String instanceTitle;
    String instanceTime;
    String instanceDesc;

    public String getInstanceTitle(){return instanceTitle;}
    public String getInstanceTime() {return instanceTime;}
    public String getInstanceDesc() {return instanceDesc;}




    public InstanceModel(String instanceTitle, String instanceTime, String instanceDesc) {
    this.instanceTime = instanceTime;
    this.instanceTitle = instanceTitle;
    this.instanceDesc = instanceDesc;
    }
}