public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient new_patient = new Patient(id, name, age, bloodgroup, null, null) ;
        this.dh.prev.next = new_patient;
        new_patient.prev = this.dh.prev;
        new_patient.next = this.dh;
        this.dh.prev = new_patient;
    }

    public void servePatient() {
        // To do
        Patient patient = this.dh.next;
        System.out.println(patient.name +" is served");
        this.dh.next = patient.next ;
        patient.next.prev = this.dh;
    }

    public void showAllPatient() {
        Patient temp = this.dh.next ;
        while (temp != this.dh) {
            System.out.println("ID: "+temp.id+"\nName: "+temp.name+"\nAge: "+temp.age+"\nBlood Group: "+temp.bloodGroup);
            temp = temp.next;
            System.out.println("===================================");
        }
    }

    public boolean canDoctorGoHome() {
        // To Do
        if (this.dh.next == dh || this.dh.prev == dh) {
            return true;
        }
        return false;
    }

    public void cancelAll() {
        // To Do
        this.dh.next = dh;
        this.dh.prev = dh;
        System.out.println("All reservation cancelled successfully");
    }

    public void reverseTheLine() {
        Patient current = this.dh ;
        while (true) {
            Patient next = current.next;
            Patient prev = current.prev;
            current.prev = next;
            current.next = prev;
            current = current.prev ;
            if (current == dh) {
                break;
            }
        }
    }


}
