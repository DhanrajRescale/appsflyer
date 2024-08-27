package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewSectionItemViewModel;

/* loaded from: classes.dex */
public abstract class dd extends m4.m {
    public static final /* synthetic */ int E = 0;
    public final ImageView A;
    public final TextView B;
    public final LinearLayout C;
    public StockOverviewSectionItemViewModel D;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4478s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4479t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4480u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f4481v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f4482w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4483x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f4484y;

    /* renamed from: z, reason: collision with root package name */
    public final SwitchCompat f4485z;

    public dd(Object obj, View view, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, ImageView imageView, TextView textView4, TextView textView5, SwitchCompat switchCompat, ImageView imageView2, TextView textView6, LinearLayout linearLayout2) {
        super(obj, view, 5);
        this.f4478s = textView;
        this.f4479t = textView2;
        this.f4480u = textView3;
        this.f4481v = linearLayout;
        this.f4482w = imageView;
        this.f4483x = textView4;
        this.f4484y = textView5;
        this.f4485z = switchCompat;
        this.A = imageView2;
        this.B = textView6;
        this.C = linearLayout2;
    }
}
