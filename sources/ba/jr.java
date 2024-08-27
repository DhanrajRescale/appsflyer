package ba;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class jr extends m4.m {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final ComposeView C;
    public final RecyclerView D;

    /* renamed from: s, reason: collision with root package name */
    public final ImageButton f5169s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposeView f5170t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5171u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f5172v;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f5173w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f5174x;

    /* renamed from: y, reason: collision with root package name */
    public final ev f5175y;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f5176z;

    public jr(Object obj, View view, ImageButton imageButton, ComposeView composeView, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout, LinearLayout linearLayout2, ev evVar, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, ComposeView composeView2, RecyclerView recyclerView2) {
        super(obj, view, 1);
        this.f5169s = imageButton;
        this.f5170t = composeView;
        this.f5171u = textView;
        this.f5172v = linearLayout;
        this.f5173w = relativeLayout;
        this.f5174x = linearLayout2;
        this.f5175y = evVar;
        this.f5176z = constraintLayout;
        this.A = relativeLayout2;
        this.B = recyclerView;
        this.C = composeView2;
        this.D = recyclerView2;
    }
}
