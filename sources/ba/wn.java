package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.DisplayView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class wn extends m4.m {
    public final TextView A;
    public final Toolbar B;
    public final DisplayView C;

    /* renamed from: s, reason: collision with root package name */
    public final DisplayView f6552s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6553t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6554u;

    /* renamed from: v, reason: collision with root package name */
    public final DisplayView f6555v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f6556w;

    /* renamed from: x, reason: collision with root package name */
    public final DisplayView f6557x;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialButton f6558y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f6559z;

    public wn(Object obj, View view, DisplayView displayView, TextView textView, TextView textView2, DisplayView displayView2, ProgressBar progressBar, DisplayView displayView3, MaterialButton materialButton, ImageView imageView, TextView textView3, Toolbar toolbar, DisplayView displayView4) {
        super(obj, view, 0);
        this.f6552s = displayView;
        this.f6553t = textView;
        this.f6554u = textView2;
        this.f6555v = displayView2;
        this.f6556w = progressBar;
        this.f6557x = displayView3;
        this.f6558y = materialButton;
        this.f6559z = imageView;
        this.A = textView3;
        this.B = toolbar;
        this.C = displayView4;
    }
}
