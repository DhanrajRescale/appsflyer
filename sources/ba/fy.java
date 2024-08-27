package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class fy extends m4.m {
    public static final /* synthetic */ int F = 0;
    public final ImageView A;
    public final TextView B;
    public final Group C;
    public final TabLayout D;
    public RiaProfileResponseDto.TradeViewsPerformance E;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4764s;

    /* renamed from: t, reason: collision with root package name */
    public final CircularProgressIndicator f4765t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4766u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4767v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4768w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4769x;

    /* renamed from: y, reason: collision with root package name */
    public final Group f4770y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4771z;

    public fy(Object obj, View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, TextView textView, TextView textView2, TextView textView3, TextView textView4, Group group, TextView textView5, ImageView imageView2, TextView textView6, Group group2, TabLayout tabLayout) {
        super(obj, view, 0);
        this.f4764s = imageView;
        this.f4765t = circularProgressIndicator;
        this.f4766u = textView;
        this.f4767v = textView2;
        this.f4768w = textView3;
        this.f4769x = textView4;
        this.f4770y = group;
        this.f4771z = textView5;
        this.A = imageView2;
        this.B = textView6;
        this.C = group2;
        this.D = tabLayout;
    }
}
