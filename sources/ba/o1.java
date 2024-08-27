package ba;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.widget.ProgressBarWithCounter;
import com.assetgro.stockgro.widget.SwipeToJoinButton;

/* loaded from: classes.dex */
public abstract class o1 extends m4.m {
    public final NestedScrollView A;
    public final SwipeToJoinButton B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final RecyclerView E;
    public final ProgressBar F;
    public final TextView G;
    public final CheckBox H;
    public final TextView I;
    public final Toolbar J;

    /* renamed from: s, reason: collision with root package name */
    public final ca f5634s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposeView f5635t;

    /* renamed from: u, reason: collision with root package name */
    public final ComposeView f5636u;

    /* renamed from: v, reason: collision with root package name */
    public final ComposeView f5637v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBarWithCounter f5638w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f5639x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f5640y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f5641z;

    public o1(Object obj, View view, ca caVar, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ProgressBarWithCounter progressBarWithCounter, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, NestedScrollView nestedScrollView, SwipeToJoinButton swipeToJoinButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ProgressBar progressBar, TextView textView, CheckBox checkBox, TextView textView2, Toolbar toolbar) {
        super(obj, view, 1);
        this.f5634s = caVar;
        this.f5635t = composeView;
        this.f5636u = composeView2;
        this.f5637v = composeView3;
        this.f5638w = progressBarWithCounter;
        this.f5639x = linearLayout;
        this.f5640y = imageView;
        this.f5641z = linearLayout2;
        this.A = nestedScrollView;
        this.B = swipeToJoinButton;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = recyclerView;
        this.F = progressBar;
        this.G = textView;
        this.H = checkBox;
        this.I = textView2;
        this.J = toolbar;
    }
}
