package nyandoro.kapadokia.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        //initialize word arrayList

        ArrayList<Word> word = new ArrayList<Word>();

        //use the word object to input our elements
        word.add(new Word("weṭeṭṭi","red", R.drawable.color_red));
        word.add(new Word("chokokki","green", R.drawable.color_green));
        word.add(new Word("ṭakaakki","brown", R.drawable.color_brown));
        word.add(new Word("ṭopoppi","gray", R.drawable.color_gray));
        word.add(new Word("kululli","black", R.drawable.color_black));
        word.add(new Word("kelelli","white", R.drawable.color_white));
        word.add(new Word("ṭopiisә","dusty yellow", R.drawable.color_dusty_yellow));
        word.add(new Word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow));


        //adding an array adapter
        WordAdapter adapter = new WordAdapter(this, word, R.color.category_colors);
        ListView listView = findViewById(R.id.lists);
        listView.setAdapter(adapter);

    }
}
