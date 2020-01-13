package nyandoro.kapadokia.miwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorAdapter ;
    //default constructor for our WordAdapter class
    public WordAdapter(Context context, ArrayList<Word> wordList,int adapter_color ){

        //here we initialize the array adapter's internal storage for the context and the list.
        //The second argument is used when an array adapter is populating a single TextView,
        //because this is a custom adapter for two TextViews and ImageView, the adapter is not
        //going to use this second argument, thus it has no value, hence we use zero
        super(context,0,wordList);
        mColorAdapter = adapter_color;
    }
    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        //get objects located at this position in te list
        Word currentWord = getItem(position);
        //find the Textview in the listItem.xml layout
        TextView textViewEnglish = listItemView.findViewById(R.id.miwork);
        textViewEnglish.setText(currentWord.getMiworkTranslation());


        //find the Textview in the listItem.xml layout
        TextView textViewMiwork = listItemView.findViewById(R.id.english);
        textViewMiwork.setText(currentWord.getdefaultTranslation());


        ImageView imageView = listItemView.findViewById(R.id.list_image);

        if (currentWord.hasImage()) {

//            here we get the resource id from the adapter
            // ten setting the id to the ImageView id

            imageView.setImageResource(currentWord.getImageResourceId());



        } else {
           imageView.setVisibility(View.GONE);

        }

        //setting the theme colo for the list
        View itemTextView = listItemView.findViewById(R.id.vertical_list);

        //find the color tat resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorAdapter);

        //set the background color of the text container View
        itemTextView.setBackgroundColor(color);

        return listItemView;

    }
}
