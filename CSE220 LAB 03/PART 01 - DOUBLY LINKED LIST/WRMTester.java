import java.util.Scanner;
public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        // To Do
        // Create WRM Object and call the necessary methods
        WRM wrm = new WRM();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the option of the room you would like to enter: ");
            System.out.println("1. RegisterPatient()\n2. ServePatient()\n3. CancelAll()\n4. CanDoctorGoHome()\n5. ShowAllPatient()\n6. ReverseTheLine() \n7. Exit\n=======================");
            System.out.print("Enter your option: ");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Executing Patient Registrar: ") ;
                System.out.print("Enter Patient ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Patient Name: ");
                String Name = sc.next();
                System.out.print("Enter Patient Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Patient Blood Group: ");
                String bgrp = sc.next();
                wrm.registerPatient(id, Name, age, bgrp);
                System.out.println("Patient Registered Successfully!");
            }
            else if (x == 2) {
                wrm.servePatient();
            }
            else if (x == 3) {
                wrm.cancelAll();
            }
            else if (x == 4) {
                if (wrm.canDoctorGoHome()) {
                    System.out.println("Doctor Go Home");
                }
                else {
                    System.out.println("Doctor can not Go Home");
                }
            }
            else if (x == 5) {
                System.out.println("Showing Patient(s) Info: \n");
                wrm.showAllPatient();
            }
            else if (x == 6) {
                System.out.println("Reversing the Line...");
                wrm.reverseTheLine();
                System.out.println("Reversed the Line Successfully!");
            }
            else {
                System.out.println("Exiting.....");
                break ;
            }
        }
    }
}
