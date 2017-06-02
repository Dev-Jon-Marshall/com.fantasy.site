package com.fantasy.site.domain.DTO;

import com.fantasy.site.domain.ByeWeek;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/5/2017.
 */
public class ByeWeekListResponse
{

    //Individual List of Bye Weeks By-Week.
    @JsonProperty("Bye Week 4")
    private List<ByeWeek> byeWeek4List;

    @JsonProperty("Bye Week 5")
    private List<ByeWeek> byeWeek5List;

    @JsonProperty("Bye Week 6")
    private List<ByeWeek> byeWeek6List;

    @JsonProperty("Bye Week 7")
    private List<ByeWeek> byeWeek7List;

    @JsonProperty("Bye Week 8")
    private List<ByeWeek> byeWeek8List;

    @JsonProperty("Bye Week 9")
    private List<ByeWeek> byeWeek9List;

    @JsonProperty("Bye Week 10")
    private List<ByeWeek> byeWeek10List;

    @JsonProperty("Bye Week 11")
    private List<ByeWeek> byeWeek11List;

//    @JsonProperty("Bye Week 12")
//    private List<ByeWeek> byeWeek12List;

    @JsonProperty("Bye Week 13")
    private List<ByeWeek> byeWeek13List;

    //Master List of Bye Weeks
    private List<ByeWeek> byeWeekList; //, byeWeek5List, byeWeek6List, byeWeek7List, byeWeek8List, byeWeek9List, byeWeek10List, byeWeek11List, byeWeek13List);

    public ByeWeekListResponse()
    {
        // instantiate new arraylists
        byeWeekList = new ArrayList<>();
        byeWeek4List = new ArrayList<>();
        byeWeek5List = new ArrayList<>();
        byeWeek6List = new ArrayList<>();
        byeWeek7List = new ArrayList<>();
        byeWeek8List = new ArrayList<>();
        byeWeek9List = new ArrayList<>();
        byeWeek10List = new ArrayList<>();
        byeWeek11List = new ArrayList<>();
//        byeWeek12List = new ArrayList<>();
        byeWeek13List = new ArrayList<>();
    }

    public void mergeLists()
    {
        byeWeekList.addAll(byeWeek4List);
        byeWeekList.addAll(byeWeek5List);
        byeWeekList.addAll(byeWeek6List);
        byeWeekList.addAll(byeWeek7List);
        byeWeekList.addAll(byeWeek8List);
        byeWeekList.addAll(byeWeek9List);
        byeWeekList.addAll(byeWeek10List);
        byeWeekList.addAll(byeWeek11List);
//        byeWeekList.addAll(byeWeek12List);
        byeWeekList.addAll(byeWeek13List);

    }

    public List<ByeWeek> getByeWeek4List()
    {
        return byeWeek4List;
    }

    public void setByeWeek4List(List<ByeWeek> byeWeek4List)
    {
        this.byeWeek4List = byeWeek4List;
    }

    public List<ByeWeek> getByeWeek5List()
    {
        return byeWeek5List;
    }

    public void setByeWeek5List(List<ByeWeek> byeWeek5List)
    {
        this.byeWeek5List = byeWeek5List;
    }

    public List<ByeWeek> getByeWeek6List()
    {
        return byeWeek6List;
    }

    public void setByeWeek6List(List<ByeWeek> byeWeek6List)
    {
        this.byeWeek6List = byeWeek6List;
    }

    public List<ByeWeek> getByeWeek7List()
    {
        return byeWeek7List;
    }

    public void setByeWeek7List(List<ByeWeek> byeWeek7List)
    {
        this.byeWeek7List = byeWeek7List;
    }

    public List<ByeWeek> getByeWeek8List()
    {
        return byeWeek8List;
    }

    public void setByeWeek8List(List<ByeWeek> byeWeek8List)
    {
        this.byeWeek8List = byeWeek8List;
    }

    public List<ByeWeek> getByeWeek9List()
    {
        return byeWeek9List;
    }

    public void setByeWeek9List(List<ByeWeek> byeWeek9List)
    {
        this.byeWeek9List = byeWeek9List;
    }

    public List<ByeWeek> getByeWeek10List()
    {
        return byeWeek10List;
    }

    public void setByeWeek10List(List<ByeWeek> byeWeek10List)
    {
        this.byeWeek10List = byeWeek10List;
    }

    public List<ByeWeek> getByeWeek11List()
    {
        return byeWeek11List;
    }

    public void setByeWeek11List(List<ByeWeek> byeWeek11List)
    {
        this.byeWeek11List = byeWeek11List;
    }

//    public List<ByeWeek> getByeWeek12List()
//    {
//        return byeWeek12List;
//    }

//    public void setByeWeek12List(List<ByeWeek> byeWeek12List)
//    {
//        this.byeWeek12List = byeWeek12List;
//    }

    public List<ByeWeek> getByeWeek13List()
    {
        return byeWeek13List;
    }

    public void setByeWeek13List(List<ByeWeek> byeWeek13List)
    {
        this.byeWeek13List = byeWeek13List;
    }

    public List<ByeWeek> getByeWeekList()
    {
        return byeWeekList;
    }

    public void setByeWeekList(List<ByeWeek> byeWeekList)
    {
        this.byeWeekList = byeWeekList;
    }
}
