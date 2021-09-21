package com.codembeded.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.File;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.download_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createPDF();
            }
        });

    }

    private void createPDF() {
        String pdfPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString();
        File file = new File(pdfPath, "Codembeded" + ".pdf");


        PdfWriter writer = null;
        try {
            writer = new PdfWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);


        float[] columnWidth = {280, 130, 150};
        Table table = new Table(columnWidth);

        table.addCell(new Cell().add(new Paragraph("Software House").setTextAlignment(TextAlignment.LEFT)
                .setVerticalAlignment(VerticalAlignment.MIDDLE)
                .setFontSize(24).setBold()).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("Invoice to:").setTextAlignment(TextAlignment.RIGHT).setFontSize(14)).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("Haris Rasheed \n 123 Garden Lake \n City State")
                .setTextAlignment(TextAlignment.LEFT)
                .setFontSize(14)).setBorder(Border.NO_BORDER));

//        table.addCell(new Cell().add(new Paragraph("Haris Rasheed").setFontSize(14)).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph(" 123 Garden Lake")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));

        float[] columnWidth_1 = {60, 50, 50, 100, 100, 149};
        Table table1 = new Table(columnWidth_1);
        table1.addCell(new Cell().add(new Paragraph("Reciept #").setFontSize(12)).setBorder(Border.NO_BORDER));
        table1.addCell(new Cell().add(new Paragraph("1234").setFontSize(12)).setBorder(Border.NO_BORDER));
        table1.addCell(new Cell().add(new Paragraph("9,Aug,2021").setFontSize(12)).setBorder(Border.NO_BORDER));
//        table1.addCell(new Cell().add(new Paragraph(" ").setFontSize(12)).setBorder(Border.NO_BORDER));
//        table1.addCell(new Cell().add(new Paragraph(" ").setFontSize(12)).setBorder(Border.NO_BORDER));
//        table1.addCell(new Cell().add(new Paragraph("City State").setFontSize(12)).setBorder(Border.NO_BORDER));


//        SolidLine line = new SolidLine(1f);
//        LineSeparator ls = new LineSeparator(line);
//        ls.setMarginTop(5);


        float[] columnWidth_3 = {38, 130, 130, 130, 130};
        Table table3 = new Table(columnWidth_3).setBackgroundColor(ColorConstants.YELLOW).setBorder(Border.NO_BORDER);

        table3.addCell(new Cell().add(new Paragraph("#")).setBorder(Border.NO_BORDER));
        table3.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table3.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table3.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table3.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));


        float[] columnWidth_2 = {38, 130, 130, 130, 130};
        Table table2 = new Table(columnWidth_2);
        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("2")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("2")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("2")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("2")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("3")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("1")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));

        table2.addCell(new Cell().add(new Paragraph("2")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Credit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Debit")).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Person Balance")).setBorder(Border.NO_BORDER));



        float[] columnWidth_4 = {559};
        Table table4 = new Table(columnWidth_4).setBackgroundColor(ColorConstants.YELLOW);

        table4.addCell(new Cell().add(new Paragraph("Balance nmbhbhjbj")
                .setTextAlignment(TextAlignment.RIGHT)
                .setMarginRight(20f)
                .setFontSize(20)).setBorder(Border.NO_BORDER));




        float[] columnWidth_5 = {199, 180, 180};
        Table table5 = new Table(columnWidth_5).setBorder(Border.NO_BORDER);

        PageSize ps = pdfDocument.getDefaultPageSize();

        table5.setFixedPosition(document.getLeftMargin(), document.getBottomMargin(), ps.getWidth() - document.getLeftMargin() - document.getRightMargin());

        table5.addCell(new Cell().add(new Paragraph("Payment Method")
                .setMarginTop(60f)
                .setFontSize(18)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Terms & Condition")
                .setMarginTop(60f)
                .setFontSize(18)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Additional Notes")
                .setTextAlignment(TextAlignment.RIGHT)
                .setMarginTop(60f)
                .setFontSize(18)).setBorder(Border.NO_BORDER));

        table5.addCell(new Cell().add(new Paragraph("Cash/Debit").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Terms & Condition").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Additional Notes").setTextAlignment(TextAlignment.CENTER)
                .setFontSize(12)).setBorder(Border.NO_BORDER));

        table5.addCell(new Cell().add(new Paragraph("Cheque").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Terms & Condition").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Additional Notes").setTextAlignment(TextAlignment.CENTER)
                .setFontSize(12)).setBorder(Border.NO_BORDER));

        table5.addCell(new Cell().add(new Paragraph("Credit card").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Terms & Condition").setFontSize(12)).setBorder(Border.NO_BORDER));
        table5.addCell(new Cell().add(new Paragraph("Additional Notes").setTextAlignment(TextAlignment.CENTER)
                .setFontSize(12)).setBorder(Border.NO_BORDER));


        SolidLine line = new SolidLine(3f);
        line.setColor(ColorConstants.BLACK);
        LineSeparator ls = new LineSeparator(line);
        ls.setMarginTop(5);


        document.add(table);

        document.add(table1);
        document.add(new Paragraph("\n"));

        document.add(table3);
        document.add(new Paragraph("\n"));
        document.add(table2);
        document.add(new Paragraph("\n"));
        document.add(table4);
        document.add(new Paragraph("\n\n\n\n\n"));
        document.add(table5);
        document.close();

        Toast.makeText(this, "Pdf created to Downloads", Toast.LENGTH_SHORT).show();
    }

}