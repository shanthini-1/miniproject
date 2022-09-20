package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctors;


public class TestDoctorDao {
//insert test
	public static void testInsertDoctor() {
		Doctors newdoc = new Doctors();
		try {
			newdoc.setDoc_id(101);
			newdoc.setDoc_name("Ana");
			String sDate1 = "31/12/1998";
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				newdoc.setDoc_dob(date1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			newdoc.setDoc_email("ana23@mail.com");
			newdoc.setSpeciality("ENT");
			newdoc.setCity("chennai");
			newdoc.setDoc_phone_no(1234567899l);
			newdoc.setStandard_fee(200);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void testUpdateDoctor() {
		Doctors oldDoctor = DoctorDao.getDoctorById(100);
		try {
			System.out.println(oldDoctor.getDoc_id() + " " + oldDoctor.getDoc_name() + " " + oldDoctor.getDoc_dob()
					+ " " + oldDoctor.getDoc_email() + " " + oldDoctor.getSpeciality() + " " + oldDoctor.getCity() + " "
					+ oldDoctor.getDoc_phone_no() + " " + oldDoctor.getStandard_fee());
			oldDoctor.setDoc_name("Little");
			String sDate1 = "23/10/1996";
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				oldDoctor.setDoc_dob(date1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			oldDoctor.setDoc_email("Jeolil@mail.com");
			oldDoctor.setSpeciality("SKIN");
			oldDoctor.setCity("chennai");
			oldDoctor.setDoc_phone_no(1212343677l);
			oldDoctor.setStandard_fee(500);
			int result = DoctorDao.updateDoctor(oldDoctor);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void testDeleteDoctor() {
		try {
			int result = DoctorDao.deleteDoctor(100);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testGetDoctorById() {
		try {
			Doctors doc = DoctorDao.getDoctorById(100);
			System.out.println(doc.getDoc_id() + " " + doc.getDoc_name() + " " + doc.getStandard_fee());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testGetAllDoctors() {
		List<Doctors> allDoctors = DoctorDao.getAllDoctor();
		Iterator<Doctors> docIterator = allDoctors.iterator();
		while (docIterator.hasNext()) {
			Doctors doc = docIterator.next();
			System.out.println(doc.getDoc_id() + " " + doc.getDoc_name() + " " + doc.getStandard_fee());
		}
	}

	public static void testUpdateNameOfDoctor() {
		Doctors oldDoctor = DoctorDao.getDoctorById(100);
		try {
			System.out.println(oldDoctor.getDoc_id() + " " + oldDoctor.getDoc_name() );
			int result = DoctorDao.updateDoctorName(100,"Annie");
			System.out.println(result);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	public static void testUpdateStandardFee() {
		Doctors oldDoctor = DoctorDao.getDoctorById(100);
		int result =0;
		System.out.println(oldDoctor.getDoc_id() + " " + oldDoctor.getDoc_name() +" "+ oldDoctor.getStandard_fee());
		int id =100;
		float standardFee =(float) 230.30;
		result = DoctorDao.updateDoctorStandardFee(id,standardFee);
		System.out.println(result+" updated Successfully");
	}

}
