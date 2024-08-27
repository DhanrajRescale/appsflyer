package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.ui.payments.filter.WithdrawalPinDialog;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class yl extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6747s;

    /* renamed from: t, reason: collision with root package name */
    public final WithdrawalPinDialog f6748t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6749u;

    /* renamed from: v, reason: collision with root package name */
    public final PinView f6750v;

    public yl(Object obj, View view, MaterialButton materialButton, WithdrawalPinDialog withdrawalPinDialog, TextView textView, PinView pinView) {
        super(obj, view, 0);
        this.f6747s = materialButton;
        this.f6748t = withdrawalPinDialog;
        this.f6749u = textView;
        this.f6750v = pinView;
    }
}
