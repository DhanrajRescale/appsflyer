package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class f3 extends m4.m {
    public final CoordinatorLayout A;
    public final Toolbar B;
    public RechargeWalletViewModel C;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4658s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4659t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4660u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4661v;

    /* renamed from: w, reason: collision with root package name */
    public final InputView f4662w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4663x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f4664y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4665z;

    public f3(Object obj, View view, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, InputView inputView, TextView textView4, TextView textView5, TextView textView6, CoordinatorLayout coordinatorLayout, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4658s = materialButton;
        this.f4659t = textView;
        this.f4660u = textView2;
        this.f4661v = textView3;
        this.f4662w = inputView;
        this.f4663x = textView4;
        this.f4664y = textView5;
        this.f4665z = textView6;
        this.A = coordinatorLayout;
        this.B = toolbar;
    }
}
