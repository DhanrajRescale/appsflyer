package d7;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import k7.y1;

/* loaded from: classes.dex */
public final class q extends y1 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f14099y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f14100u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f14101v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f14102w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f14103x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, View view) {
        super(view);
        this.f14103x = xVar;
        int i10 = 1;
        if (e5.x.f15050a < 26) {
            view.setFocusable(true);
        }
        this.f14100u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f14101v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f14102w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new j(this, i10));
    }
}
