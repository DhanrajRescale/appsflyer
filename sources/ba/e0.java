package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.ChatToolbar;

/* loaded from: classes.dex */
public abstract class e0 extends m4.m {
    public final Toolbar A;

    /* renamed from: s, reason: collision with root package name */
    public final ChatToolbar f4549s;

    /* renamed from: t, reason: collision with root package name */
    public final View f4550t;

    /* renamed from: u, reason: collision with root package name */
    public final ComposeView f4551u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f4552v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4553w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f4554x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f4555y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4556z;

    public e0(Object obj, View view, ChatToolbar chatToolbar, View view2, ComposeView composeView, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView2, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4549s = chatToolbar;
        this.f4550t = view2;
        this.f4551u = composeView;
        this.f4552v = imageView;
        this.f4553w = textView;
        this.f4554x = constraintLayout;
        this.f4555y = imageView2;
        this.f4556z = textView2;
        this.A = toolbar;
    }
}
