package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointment;


public class TestAppointments {
	public static void testInsertAppointments() {
		Appointment newdoc = new Appointment();
		newdoc.setAppointment_id(1001);
		newdoc.setPatient_name("Anu");

		String sDate1 = "31/05/2022";
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			newdoc.setAppointment_date(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		newdoc.setPat_phone_no(1234456799l);
		newdoc.setFee_collected(500);
		int result = AppointmentsDao.insertAppointments(newdoc);
		System.out.println(result);

	}

	public static void testUpdateAppointments() {
		Appointment oldAppointments = AppointmentsDao.getAppointmentsById(2101);

		System.out.println(oldAppointments.getAppointment_id() + " " + oldAppointments.getPatient_name() + " "
				+ oldAppointments.getAppointment_date() + " " + oldAppointments.getFee_collected() + " "
				+ oldAppointments.getDoc_id() + " " + oldAppointments.getPat_phone_no());
        
		String sDate1 = "13/05/2022";
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			oldAppointments.setAppointment_date(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		oldAppointments.setPatient_name("Abi");
		oldAppointments.setPat_phone_no(1212222277l);
		oldAppointments.setFee_collected(800);
		int result = AppointmentsDao.updateAppointments(oldAppointments);
		System.out.println(result);

	}

	public static void testDeleteAppointments() {
		int result = AppointmentsDao.deleteAppointments(1001);
		System.out.println(result);
	}

	public static void testGetAppointmentsById() {
		Appointment doc = AppointmentsDao.getAppointmentsById(1001);
		System.out.println(doc.getAppointment_id() + " " + doc.getPatient_name() + " " + doc.getAppointment_date() + " "
				+ doc.getFee_collected() + " " + doc.getDoc_id() + " " + doc.getPat_phone_no());
	}

	public static void testGetAllAppointmentss() {
		List<Appointment> allAppointmentss = AppointmentsDao.getAllAppointments();
		Iterator<Appointment> docIterator = allAppointmentss.iterator();
		while (docIterator.hasNext()) {
			Appointment doc = docIterator.next();
			System.out.println(doc.getAppointment_id() + " " + doc.getPatient_name() + " " + doc.getAppointment_date()
					+ " " + doc.getFee_collected() + " " + doc.getDoc_id() + " " + doc.getPat_phone_no());
		}
	}

	public static void testUpdateAppointmentsDate() {
		Appointment oldapt = AppointmentsDao.getAppointmentsById(1001);
		try {
			System.out.println(oldapt.getAppointment_id()+ " " + oldapt.getAppointment_date() );
			int id =1001;
			String sDate1 = "13/05/2022";
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int result = AppointmentsDao.updateAppointmentsDate(id,date1);
			System.out.println(result);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	public static void testUpdateCollectedFee() {
		Appointment oldapt = AppointmentsDao.getAppointmentsById(1001);
		try {
			System.out.println(oldapt.getAppointment_id()+ " " + oldapt.getFee_collected() );
			int id =1001;
			float fee = (float) 358.89;
			int result = AppointmentsDao.updateAppointmentsCollectedFee(id,fee);
			System.out.println(result);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
