/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

import view.Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Login().setVisible(true);
            }
        });
    }
}
