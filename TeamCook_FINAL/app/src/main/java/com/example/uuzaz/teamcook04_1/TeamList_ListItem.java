package com.example.uuzaz.teamcook04_1;

public class TeamList_ListItem {
    private String contest_dayStr;
    private String team_list_nameStr;
    private String d_day_team_listStr;
    private String team_memberStr;


    public void setContest_day(String contest_day) {
        contest_dayStr = contest_day;
    }

    public void setTeam_list_name(String team_list_name) {
        team_list_nameStr = team_list_name;
    }

    public void setD_day_team_list(String d_day_team_list) {
        d_day_team_listStr = d_day_team_list;
    }

    public void setTeam_member(String team_member) {
        team_memberStr = team_member;
    }


    public String getContest_day() {
        return this.contest_dayStr;
    }

    public String getTeam_list_name() {
        return this.team_list_nameStr;
    }

    public String getD_day_team_list() {
        return this.d_day_team_listStr;
    }

    public String getTeam_member() {
        return this.team_memberStr;
    }

}
