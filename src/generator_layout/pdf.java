/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator_layout;
import generator_layout.createPaper;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class pdf {
 
    public static void  fetch(String school, String typeofpaper, String Subject, String Subjectcode, String Class,String Marks,String Time,String Seme,String level){
       String FILE_NAME="";
                String quemarks="";
              JFileChooser c =new JFileChooser();
        c.showOpenDialog(null);
        File f=c.getSelectedFile();
        FILE_NAME=f.getAbsolutePath();
       // String FILE_NAME = "E:\\java_pdf\\QuestionPaper3.pdf";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            document.open();
            Paragraph p2 = new Paragraph();
            p2.add(school+"\n"+typeofpaper+"\n"+Subject+"\n"+Subjectcode+"\n"+Class+"\n\n");            
         p2.setAlignment(Element.ALIGN_CENTER);
         
            document.add(p2);
            Paragraph m1= new Paragraph();
          m1.add("Time Allowed : "+Time);
          m1.add("\t\t\t\t                                                                       Maximum marks : "+Marks+"\n");
            m1.setAlignment(Element.ALIGN_LEFT);
           
         document.add(m1);
         
         
            Paragraph p = new Paragraph();
    
            p.setAlignment(Element.ALIGN_LEFT);
            document.add(p);
    
            Font f1 = new Font();
            f1.setFamily("TIMES_ROMAN");
            f1.setStyle(Font.NORMAL);
            f1.setSize(10);
            document.add(new Paragraph("\nINSTRUCTIONS :\n 1. ATTEMPT ALL QUESTIONS FROM THE FOLLOWING.", f1));
           // document.add(Image.getInstance("E:\\pictures\\c.png"));
             
             
             Connection connection = DBConnection.getConnection();
         PreparedStatement ps9=connection.prepareStatement("select  Compulsoryque, eachquemark from queoption where Queno='1' and ROWNUM<=1 ");
             ResultSet rs0=ps9.executeQuery();
              String quemark="",compulque="";
             while(rs0.next()){
                compulque= rs0.getString("Compulsoryque");
            //  System.out.println("compulsoryque="+compulque);
             quemark=rs0.getString("eachquemark");
              // System.out.println("eachque="+quemark);
             }
             
             
              Paragraph pt=new Paragraph();
           pt.add("\n                                                          Section - I "+"                                                                       "+"("+ quemark+"*"+compulque +")\n");
           pt.setAlignment(Element.ALIGN_CENTER);
           document.add(pt);
           
           
           
         if(level.equals("low") && (quemark.equals("1")||quemark.equals("2"))){
            
             System.out.println("enter into it");
           
   
           System.out.println("enter into it");
            Paragraph p4 = null;
            PreparedStatement ps90=connection.prepareStatement("select question from dataEntry where branchname=?\n" +
"and course=?and courseid=? and semester=? and complexitylevel=? and quemarks=? and ROWNUM <=? ");

               ps90.setString(1,Class );
            ps90.setString(2,Subject );
             ps90.setString(3,Subjectcode );
              ps90.setString(4,Seme );
               ps90.setString(5,level );
                ps90.setString(6,quemark );
                 ps90.setString(7,compulque );
            ResultSet rs90 = ps90.executeQuery();
             com.itextpdf.text.List list=new com.itextpdf.text.List(true,20);
            while (rs90.next()) {
              
               list.add(rs90.getString("question"));
          
                
            }
            document.add(list);
           Paragraph p0=new Paragraph();
           p0.add("\n");
           document.add(p0);
           
              }
           
         
             
          
           
                PreparedStatement ps19=connection.prepareStatement("select  Compulsoryque, eachquemark from queoption where Queno='2' and ROWNUM<=1 ");
             ResultSet rs10=ps19.executeQuery();
              String quemark2="",compulque2="";
             while(rs10.next()){
                compulque2= rs10.getString("Compulsoryque");
        
             quemark2=rs10.getString("eachquemark");
            
             }
      
                /*----- section II---*/
             Paragraph p01=new Paragraph();
           p01.add("                                                          Section - II "+"                                                                       "+"("+ quemark2+"*"+compulque2 +")\n");

            p01.setAlignment(Element.ALIGN_CENTER);
           document.add(p01);
             if(level.equals("low") &&( quemark2.equals("3")||quemark2.equals("4"))){
            
           System.out.println("enter into it");
            Paragraph p4 = null;
            PreparedStatement pst=connection.prepareStatement("select question from dataEntry where branchname=?\n" +
"and course=?and courseid=? and semester=? and complexitylevel=? and quemarks=? and ROWNUM <=? ");

               pst.setString(1,Class );
            pst.setString(2,Subject );
             pst.setString(3,Subjectcode );
              pst.setString(4,Seme );
               pst.setString(5,level );
                pst.setString(6,quemark2 );
                 pst.setString(7,compulque2 );
            ResultSet rst = pst.executeQuery();
            com.itextpdf.text.List list=new com.itextpdf.text.List(true,20);
            while (rst.next()) {
               
               list.add(rst.getString("question"));
          
                
            }
            document.add(list);
           Paragraph pu=new Paragraph();
           pu.add("\n");
           document.add(pu);
           
              }
             
             
                PreparedStatement ps99=connection.prepareStatement("select  Compulsoryque, eachquemark from queoption where Queno='3' and ROWNUM<=1 ");
             ResultSet rs01=ps99.executeQuery();
              String quemark3="",compulque3="";
             while(rs01.next()){
                compulque3= rs01.getString("Compulsoryque");
             quemark3=rs01.getString("eachquemark");
              
             }
              /*----- section III---*/
             Paragraph p011=new Paragraph();
           p011.add("                                                          Section - III "+"                                                                       "+"("+ quemark3+"*"+compulque3 +")\n");

            p011.setAlignment(Element.ALIGN_CENTER);
           document.add(p011);
             if(level.equals("low") && (quemark3.equals("5")||quemark3.equals("6")||quemark3.equals("10"))){
            
           System.out.println("enter into it");
            Paragraph p4 = null;
            PreparedStatement ps909=connection.prepareStatement("select question from dataEntry where branchname=?\n" +
"and course=?and courseid=? and semester=? and complexitylevel=? and quemarks=? and ROWNUM <=? ");

               ps909.setString(1,Class );
            ps909.setString(2,Subject );
             ps909.setString(3,Subjectcode );
              ps909.setString(4,Seme );
               ps909.setString(5,level );
                ps909.setString(6,quemark3 );
                 ps909.setString(7,compulque3 );
            ResultSet rs909 = ps909.executeQuery();
            com.itextpdf.text.List list3=new com.itextpdf.text.List(true,20);
            while (rs909.next()) {
               
               list3.add(rs909.getString("question"));
          
                
            }
            document.add(list3);
           Paragraph p10=new Paragraph();
           p10.add("\n");
           document.add(p10);
           
              }
           

            document.close();
            System.out.println("Done");
           
                              ImageIcon icon = new ImageIcon("E:\\NetBeansProjects\\Question_paper_generator\\src\\generator_layout\\download(5)" );
 
JOptionPane.showMessageDialog(null, "Download successfully", "IMP", JOptionPane.INFORMATION_MESSAGE, icon );

        }
        
        catch (Exception e) {
            e.printStackTrace();
            ImageIcon icon = new ImageIcon("E:\\NetBeansProjects\\Question_paper_generator\\src\\generator_layout\\download(5)" );
 
JOptionPane.showMessageDialog(null, "SQLEXCEPTION", "IMP", JOptionPane.INFORMATION_MESSAGE, icon );

        }
    }
    
    public static void main(String[] args) {
    	
    }
    

}
