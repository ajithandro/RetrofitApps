
package com.abhiandroid.retrofitexample;

import java.util.HashMap;
import java.util.Map;

public class UserListResponse {

    // POJO class to get the data from web api
    private String company_name;

    private String order_date;

    private String delivery_date;


    public void setCompany_name(String company_name){
        this.company_name = company_name;
    }
    public String getCompany_name(){
        return this.company_name;
    }

    public void setOrder_date(String order_date){
        this.order_date = order_date;
    }
    public String getOrder_date(){
        return this.order_date;
    }
    public void setDelivery_date(String delivery_date){
        this.delivery_date = delivery_date;
    }
    public String getDelivery_date(){
        return this.delivery_date;
    }

}