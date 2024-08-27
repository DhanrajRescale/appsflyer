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
public abstract class m7 extends m4.m {
    public static final /* synthetic */ int G = 0;
    public final PrepZoneWhatsNewWidget A;
    public String B;
    public rc.i C;
    public rc.d D;
    public rc.e E;
    public ArenaSection F;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5439s;

    /* renamed from: t, reason: collision with root package name */
    public final CircleIndicator2 f5440t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5441u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f5442v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5443w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f5444x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f5445y;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f5446z;

    public m7(Object obj, View view, TextView textView, CircleIndicator2 circleIndicator2, ImageView imageView, RecyclerView recyclerView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, PrepZoneWhatsNewWidget prepZoneWhatsNewWidget) {
        super(obj, view, 0);
        this.f5439s = textView;
        this.f5440t = circleIndicator2;
        this.f5441u = imageView;
        this.f5442v = recyclerView;
        this.f5443w = textView2;
        this.f5444x = textView3;
        this.f5445y = constraintLayout;
        this.f5446z = constraintLayout2;
        this.A = prepZoneWhatsNewWidget;
    }

    public abstract void r(ArenaSection arenaSection);
}
