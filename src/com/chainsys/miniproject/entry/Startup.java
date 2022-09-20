package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentsUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

/**
 * 
 * @author shan3102 created on :13/5/20022
 * 
 */
public class Startup {

	public static void main(String[] args) {
//		TestAppointments.testUpdateAppointments();
				loadMenu();
//EmployeeUi.addNewEmployee();
			}

			private static void loadMenu() {
				System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
				java.util.Scanner sc = new java.util.Scanner(System.in);
		      try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					loadEmployeeMenu();
					break;
				case 2:
					loadDoctorMenu();
					break;
				case 3:
					loadAppointmentMenu();
					break;
				}
		      }finally {
		    	  sc.close();
		      }
			}

			private static void loadEmployeeMenu() {
				System.out.println(
						"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=updateEmployeeFirstName, 5=updateEmployeeSalary, 6=deleteEmployee, 7=getAllEmployeeDetails");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				
				switch (call) {
				case 1:
					EmployeeUi.addNewEmployee();
					break;

				case 2:
					EmployeeUi.fetchEmployeeById();
					break;
				case 3:
					EmployeeUi.UpdateEmployee();
					break;
				case 4:
					EmployeeUi.updateFirstnameOfEmployee();
					break;
				case 5:
					EmployeeUi.updateSalaryOfEmployee();
					break;
				case 6:
					EmployeeUi.deleteEmployee();
					break;
				case 7:
					EmployeeUi.fetchAllEmployee();
					break;
				}
				}finally {
					sc.close();
				}
				
			}

			private static void loadDoctorMenu() {
				System.out.println(
						"Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=updateDoctor ,4=updateDoctorFees, 5=updateDoctorFirstName, 6=getAllDoctorDetails, 7=deleteDoctor ");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					DoctorUi.addNewDoctor();
					break;
				case 2:
					DoctorUi.getDoctorById();
					break;
				case 3:
					DoctorUi.editDoctor();
					break;
				case 4:
					DoctorUi.updateStandardFee();
					break;
				case 5:
					DoctorUi.updatenameOfDoctor();
					break;
				case 6:
					DoctorUi.getAllDoctor();
					break;
				case 7:
					DoctorUi.deleteDoctorById();
					break;
				}
				}finally {
					sc.close();
				}
			}

			private static void loadAppointmentMenu() {
				System.out.println(
						"Enter Method : 1=addNewAppointment ,2=EditAppointment ,3=updateDateOfAppointments ,4=getAppointmentsById ,5=updateFeesCollected ,6=getAllAppointments");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					AppointmentsUi.addNewAppointments();
					break;
				case 2:
					AppointmentsUi.editAppointments();;
					break;
				case 3:
					AppointmentsUi.updateDateOfAppointments();;
					break;
				case 4:
					AppointmentsUi.updateCollectedFee();;
					break;
				case 5:
					AppointmentsUi.getAppointmentsById();;
					break;
				case 6:
					AppointmentsUi.getAllAppointments();
					break;
			
				}
				}finally {
					sc.close();
				}
			}
		

}
/*
 * input = null; input = new Scanner(System.in); int choice = 0; int ch = 0; try
 * { do {
 * System.out.println("---------------   EMPLOYEE MANAGEMENT	---------------"
 * ); System.out.println("\n" + "1. Add Employee" + "\n" + "2. Update Employee"
 * + "\n" + "3. Delete Employee" + "\n" + "4. Search Employee By Id" + "\n" + ""
 * + "5. Fetch All" + "\n" + "6.Exit\n");
 * System.out.println("Enter the number (1-5) : "); choice = input.nextInt();
 * 
 * switch (choice) { case 1: { System.out.
 * println("---------------------------- Add Employee ----------------------------\n"
 * ); EmployeeUi.addNewEmployee(); break; } case 2: { System.out.
 * println("---------------------------- Edit Employee ----------------------------\n"
 * ); System.out.println("\n" + "1. To Edit All Deta " + "\n" +
 * "2. To Edit firstName and lastname " + "\n" + "3. To Edit Salary " + "\n" +
 * "4. Back to main menu"); switch (ch) { case 1: { EmployeeUi.UpdateEmployee();
 * break; } case 2: { EmployeeUi.updateFirstnameOfEmployee(); break; } case 3: {
 * EmployeeUi.updateSalaryOfEmployee(); break; } case 4: {
 * System.out.println("Back to main menu!!!!"); continue; } default:
 * System.out.println("please Enter Correct Option !!!"); }
 * 
 * break; } case 3: { System.out.
 * println("---------------------------- Delete Employee ----------------------------\n"
 * ); EmployeeUi.deleteEmployee(); break; } case 4: { System.out
 * .println("---------------------------- Get Employee By Id ----------------------------\n"
 * ); EmployeeUi.fetchEmployeeById(); break; } case 5: { System.out.
 * println("---------------------------- Get All Employee ----------------------------\n"
 * ); EmployeeUi.fetchAllEmployee(); break; } default:
 * System.out.println("Please Enter Correct Option!!!"); System.out.println(
 * "******************************************************************************************************************"
 * ); }
 * 
 * } while (choice != 6); } finally { input.close(); }
 * 
 * } }
 */

//menu
// scanner
// switch case
// EmployeeUi.addNewEmployee();
