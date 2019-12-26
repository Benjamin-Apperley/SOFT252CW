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
public class Prescription 
{
    public String doctorId;
    public String patientId;
    public String notes;
    public String medicine;
    public int quantity;
    public String dosage;
    
    public Prescription(String doctorId, String patientId, String notes, String medicine, int quantity, String dosage)
    {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.notes = notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    
}
