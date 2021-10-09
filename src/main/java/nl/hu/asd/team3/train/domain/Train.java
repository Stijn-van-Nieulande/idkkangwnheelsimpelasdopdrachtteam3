package nl.hu.asd.team3.train.domain;

import net.minidev.json.annotate.JsonIgnore;
import nl.hu.asd.team3.company.domain.Company;
import nl.hu.asd.team3.company.domain.Location;

import javax.persistence.*;
import java.util.Date;

public class Train {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private int trainType;
    private String operationalTrainNumber;
    private Date scheduledTimeAtHandover;
    private Date scheduledDateTimeAtTransfer;

    private Long customerId;
    private Object transferPoint;
    private Object transfereeIM;


    public Train(int trainType, String operationalTrainNumber, Date scheduledTimeAtHandover, Date scheduledDateTimeAtTransfer) {
        this.trainType = trainType;
        this.operationalTrainNumber = operationalTrainNumber;
        this.scheduledTimeAtHandover = scheduledTimeAtHandover;
        this.scheduledDateTimeAtTransfer = scheduledDateTimeAtTransfer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTrainType() {
        return trainType;
    }

    public void setTrainType(int trainType) {
        this.trainType = trainType;
    }

    public String getOperationalTrainNumber() {
        return operationalTrainNumber;
    }

    public void setOperationalTrainNumber(String operationalTrainNumber) {
        this.operationalTrainNumber = operationalTrainNumber;
    }

    public Date getScheduledTimeAtHandover() {
        return scheduledTimeAtHandover;
    }

    public void setScheduledTimeAtHandover(Date scheduledTimeAtHandover) {
        this.scheduledTimeAtHandover = scheduledTimeAtHandover;
    }

    public Date getScheduledDateTimeAtTransfer() {
        return scheduledDateTimeAtTransfer;
    }

    public void setScheduledDateTimeAtTransfer(Date scheduledDateTimeAtTransfer) {
        this.scheduledDateTimeAtTransfer = scheduledDateTimeAtTransfer;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Object getTransferPoint() {
        return transferPoint;
    }

    public void setTransferPoint(Object transferPoint) {
        this.transferPoint = transferPoint;
    }

    public Object getTransfereeIM() {
        return transfereeIM;
    }

    public void setTransfereeIM(Object transfereeIM) {
        this.transfereeIM = transfereeIM;
    }
}
