package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class Stats
{
    @Id
    @Column(name="statsId")
    private Integer statsId;

    @Version
    private Integer version;

    @Column(name="weekNum")
    private Integer weekNum;

    @Column(name="passingComp")
    private Integer passingComp;

    @Column(name="passingAtt")
    private Integer passingAtt;

    @Column(name="passingYards")
    private Integer passingYards;

    @Column(name="passingTD")
    private Integer passingTD;

    @Column(name="passingINT")
    private Integer passingINT;

    @Column(name="rushingAtt")
    private Integer rushingAtt;

    @Column(name="rushingYards")
    private Integer rushingYards;

    @Column(name="rushingTD")
    private Integer rushingTD;

    @Column(name="rushingFum")
    private Integer rushingFum;

    @Column(name="receivingTarget")
    private Integer receivingTarget;

    @Column(name="receivingRec")
    private Integer receivingRec;

    @Column(name="receivingYards")
    private Integer receivingYards;

    @Column(name="receivingTD")
    private Integer receivingTD;

    @Column(name="kickFGM")
    private Integer kickFGM;

    @Column(name="kickFGA")
    private Integer kickFGA;

    @Column(name="kickFGperc")
    private double kickFGperc;

    @Column(name="kickEPM")
    private Integer kickEPM;

    @Column(name="kickEPA")
    private Integer kickEPA;

    @Column(name="defSack")
    private Integer defSack;

    @Column(name="defFumRec")
    private Integer defFumRec;

    @Column(name="defINT")
    private Integer defINT;

    @Column(name="defTD")
    private Integer defTD;

    @Column(name="defPointsAllowed")
    private Integer defPointsAllowed;

    @Column(name="defPaYd_G")
    private Integer defPaYd_G;

    @Column(name="defRuYd_G")
    private Integer defRuYd_G;

    @Column(name="defSafety")
    private Integer defSafety;

    @Column(name="defKickTD")
    private Integer defKickTd;



    public Stats() {}


    public Integer getPlayerId()
    {
        return statsId;
    }

    public void setPlayerId(Integer playerId)
    {
        this.statsId = playerId;
    }


    public Integer getPassingComp()
    {
        return passingComp;
    }

    public void setPassingComp(Integer passingComp)
    {
        this.passingComp = passingComp;
    }

    public Integer getPassingAtt()
    {
        return passingAtt;
    }

    public void setPassingAtt(Integer passingAtt)
    {
        this.passingAtt = passingAtt;
    }

    public Integer getPassingYards()
    {
        return passingYards;
    }

    public void setPassingYards(Integer passingYards)
    {
        this.passingYards = passingYards;
    }

    public Integer getPassingTD()
    {
        return passingTD;
    }

    public void setPassingTD(Integer passingTD)
    {
        this.passingTD = passingTD;
    }

    public Integer getPassingINT()
    {
        return passingINT;
    }

    public void setPassingINT(Integer passingINT)
    {
        this.passingINT = passingINT;
    }

    public Integer getRushingAtt()
    {
        return rushingAtt;
    }

    public void setRushingAtt(Integer rushingAtt)
    {
        this.rushingAtt = rushingAtt;
    }

    public Integer getRushingYards()
    {
        return rushingYards;
    }

    public void setRushingYards(Integer rushingYards)
    {
        this.rushingYards = rushingYards;
    }

    public Integer getRushingTD()
    {
        return rushingTD;
    }

    public void setRushingTD(Integer rushingTD)
    {
        this.rushingTD = rushingTD;
    }

    public Integer getRushingFum()
    {
        return rushingFum;
    }

    public void setRushingFum(Integer rushingFum)
    {
        this.rushingFum = rushingFum;
    }

    public Integer getReceivingTarget()
    {
        return receivingTarget;
    }

    public void setReceivingTarget(Integer receivingTarget)
    {
        this.receivingTarget = receivingTarget;
    }

    public Integer getReceivingRec()
    {
        return receivingRec;
    }

    public void setReceivingRec(Integer receivingRec)
    {
        this.receivingRec = receivingRec;
    }

    public Integer getReceivingYards()
    {
        return receivingYards;
    }

    public void setReceivingYards(Integer receivingYards)
    {
        this.receivingYards = receivingYards;
    }

    public Integer getReceivingTD()
    {
        return receivingTD;
    }

    public void setReceivingTD(Integer receivingTD)
    {
        this.receivingTD = receivingTD;
    }

    public Integer getKickFGM()
    {
        return kickFGM;
    }

    public void setKickFGM(Integer kickFGM)
    {
        this.kickFGM = kickFGM;
    }

    public Integer getKickFGA()
    {
        return kickFGA;
    }

    public void setKickFGA(Integer kickFGA)
    {
        this.kickFGA = kickFGA;
    }

    public double getKickFGperc()
    {
        return kickFGperc;
    }

    public void setKickFGperc(double kickFGperc)
    {
        this.kickFGperc = kickFGperc;
    }

    public Integer getKickEPM()
    {
        return kickEPM;
    }

    public void setKickEPM(Integer kickEPM)
    {
        this.kickEPM = kickEPM;
    }

    public Integer getKickEPA()
    {
        return kickEPA;
    }

    public void setKickEPA(Integer kickEPA)
    {
        this.kickEPA = kickEPA;
    }

    public Integer getDefSack()
    {
        return defSack;
    }

    public void setDefSack(Integer defSack)
    {
        this.defSack = defSack;
    }

    public Integer getDefFumRec()
    {
        return defFumRec;
    }

    public void setDefFumRec(Integer defFumRec)
    {
        this.defFumRec = defFumRec;
    }

    public Integer getDefINT()
    {
        return defINT;
    }

    public void setDefINT(Integer defINT)
    {
        this.defINT = defINT;
    }

    public Integer getDefTD()
    {
        return defTD;
    }

    public void setDefTD(Integer defTD)
    {
        this.defTD = defTD;
    }

    public Integer getDefPointsAllowed()
    {
        return defPointsAllowed;
    }

    public void setDefPointsAllowed(Integer defPointsAllowed)
    {
        this.defPointsAllowed = defPointsAllowed;
    }

    public Integer getDefPaYd_G()
    {
        return defPaYd_G;
    }

    public void setDefPaYd_G(Integer defPaYd_G)
    {
        this.defPaYd_G = defPaYd_G;
    }

    public Integer getDefRuYd_G()
    {
        return defRuYd_G;
    }

    public void setDefRuYd_G(Integer defRuYd_G)
    {
        this.defRuYd_G = defRuYd_G;
    }

    public Integer getDefSafety()
    {
        return defSafety;
    }

    public void setDefSafety(Integer defSafety)
    {
        this.defSafety = defSafety;
    }

    public Integer getDefKickTd()
    {
        return defKickTd;
    }

    public void setDefKickTd(Integer defKickTd)
    {
        this.defKickTd = defKickTd;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Integer getWeekNum()
    {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum)
    {
        this.weekNum = weekNum;
    }
}
