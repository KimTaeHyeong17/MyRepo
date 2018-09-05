package com.example.uuzaz.teamcook02_specail;

import android.graphics.drawable.Drawable;

public class TalkList_ListItem {
    private Drawable talklist_profile_iconDrawable;
    private String talklist_nameStr;
    private String team_leader_talklistStr;
    private String team_leader_name_talklistStr;
    private String team_member_talklistStr;


    public void setTalklist_profile_icon(Drawable talklist_profile_icon) {
        talklist_profile_iconDrawable = talklist_profile_icon;
    }

    public void setTalklist_name(String talklist_name) {
        talklist_nameStr = talklist_name;
    }

    public void setTeam_leader_talklist(String team_leader_talklist) {
        team_leader_talklistStr = team_leader_talklist;
    }

    public void setTeam_leader_name_talklist(String team_leader_name_talklist) {
        team_leader_name_talklistStr = team_leader_name_talklist;
    }

    public void setTeam_member_talklist(String team_member_talklist) {
        team_member_talklistStr = team_member_talklist;
    }


    public Drawable getTalklist_profile_icon() {
        return this.talklist_profile_iconDrawable;
    }

    public String getTalklist_name() {
        return this.talklist_nameStr;
    }

    public String getTeam_leader_talklist() {
        return this.team_leader_talklistStr;
    }

    public String getTeam_leader_name_talklist() {
        return this.team_leader_name_talklistStr;
    }

    public String getTeam_member_talklist() {
        return this.team_member_talklistStr;
    }
}
