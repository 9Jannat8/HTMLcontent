package com.example.htmlcontent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class HtmlWithTextView extends AppCompatActivity {

    private TextView textView;
    String text = "<h1>This is heading 1</h1>\n" +
            "<h2>This is heading 2</h1>\n" +
            "<h3>This is heading 3</h1>\n" +
            "<h4>This is heading 4</h1>\n" +
            "<h5>This is heading 5</h1>\n" +

            "<p>This is paragraph</p>\n" +
            "<p> <u>This is an underline </u> </p>\n" +
            "<p> <b>This is a bold </b> </p>\n" +
            "<p> <i>This is a italic </i> </p>\n" +
            "Programming language ordered list\n" +
            "<ol>\n" +
            "<li> C </li>\n" +
            "<li> C++ </li>\n" +
            "<li> Java </li>\n" +
            "</ol>\n\n" +
            "(a+b)<sup>2</sup> = a<sup>2</sup> + 2ab + b<sup>2</sup> \n" +
            "<p> H<sub>2</sub>O </p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_with_text_view);//

        textView = findViewById(R.id.textViewId);
        textView.setText(Html.fromHtml(text));
    }
}