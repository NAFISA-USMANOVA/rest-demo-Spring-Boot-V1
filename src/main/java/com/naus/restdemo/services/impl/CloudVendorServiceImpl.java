package com.naus.restdemo.services.impl;

import com.naus.restdemo.Repositories.CloudVendorRepository;
import com.naus.restdemo.models.CloudVendor;
import com.naus.restdemo.services.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;//instantiating.
    //Constructor.To interact with Service Layer
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic comes here
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic comes here
        cloudVendorRepository.save(cloudVendor);
        return "Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //More Business Logic comes here
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted Successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) //To get an object
    {
        //More Business Logic comes here
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() //For get all vendors
    {
        //More Business Logic comes here
        return cloudVendorRepository.findAll();
    }

}
// package com.naus.restdemo.services;
//
//import com.naus.restdemo.models.CloudVendor;
//
//import java.util.List;
//
//
//public class CloudVendorService {
//    public String createCloudVendor(CloudVendor cloudVendor) {
//        return null;
//    }
//
//    public String updateCloudVendor(CloudVendor cloudVendor) {
//        return null;
//    }
//
//    public String deleteCloudVendor(String cloudVendorId) {
//        return null;
//    }
//
//    public CloudVendor getCloudVendor(String cloudVendorId) //To get an object
//    {
//        return null;
//    }
//
//    public List<CloudVendor> getAllCloudVendors() //For get all vendors
//    {
//        return null;
//    }
//
//
//}