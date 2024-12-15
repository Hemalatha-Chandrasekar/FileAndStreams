package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Empolyee {
    String empId,empFN,empLM,empTitle;
    public Empolyee() {

    }
    public Empolyee(String empId, String empFN, String empLM, String empTitle) {
        this.empId = empId;
        this.empFN = empFN;
        this.empLM = empLM;
        this.empTitle = empTitle;
    }
    public void readEmpFile(){
        String file_path="c:\\Users\\Hema\\employee.csv";
        File file = new File(file_path);

        try{
            try(Scanner scanner = new Scanner(file)){
                ArrayList<Empolyee>empdata=new ArrayList<Empolyee>();
                while(scanner.hasNext()){
                    String[] line=scanner.nextLine().split(",");
                    empdata.add(new Empolyee(line[0],line[1],line[2],line[3]));
                }
                System.out.println("EmpId: \t First Name \t Last Name\tTitle");
                for(Empolyee emp:empdata){
                    System.out.println(emp.getEmpId()+"\t"+emp.getEmpFN()+"\t"+emp.getEmpLM()+"\t"+emp.getEmpTitle());
                }

            }
    }


catch(Exception e){
        e.printStackTrace();
        }
    }
    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public String getEmpLM() {
        return empLM;
    }

    public void setEmpLM(String empLM) {
        this.empLM = empLM;
    }

    public String getEmpFN() {
        return empFN;
    }

    public void setEmpFN(String empFN) {
        this.empFN = empFN;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

}
