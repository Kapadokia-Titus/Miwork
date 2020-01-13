package nyandoro.kapadokia.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

//initialize word arrayList

        ArrayList<Word> word = new ArrayList<Word>();

        //use the word object to input our elements
        word.add(new Word("minto wuksus","oneWhere are you going?"));
        word.add(new Word("tinnә oyaase'nә","What is your name?"));
        word.add(new Word("oyaaset...","My name is..."));
        word.add(new Word("michәksәs?","How are you feeling?"));
        word.add(new Word("kuchi achit","I’m feeling good."));
        word.add(new Word("әәnәs'aa?","Are you coming?"));
        word.add(new Word("hәә’ әәnәm","Yes, I’m coming."));
        word.add(new Word("әәnәm","I’m coming."));
        word.add(new Word("yoowutis","Let’s go."));
        word.add(new Word("әnni'nem","Come here."));



        //adding an array adapter
        WordAdapter adapter = new WordAdapter(this, word, R.color.category_phrases);
        ListView listView = findViewById(R.id.lists);
        listView.setAdapter(adapter);


    }
}
