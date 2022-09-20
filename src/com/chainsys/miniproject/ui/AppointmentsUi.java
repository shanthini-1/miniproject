package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutils.InvalidInputDataException;
import com.chainsys.miniproject.commonutils.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentsUi {
	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		try {
			Appointment newdoctor = new Appointment();
			System.out.println("Enter Appointment Id ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int aId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(aId);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setAppointment_id(aId);
//------------------------			
			System.out.println("Enter Patient Name ");
			String name = sc.nextLine();
			try {
				Validator.checkStringSpacesLength(name);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setPatient_name(name);
//------------------------------
			System.out.println("Enter Appointment Date as dd/mm/yyyy");
			String sDate = sc.nextLine();
			try {
				Validator.checkDateFormat(sDate);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}

			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			newdoctor.setAppointment_date(date);
//-------------------------------			
			System.out.println("Enter Patient Phone Number ");
			String phno = sc.nextLine();
			try {
				Validator.checkStringForParse(phno);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			try {
				Validator.checklengthOfPhno(phno);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			long pno = Long.parseLong(phno);
			newdoctor.setPat_phone_no(pno);
//-----------------------------------			
			System.out.println("Enter Doctor Id");
			String docid = sc.nextLine();
			try {
				Validator.checkStringForParse(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int dId = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setDoc_id(dId);
//--------------------------------		
			System.out.println("Enter fee Collected ");
			String fee = sc.nextLine();
			try {
				Validator.checkStringForParseFloat(fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float cfee = Float.parseFloat(fee);
			try {
				Validator.checkfee(cfee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoctor.setFee_collected(cfee);
//----------------------------------			

			int result = AppointmentsDao.insertAppointments(newdoctor);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void editAppointments() {
		Scanner sc = new Scanner(System.in);
		try {
			Appointment newdoctor = new Appointment();
			System.out.println("Enter Appointment Id ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int aId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(aId);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setAppointment_id(aId);
//------------------------			
			System.out.println("Enter Patient Name ");
			String name = sc.nextLine();
			try {
				Validator.checkStringSpacesLength(name);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setPatient_name(name);
//------------------------------
			System.out.println("Enter Appointment Date as dd/mm/yyyy");
			String sDate = sc.nextLine();
			try {
				Validator.checkDateFormat(sDate);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}

			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			newdoctor.setAppointment_date(date);
//-------------------------------			
			System.out.println("Enter Patient Phone Number ");
			String phno = sc.nextLine();
			try {
				Validator.checkStringForParse(phno);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			try {
				Validator.checklengthOfPhno(phno);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			long pno = Long.parseLong(phno);
			newdoctor.setPat_phone_no(pno);
//-----------------------------------			
			System.out.println("Enter Doctor Id");
			String docid = sc.nextLine();
			try {
				Validator.checkStringForParse(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int dId = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			newdoctor.setDoc_id(dId);
//--------------------------------		
			System.out.println("Enter fee Collected ");
			String fee = sc.nextLine();
			try {
				Validator.checkStringForParseFloat(fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float cfee = Float.parseFloat(fee);
			try {
				Validator.checkfee(cfee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoctor.setFee_collected(cfee);
//----------------------------------			
			int result = AppointmentsDao.updateAppointments(newdoctor);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void deleteAppointmentsById() {
		Scanner sc = new Scanner(System.in);
		String s1 = null;
		int result = 0;
		try {
			System.out.println("Enter Appointment Id ");
			s1 = sc.nextLine();
			try {
				Validator.checkStringForParse(s1);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int id = Integer.parseInt(s1);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			result = AppointmentsDao.deleteAppointments(id);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

	public static void getAppointmentsById() {

		Scanner sc = new Scanner(System.in);
		String s1 = null;
		try {
			System.out.println("Enter Appointment id");
			s1 = sc.nextLine();
			try {
				Validator.checkStringForParse(s1);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int id = Integer.parseInt(s1);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Appointment doc = AppointmentsDao.getAppointmentsById(id);
			System.out.println(doc.getAppointment_id() + " " + doc.getPatient_name() + " " + doc.getAppointment_date()
					+ " " + doc.getFee_collected() + " " + doc.getDoc_id() + " " + doc.getPat_phone_no());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void getAllAppointments() {

		List<Appointment> allAppointmentss = AppointmentsDao.getAllAppointments();
		Iterator<Appointment> dociterator = allAppointmentss.iterator();
		while (dociterator.hasNext()) {
			Appointment doc = dociterator.next();
			System.out.println(doc.getAppointment_id() + " " + doc.getPatient_name() + " " + doc.getAppointment_date()
					+ " " + doc.getFee_collected() + " " + doc.getDoc_id() + " " + doc.getPat_phone_no());
		}

	}

	public static void updateDateOfAppointments() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int id = 0;
		try {
			System.out.println("Enter Appointment Id: ");
			String s1 = sc.nextLine();
			try {
				Validator.checkStringForParse(s1);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			id = Integer.parseInt(s1);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			System.out.println("Enter Appointment Date as dd/mm/yyyy");
			String sDate = sc.nextLine();
			try {
				Validator.checkDateFormat(sDate);
			} catch (InvalidInputDataException e1) {
				e1.printStackTrace();
			}
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			result = AppointmentsDao.updateAppointmentsDate(id, date);
			System.out.println(result + " updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void updateCollectedFee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int id = 0;
		float CollFee = 0;
		try {
			System.out.println("Enter Doctor Id: ");
			String docid = sc.nextLine();
			try {
				Validator.checkStringForParse(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			id = Integer.getInteger(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			System.out.println("Enter Standard Fee: ");
			String feecol = sc.nextLine();
			try {
				Validator.checkStringForParseFloat(feecol);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			CollFee = Float.parseFloat(feecol);
			try {
				Validator.checkfee(CollFee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			result = AppointmentsDao.updateAppointmentsCollectedFee(id, CollFee);
			System.out.println(result + " updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
