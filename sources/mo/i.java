package mo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class i extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, LayoutInflater layoutInflater, RecyclerView recyclerView) {
        super(layoutInflater.inflate(R.layout.design_navigation_item_separator, (ViewGroup) recyclerView, false));
        if (i10 != 2) {
        } else {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, (ViewGroup) recyclerView, false));
        }
    }
}
