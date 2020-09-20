package com.jeethu.hospital.service;

import com.jeethu.hospital.model.Doctors;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Doctors> getDoctors(){
        List<Doctors> doctors = new ArrayList<>();

        Doctors doctor1 = new Doctors(1, "https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", "Dr. ABC", "Cardiologist", "ABC description");

        Doctors doctor2 = new Doctors(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQE9tG_NFfmLde3aA3q3p2yib1KJslRRNlJQg&usqp=CAU", "Dr. XYZ", "Dentist", "XYZ description");

        doctors.add(doctor1);
        doctors.add(doctor2);

        return doctors;
    }

    public List<Doctors> searchedDoctors(String doctorName){
        List<Doctors> doctors = new ArrayList<>();

        Doctors doctor1 = new Doctors(1, "https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", doctorName, "Cardiologist", "ABC description");

        doctors.add(doctor1);

        return doctors;
    }
}
