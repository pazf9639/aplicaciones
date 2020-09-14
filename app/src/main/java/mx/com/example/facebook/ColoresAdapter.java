package mx.com.example.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ColoresAdapter extends RecyclerView.Adapter<ColoresAdapter.ViewHolder> {
private List<Color> colores;
private Context context;

    public ColoresAdapter(List<Color> colores) {
        this.colores = colores;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_colores,parent,false);
        context=parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Color color=colores.get(position);
        holder.lblNombre.setText(color.getNombre());
        holder.lblApellidos.setText(color.getApellido());
        holder.lblDescrip.setText(color.getDescripcion());

    }

    @Override
    public int getItemCount() {
      return colores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView lblNombre;
        private TextView lblApellidos;
        private TextView lblDescrip;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblNombre=itemView.findViewById(R.id.lblNombre);
            lblApellidos=itemView.findViewById(R.id.lblApellido);
            lblDescrip=itemView.findViewById(R.id.lblDescrip);
            this.view=itemView;
        }
    }
}
