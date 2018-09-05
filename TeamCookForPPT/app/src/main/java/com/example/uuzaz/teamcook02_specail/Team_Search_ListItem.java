package com.example.uuzaz.teamcook02_specail;


public class Team_Search_ListItem {
    private String summit_counterStr;
    private String team_number_fullStr;
    private String team_search_nameStr;
    private String d_day_team_searchStr;
    private String team_leader_nameStr;



    public void setSummit_counter(String summit_counter) {
        summit_counterStr = summit_counter;
    }

    public void setTeam_number_full(String team_number_full) {
        team_number_fullStr = team_number_full;
    }

    public void setTeam_search_name(String team_search_name) {
        team_search_nameStr = team_search_name;
    }

    public void setD_day_team_search(String d_day_team_search) {
        d_day_team_searchStr = d_day_team_search;
    }

    public void setTeam_leader_name(String team_leader_name) {
        team_leader_nameStr = team_leader_name;
    }


    public String getSummit_counter() {
        return this.summit_counterStr;
    }

    public String getTeam_number_full() {
        return this.team_number_fullStr;
    }

    public String getTeam_search_name() {
        return this.team_search_nameStr;
    }

    public String getD_day_team_search() {
        return this.d_day_team_searchStr;
    }

    public String getTeam_leader_name() {
        return this.team_leader_nameStr;
    }
}
