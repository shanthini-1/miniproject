package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutils.InvalidInputDataException;
import com.chainsys.miniproject.commonutils.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctors;


public class DoctorUi {
		
		public static void addNewDoctor() {
			Scanner sc=new Scanner(System.in);
			try {
				Doctors newdoctor=new Doctors();
				System.out.println("Enter Doctor id");
				String id=sc.nextLine();
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				int dId =Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(dId);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				newdoctor.setDoc_id(dId);
//---------------------------------------------				
				System.out.println("Enter Doctor name");
				String name =sc.nextLine();
				try {
					Validator.checkStringSpacesLength(name);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				newdoctor.setDoc_name(name);
//----------------------------------------------				
				System.out.println("Enter dob as dd/mm/yyyy");
				String sDate=sc.nextLine();
				try {
					Validator.checkDateFormat(sDate);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				Date date=null;
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				newdoctor.setDoc_dob(date);
//---------------------------------------------------				
				System.out.println("Enter email :");
				String mail =sc.nextLine();
				try {
					Validator.checkMail(mail);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setDoc_email(mail);
//----------------------------------------------------				
				System.out.println("Enter city");
				String cty =sc.nextLine();
				try {
					Validator.checkStringOnly(cty);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setCity(cty);
//-----------------------------------------------------				
				System.out.println("Enter doctor phone number");
				String phno=sc.nextLine();
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
				long pno =Long.parseLong(phno);
				
				newdoctor.setDoc_phone_no(pno);
//------------------------------------------------------					
				System.out.println("Enter Speciality");
				String spec=sc.nextLine();
				try {
					Validator.checkStringSpacesLength(spec);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setSpeciality(spec);
//------------------------------------				
				System.out.println("Enter standard fees");
				String fees=sc.nextLine();
				try {
					Validator.checkStringForParseFloat(fees);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				float sfee =Integer.parseInt(fees);
				try {
					Validator.checkfee(sfee);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setStandard_fee(sfee);
//---------------------------------
				int result =DoctorDao.insertDoctor(newdoctor);
				System.out.println(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}finally {
			sc.close();
			}
		}
		public static void editDoctor() {
			Scanner sc=new Scanner(System.in);
			try {
				Doctors newdoctor=new Doctors();
				System.out.println("Enter Doctor id");
				String id=sc.nextLine();
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				int dId =Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(dId);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				newdoctor.setDoc_id(dId);
//---------------------------------------------				
				System.out.println("Enter Doctor name");
				String name =sc.nextLine();
				try {
					Validator.checkStringSpacesLength(name);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				newdoctor.setDoc_name(name);
//----------------------------------------------				
				System.out.println("Enter dob as dd/mm/yyyy");
				String sDate=sc.nextLine();
				try {
					Validator.checkDateFormat(sDate);
				} catch (InvalidInputDataException e1) {
					e1.printStackTrace();
				}
				Date date=null;
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				newdoctor.setDoc_dob(date);
//---------------------------------------------------				
				System.out.println("Enter email :");
				String mail =sc.nextLine();
				try {
					Validator.checkMail(mail);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setDoc_email(mail);
//----------------------------------------------------				
				System.out.println("Enter city");
				String cty =sc.nextLine();
				try {
					Validator.checkStringSpacesLength(cty);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setCity(cty);
//-----------------------------------------------------				
				System.out.println("Enter doctor phone number");
				String phno=sc.nextLine();
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
				long pno =Long.parseLong(phno);
				
				newdoctor.setDoc_phone_no(pno);
//------------------------------------------------------					
				System.out.println("Enter Speciality");
				String spec=sc.nextLine();
				try {
					Validator.checkStringSpacesLength(spec);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setSpeciality(spec);
//------------------------------------				
				System.out.println("Enter standard fees");
				String fees=sc.nextLine();
				try {
					Validator.checkStringForParseFloat(fees);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				float sfee =Integer.parseInt(fees);
				try {
					Validator.checkfee(sfee);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoctor.setStandard_fee(sfee);
//---------------------------------
				
				int result =DoctorDao.updateDoctor(newdoctor);
				System.out.println(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}finally {
			sc.close();
			}
		}
		
		public static void deleteDoctorById() {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("Enter doctor id");
				String s1=sc.nextLine();
				try {
					Validator.checkStringForParse(s1);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				int id=Integer.parseInt(s1);
				try {
					Validator.CheckNumberForGreaterThanZero(id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				int result=	DoctorDao.deleteDoctor(id);
				
				System.out.println(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}finally {
				sc.close();
			}
			
			
		}
		public static void getDoctorById() {
			
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("Enter doctor id");
				String s1=sc.nextLine();
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
				Doctors doc=DoctorDao.getDoctorById(id);
				System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDoc_phone_no()+" "+
					doc.getSpeciality()+" "+doc.getStandard_fee());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}finally {
				sc.close();
			}
			
			
			
		}
		public static void getAllDoctor() {
			        
			 List<Doctors> allDoctors=DoctorDao.getAllDoctor();
			 Iterator<Doctors> dociterator=allDoctors.iterator();
			 while (dociterator.hasNext()) {
				 Doctors doc=dociterator.next();
				 System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDoc_phone_no()+" "
				 +doc.getSpeciality()+" "+doc.getStandard_fee()+" "+doc.getCity());}
		
		}
		public static void updatenameOfDoctor() {
			Scanner sc = new Scanner(System.in);
			int result =0;
			String name =null;
			System.out.println("Enter Doctor id");
			String id=sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int dId =Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
		    System.out.println("Enter Correct Name: ");
		    name = sc.nextLine();
		    try {
				Validator.checkStringSpacesLength(name);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			sc.close();
			result = DoctorDao.updateDoctorName(dId,name);
			System.out.println(result+" updated Successfully");
		}
		public static void updateStandardFee() {
			Scanner sc =new Scanner(System.in);
			int result =0;
			System.out.println("Enter Doctor id");
			String id=sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int dId =Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			System.out.println("Enter standard fees");
			String fees=sc.nextLine();
			try {
				Validator.checkStringForParseFloat(fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float sfee =Integer.parseInt(fees);
			try {
				Validator.checkfee(sfee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			result = DoctorDao.updateDoctorStandardFee(dId,sfee);
			System.out.println(result+" updated Successfully");
			sc.close();
		}

}
