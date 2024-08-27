package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import me.relex.circleindicator.CircleIndicator2;

/* loaded from: classes.dex */
public abstract class h7 extends m4.m {
    public static final /* synthetic */ int G = 0;
    public oc.d A;
    public oc.e B;
    public oc.c C;
    public oc.k D;
    public ArenaSection E;
    public int F;

    /* renamed from: s, reason: collision with root package name */
    public final CircleIndicator2 f4901s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f4902t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4903u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f4904v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4905w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4906x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f4907y;

    /* renamed from: z, reason: collision with root package name */
    public final PrepZoneWhatsNewWidget f4908z;

    public h7(Object obj, View view, CircleIndicator2 circleIndicator2, RecyclerView recyclerView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, PrepZoneWhatsNewWidget prepZoneWhatsNewWidget) {
        super(obj, view, 0);
        this.f4901s = circleIndicator2;
        this.f4902t = recyclerView;
        this.f4903u = imageView;
        this.f4904v = constraintLayout;
        this.f4905w = textView;
        this.f4906x = textView2;
        this.f4907y = textView3;
        this.f4908z = prepZoneWhatsNewWidget;
    }

    public abstract void r(int i10);

    public abstract void s(ArenaSection arenaSection);
}
