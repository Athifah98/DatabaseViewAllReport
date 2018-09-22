package com.example.user.databaseviewallreport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {
    private Context context;
    private ArrayList<UserModel2> userModelArrayList2;
    public CustomAdapter2(Context context, ArrayList<UserModel2> userModelArrayList2) {
        this.context = context;
        this.userModelArrayList2 = userModelArrayList2;
    }
    @Override
    public int getCount() {
        return userModelArrayList2.size();
    }
    @Override
    public Object getItem(int position) {
        return userModelArrayList2.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder2 holder2;
        if (convertView == null) {
            holder2 = new ViewHolder2();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_all_reports, null, true);

            holder2.tvjenisaduan = (TextView) convertView.findViewById(R.id.tvJenisAduan);
            holder2.tvnama = (TextView) convertView.findViewById(R.id.tvNama);
            holder2.tvalamat = (TextView) convertView.findViewById(R.id.tvAlamat);
            holder2.tvtelefon = (TextView) convertView.findViewById(R.id.tvTelefon);
            holder2.tvemel = (TextView) convertView.findViewById(R.id.tvEmel);
            holder2.tvtarikh = (TextView) convertView.findViewById(R.id.tvTarikh);
            holder2.tvaduan = (TextView) convertView.findViewById(R.id.tvAduan);

            convertView.setTag(holder2);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder2 = (ViewHolder2)convertView.getTag();
        }

        holder2.tvjenisaduan.setText("Jenis Aduan: "+userModelArrayList2.get(position).getJenisaduan2());
        holder2.tvnama.setText("Nama: "+userModelArrayList2.get(position).getNama());
        holder2.tvalamat.setText("Alamat: "+userModelArrayList2.get(position).getAlamat());
        holder2.tvtelefon.setText("Telefon: "+userModelArrayList2.get(position).getTelefon());
        holder2.tvemel.setText("Emel: "+userModelArrayList2.get(position).getEmel());
        holder2.tvtarikh.setText("Tarikh: "+userModelArrayList2.get(position).getTarikh());
        holder2.tvaduan.setText("Aduan: "+userModelArrayList2.get(position).getAduan());


        return convertView;
    }

    private class ViewHolder2 {
        protected TextView tvjenisaduan, tvnama, tvalamat, tvtelefon, tvemel, tvtarikh, tvaduan ;
    }

}



