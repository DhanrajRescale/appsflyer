package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.widget.ConstraintLayoutWithGreyscaleDisableSupport;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public abstract class v9 extends m4.m {
    public static final /* synthetic */ int Q = 0;
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final Chip E;
    public final TextView F;
    public final View G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ConstraintLayout M;
    public final ImageView N;
    public rc.e O;
    public ArenaGame P;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayoutWithGreyscaleDisableSupport f6404s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayoutCompat f6405t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6406u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6407v;

    /* renamed from: w, reason: collision with root package name */
    public final Chip f6408w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6409x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f6410y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f6411z;

    public v9(Object obj, View view, ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout, TextView textView, Chip chip, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, Chip chip2, TextView textView6, View view2, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, ConstraintLayout constraintLayout2, ImageView imageView2) {
        super(obj, view, 0);
        this.f6404s = constraintLayoutWithGreyscaleDisableSupport;
        this.f6405t = linearLayoutCompat;
        this.f6406u = constraintLayout;
        this.f6407v = textView;
        this.f6408w = chip;
        this.f6409x = textView2;
        this.f6410y = linearLayout;
        this.f6411z = linearLayout2;
        this.A = imageView;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = chip2;
        this.F = textView6;
        this.G = view2;
        this.H = textView7;
        this.I = textView8;
        this.J = textView9;
        this.K = textView10;
        this.L = textView11;
        this.M = constraintLayout2;
        this.N = imageView2;
    }
}
