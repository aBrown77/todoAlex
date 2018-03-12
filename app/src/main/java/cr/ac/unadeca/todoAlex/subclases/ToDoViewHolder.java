package cr.ac.unadeca.todoAlex.subclases;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import cr.ac.unadeca.todoAlex.R;


public class ToDoViewHolder extends RecyclerView.ViewHolder{

    public HtmlTextView html;
    public ImageView borrar;
    public ToDoViewHolder(View itemView) {
        super(itemView);
        html = itemView.findViewById(R.id.html_text);
        borrar = itemView.findViewById(R.id.delete);
    }
}
