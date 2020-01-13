package nyandoro.kapadokia.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //initialize word arrayList

        ArrayList<Word> word = new ArrayList<Word>();

        //use the word object to input our elements
        word.add(new Word("lutti","one", R.drawable.number_one));
        word.add(new Word("otiiko","two", R.drawable.number_two));
        word.add(new Word("tolookosu","three",R.drawable.number_three));
        word.add(new Word("oyyisa","four",R.drawable.number_four));
        word.add(new Word("massokka","five",R.drawable.number_five));
        word.add(new Word("temmokka","six",R.drawable.number_six));
        word.add(new Word("kenekaku","seven",R.drawable.number_seven));
        word.add(new Word("kawinta","eight",R.drawable.number_eight));
        word.add(new Word("wo’e","nine",R.drawable.number_nine));
        word.add(new Word("na’aacha","ten",R.drawable.number_ten));



        //adding an array adapter
        WordAdapter adapter = new WordAdapter(this, word, R.color.category_numbers);
        ListView listView = findViewById(R.id.lists);
        listView.setAdapter(adapter);


        //adding list colors
        LinearLayout horizontal_layout  = findViewById(R.id.horizontal_list);

    }
}
