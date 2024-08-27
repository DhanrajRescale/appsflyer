package ba;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class x4 extends m4.m {
    public final xv A;
    public final CheckBox B;
    public final NestedScrollView C;
    public final TextView D;
    public WithdrawalDetailViewModel E;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6600s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f6601t;

    /* renamed from: u, reason: collision with root package name */
    public final CoordinatorLayout f6602u;

    /* renamed from: v, reason: collision with root package name */
    public final CardView f6603v;

    /* renamed from: w, reason: collision with root package name */
    public final hw f6604w;

    /* renamed from: x, reason: collision with root package name */
    public final jw f6605x;

    /* renamed from: y, reason: collision with root package name */
    public final lw f6606y;

    /* renamed from: z, reason: collision with root package name */
    public final Toolbar f6607z;

    public x4(Object obj, View view, MaterialButton materialButton, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout, CardView cardView, hw hwVar, jw jwVar, lw lwVar, Toolbar toolbar, xv xvVar, CheckBox checkBox, NestedScrollView nestedScrollView, TextView textView) {
        super(obj, view, 5);
        this.f6600s = materialButton;
        this.f6601t = linearLayout;
        this.f6602u = coordinatorLayout;
        this.f6603v = cardView;
        this.f6604w = hwVar;
        this.f6605x = jwVar;
        this.f6606y = lwVar;
        this.f6607z = toolbar;
        this.A = xvVar;
        this.B = checkBox;
        this.C = nestedScrollView;
        this.D = textView;
    }
}
