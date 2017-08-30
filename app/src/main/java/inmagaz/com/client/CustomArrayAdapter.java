package inmagaz.com.client;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomArrayAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private ArrayList list;
    private ArrayList list2;
    private ArrayList list3;
    public CustomArrayAdapter(Context context,ArrayList list,ArrayList list2,ArrayList list3) {
        this.list = list;
        this.list2 = list2;
        this.list3 = list3;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View v = convertView;
        if ( v == null){
            holder = new ViewHolder();
            v = inflater.inflate(R.layout.you_layout_with_two_text_view, parent, false);
            holder.imageView = (ImageView) v.findViewById(R.id.imageView11);
            holder.textView = (TextView) v.findViewById(R.id.textView23);
            holder.textView2 = (TextView) v.findViewById(R.id.textView24);
            holder.textView3 = (TextView) v.findViewById(R.id.textView25);
            v.setTag(holder);
        }
        holder = (ViewHolder) v.getTag();

        holder.imageView.setImageResource(R.drawable.photo);
        holder.textView.setText(list.get(position).toString());
        holder.textView2.setText(list2.get(position).toString());
        holder.textView3.setText(list3.get(position).toString());

        return v;

    }
    private static class ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
    }

}