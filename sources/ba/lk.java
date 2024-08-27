package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;

/* loaded from: classes.dex */
public abstract class lk extends m4.m {
    public final Toolbar A;
    public final LinearLayout B;
    public MissionsHomeViewModel C;

    /* renamed from: s, reason: collision with root package name */
    public final d6 f5361s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposeView f5362t;

    /* renamed from: u, reason: collision with root package name */
    public final ComposeView f5363u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5364v;

    /* renamed from: w, reason: collision with root package name */
    public final ns f5365w;

    /* renamed from: x, reason: collision with root package name */
    public final kt f5366x;

    /* renamed from: y, reason: collision with root package name */
    public final ProgressBar f5367y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5368z;

    public lk(Object obj, View view, d6 d6Var, ComposeView composeView, ComposeView composeView2, TextView textView, ns nsVar, kt ktVar, ProgressBar progressBar, TextView textView2, Toolbar toolbar, LinearLayout linearLayout) {
        super(obj, view, 4);
        this.f5361s = d6Var;
        this.f5362t = composeView;
        this.f5363u = composeView2;
        this.f5364v = textView;
        this.f5365w = nsVar;
        this.f5366x = ktVar;
        this.f5367y = progressBar;
        this.f5368z = textView2;
        this.A = toolbar;
        this.B = linearLayout;
    }
}
