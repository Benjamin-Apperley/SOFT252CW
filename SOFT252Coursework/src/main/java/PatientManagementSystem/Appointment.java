/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

/**
 *
 * @author apper
 */
public class Appointment 
{
    public String doctorId;
    public String patientId;
    public String dates;
    
    public Appointment(String dId, String pId, String date)
    {
        this.doctorId = dId;
        this.patientId = pId;
        this.dates = date;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }
    
    
            
}
