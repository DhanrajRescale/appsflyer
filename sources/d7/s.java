package d7;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import k7.y1;

/* loaded from: classes.dex */
public final class s extends y1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f14110u;

    /* renamed from: v, reason: collision with root package name */
    public final View f14111v;

    public s(View view) {
        super(view);
        if (e5.x.f15050a < 26) {
            view.setFocusable(true);
        }
        this.f14110u = (TextView) view.findViewById(R.id.exo_text);
        this.f14111v = view.findViewById(R.id.exo_check);
    }
}
