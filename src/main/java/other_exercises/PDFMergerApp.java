package other_exercises;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PDFMergerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PDFMergerApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("PDF Merger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Datei-Liste zur Anzeige und Sortierung
        DefaultListModel<File> fileListModel = new DefaultListModel<>();
        JList<File> fileList = new JList<>(fileListModel);
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(fileList);

        // Buttons für Aktionen
        JButton addButton = new JButton("Dateien hinzufügen");
        JButton removeButton = new JButton("Ausgewählte entfernen");
        JButton moveUpButton = new JButton("Nach oben");
        JButton moveDownButton = new JButton("Nach unten");
        JButton mergeButton = new JButton("PDFs zusammenfügen");

        // Panel für Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 5, 5));
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(moveUpButton);
        buttonPanel.add(moveDownButton);
        buttonPanel.add(mergeButton);

        // Event: Dateien hinzufügen
        addButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setMultiSelectionEnabled(true);
            fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.isDirectory() || f.getName().toLowerCase().endsWith(".pdf");
                }

                @Override
                public String getDescription() {
                    return "PDF-Dateien (*.pdf)";
                }
            });

            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                for (File file : fileChooser.getSelectedFiles()) {
                    fileListModel.addElement(file);
                }
            }
        });

        // Event: Ausgewählte Datei entfernen
        removeButton.addActionListener(e -> {
            int selectedIndex = fileList.getSelectedIndex();
            if (selectedIndex != -1) {
                fileListModel.remove(selectedIndex);
            }
        });

        // Event: Datei nach oben verschieben
        moveUpButton.addActionListener(e -> {
            int selectedIndex = fileList.getSelectedIndex();
            if (selectedIndex > 0) {
                File file = fileListModel.remove(selectedIndex);
                fileListModel.add(selectedIndex - 1, file);
                fileList.setSelectedIndex(selectedIndex - 1);
            }
        });

        // Event: Datei nach unten verschieben
        moveDownButton.addActionListener(e -> {
            int selectedIndex = fileList.getSelectedIndex();
            if (selectedIndex < fileListModel.getSize() - 1 && selectedIndex != -1) {
                File file = fileListModel.remove(selectedIndex);
                fileListModel.add(selectedIndex + 1, file);
                fileList.setSelectedIndex(selectedIndex + 1);
            }
        });

        // Event: PDFs zusammenfügen
        mergeButton.addActionListener(e -> {
            if (fileListModel.getSize() < 2) {
                JOptionPane.showMessageDialog(frame, "Bitte füge mindestens zwei PDF-Dateien hinzu.");
                return;
            }

            JFileChooser saveChooser = new JFileChooser();
            saveChooser.setDialogTitle("Wähle den Speicherort für die zusammengefügte PDF");
            saveChooser.setSelectedFile(new File("merged.pdf"));

            int saveResult = saveChooser.showSaveDialog(frame);
            if (saveResult == JFileChooser.APPROVE_OPTION) {
                File saveFile = saveChooser.getSelectedFile();
                try {
                    mergePDFs(Collections.list(fileListModel.elements()), saveFile);
                    JOptionPane.showMessageDialog(frame, "PDFs erfolgreich zusammengefügt!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Fehler beim Zusammenfügen: " + ex.getMessage());
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.EAST);
        frame.setVisible(true);
    }

    /**
     * Führt mehrere PDFs zu einer einzigen Datei zusammen.
     *
     * @param inputFiles Liste der PDF-Dateien in der gewünschten Reihenfolge
     * @param outputFile Zieldatei für die zusammengefügte PDF
     * @throws IOException falls ein Fehler beim Zusammenfügen auftritt
     */
    private void mergePDFs(ArrayList<File> inputFiles, File outputFile) throws IOException {
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        pdfMerger.setDestinationFileName(outputFile.getAbsolutePath());

        for (File file : inputFiles) {
            pdfMerger.addSource(file);
        }

        pdfMerger.mergeDocuments(null);
    }
}