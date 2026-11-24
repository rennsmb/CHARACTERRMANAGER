package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {
    private ArrayList<Character> characters;
    private double averageLevel;

    public MainWindow(ArrayList<Character> characters, double averageLevel) {
        this.characters = characters;
        this.averageLevel = averageLevel;

        setTitle("Character Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel daftar karakter (bukan tabel)
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        listPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        if (characters != null) {
            for (Character c : characters) {
                JLabel itemLabel = new JLabel(
                        "• " + c.getName() + " — " + c.getType() + " (Lv. " + c.getLevel() + ")"
                );
                itemLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
                itemLabel.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 0));
                listPanel.add(itemLabel);
            }
        }

        JScrollPane scrollPane = new JScrollPane(listPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Ringkasan di bawah
        int totalCount = (characters != null) ? characters.size() : 0;
        JLabel infoLabel = new JLabel(
                "Total Karakter: " + totalCount + " | Rata-rata Level: " + String.format("%.2f", averageLevel),
                SwingConstants.CENTER
        );
        infoLabel.setBorder(BorderFactory.createEmptyBorder(8, 10, 12, 10));
        add(infoLabel, BorderLayout.SOUTH);
    }
}