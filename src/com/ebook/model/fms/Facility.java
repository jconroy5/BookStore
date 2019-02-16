package com.ebook.model.fms;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    private String facilityName;
    private String facilityLocation;
    private String facilityDetail = "";
    private boolean facilityIsAvailable;
    private List<Facility> facilityList = new ArrayList<Facility>();

   public String getfacilityName(){
       return facilityName;
   }

   public void setfacilityName(String facilityName){
       this.facilityName = facilityName;
   }

   public String getfacilityLocation(){
       return facilityLocation;
   }

   public void setfacilityLocation(String facilityLocation){
       this.facilityLocation = facilityLocation;
   }

   public String getFacilityDetail(){
       return facilityDetail;
   }

   public void setFacilityDetail(String facilityDetail){
       this.facilityDetail = facilityDetail;
   }

   public boolean getfacilityIsAvailable(){
       return facilityIsAvailable;
   }

   public void setfacilityIsAvailable(boolean facilityIsAvailable){
       this.facilityIsAvailable = facilityIsAvailable;
   }

    //prints list of all Facilities from facilityList by Name
    public void listFacilities(String facilityName, String facilityLocation){
        System.out.println("List of Book Stores: ");
        for(int i = 0; i < facilityList.size(); i++){
            System.out.println(facilityList.get(i).getfacilityName());
        }
    }

    //prints a Facility's name, location, and availability to the console
    public void getFacilityInformation(Facility facility){
        System.out.println(facilityName + facilityLocation + facilityIsAvailable);
    }

    //checks facilityList for Facilities that are available, and prints them to the console
    public void requestAvailableFacility(boolean facilityIsAvailable){
        for(int i = 0; i < facilityList.size(); i++){
            if(facilityIsAvailable = true){
                System.out.println(facilityList.get(i).getfacilityName());
            }
        }
    }

    //adds the name, location, and availability of a new Facility to facilityList
    public void addNewFacility(Facility facility){
        facilityList.add(new Facility(facilityName, facilityLocation, facilityDetail, facilityIsAvailable));
    }

    //adds details of Facility to the facilityDetail field, which is blank by default
    public void addFacilityDetail(facilityDetail){
        facilityList.set(Facility.facilityDetail);
    }

    //removes Facility from facilityList by Name
    public void removeFacility(Facility facility){
        facilityList.remove(facilityName);
    }
}