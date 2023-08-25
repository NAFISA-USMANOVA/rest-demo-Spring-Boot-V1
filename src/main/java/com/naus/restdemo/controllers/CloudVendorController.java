package com.naus.restdemo.controllers;

import com.naus.restdemo.models.CloudVendor;
import com.naus.restdemo.services.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    //CloudVendor cloudVendor; // object. We delete it when start to link with ...
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    //Read specific Cloud Vendor Details from DB
    @GetMapping("{vendoorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        // FirstStarting return cloudVendor; // Why? Bc we will create "createCloudVendorDetails" will be filling in details in this object itself
        //and the same value should be returned with the help of this getCloudVendorDetails
//                new CloudVendor("C1","Vendor 1",
//                        "Address one", "678768768");
        //Those two line above were used to start and test the project
    }
    //Read All Cloud Vendor Details from DB
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }


        @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {// Why CloudVendor? Bc the CloudVendor object we'll be receiving in the post request as a request body itself
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);

        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}

