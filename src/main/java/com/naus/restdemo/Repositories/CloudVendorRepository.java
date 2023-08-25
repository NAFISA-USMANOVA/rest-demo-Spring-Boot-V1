package com.naus.restdemo.Repositories;

import com.naus.restdemo.models.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{//Entity, Id

}
