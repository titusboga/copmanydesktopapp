package com.company.company;

public class MainService {
    public String getButtonText(boolean status)
    {
        if(status)
            return "Stop";
        return "Start";
    }

}
