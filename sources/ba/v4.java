package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class v4 extends m4.m {
    public WithdrawableLimitViewModel A;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6380s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposeView f6381t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6382u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f6383v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f6384w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f6385x;

    /* renamed from: y, reason: collision with root package name */
    public final ProgressBar f6386y;

    /* renamed from: z, reason: collision with root package name */
    public final Toolbar f6387z;

    public v4(Object obj, View view, MaterialButton materialButton, ComposeView composeView, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, Toolbar toolbar) {
        super(obj, view, 1);
        this.f6380s = materialButton;
        this.f6381t = composeView;
        this.f6382u = constraintLayout;
        this.f6383v = linearLayout;
        this.f6384w = linearLayout2;
        this.f6385x = linearLayout3;
        this.f6386y = progressBar;
        this.f6387z = toolbar;
    }
}
