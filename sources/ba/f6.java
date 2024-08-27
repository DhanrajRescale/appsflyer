package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class f6 extends m4.m {
    public final TextView A;
    public PaymentWithdrawalOTPVerifyViewModel B;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4670s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4671t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f4672u;

    /* renamed from: v, reason: collision with root package name */
    public final Group f4673v;

    /* renamed from: w, reason: collision with root package name */
    public final PinView f4674w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4675x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f4676y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4677z;

    public f6(Object obj, View view, MaterialButton materialButton, TextView textView, MaterialButton materialButton2, Group group, PinView pinView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, 5);
        this.f4670s = materialButton;
        this.f4671t = textView;
        this.f4672u = materialButton2;
        this.f4673v = group;
        this.f4674w = pinView;
        this.f4675x = textView2;
        this.f4676y = textView3;
        this.f4677z = textView4;
        this.A = textView5;
    }
}
