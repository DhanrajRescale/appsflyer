package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class kp extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5279s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5280t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f5281u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayoutCompat f5282v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5283w;

    /* renamed from: x, reason: collision with root package name */
    public SubscriptionPurchaseStatusViewModel f5284x;

    public kp(Object obj, View view, MaterialButton materialButton, TextView textView, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, Toolbar toolbar) {
        super(obj, view, 3);
        this.f5279s = materialButton;
        this.f5280t = textView;
        this.f5281u = constraintLayout;
        this.f5282v = linearLayoutCompat;
        this.f5283w = toolbar;
    }
}
