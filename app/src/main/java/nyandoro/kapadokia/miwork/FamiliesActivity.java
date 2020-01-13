package nyandoro.kapadokia.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_families);

        //initialize word arrayList

        ArrayList<Word> word = new ArrayList<Word>();

        //use the word object to input our elements
        word.add(new Word("әpә","father", R.drawable.family_father));
        word.add(new Word("әṭa","mother", R.drawable.family_mother));
        word.add(new Word("angsi","son", R.drawable.family_son));
        word.add(new Word("tune","daughter",R.drawable.family_daughter));
        word.add(new Word("taachi","older brother", R.drawable.family_older_brother));
        word.add(new Word("chalitti","younger brother", R.drawable.family_younger_brother));
        word.add(new Word("teṭe","older sister",R.drawable.family_older_sister));
        word.add(new Word("kolliti","younger sister", R.drawable.family_younger_sister));
        word.add(new Word("ama","grandmother ", R.drawable.family_grandmother));
        word.add(new Word("paapa","grandfather",R.drawable.family_grandfather));



        //adding an array adapter
        WordAdapter adapter = new WordAdapter(this, word,R.color.category_family);
        ListView listView = findViewById(R.id.lists);
        listView.setAdapter(adapter);

    }
}
