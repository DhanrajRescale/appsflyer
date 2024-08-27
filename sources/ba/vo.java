package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.DisplayView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class vo extends m4.m {
    public final TextView A;
    public final Toolbar B;
    public final DisplayView C;

    /* renamed from: s, reason: collision with root package name */
    public final DisplayView f6454s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6455t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6456u;

    /* renamed from: v, reason: collision with root package name */
    public final DisplayView f6457v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f6458w;

    /* renamed from: x, reason: collision with root package name */
    public final DisplayView f6459x;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialButton f6460y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f6461z;

    public vo(Object obj, View view, DisplayView displayView, TextView textView, TextView textView2, DisplayView displayView2, ProgressBar progressBar, DisplayView displayView3, MaterialButton materialButton, ImageView imageView, TextView textView3, Toolbar toolbar, DisplayView displayView4) {
        super(obj, view, 0);
        this.f6454s = displayView;
        this.f6455t = textView;
        this.f6456u = textView2;
        this.f6457v = displayView2;
        this.f6458w = progressBar;
        this.f6459x = displayView3;
        this.f6460y = materialButton;
        this.f6461z = imageView;
        this.A = textView3;
        this.B = toolbar;
        this.C = displayView4;
    }
}
