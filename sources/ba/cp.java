package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class cp extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4398s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4399t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f4400u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayoutCompat f4401v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4402w;

    /* renamed from: x, reason: collision with root package name */
    public SubscriptionDowngradePromptViewModel f4403x;

    public cp(Object obj, View view, MaterialButton materialButton, TextView textView, MaterialButton materialButton2, LinearLayoutCompat linearLayoutCompat, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4398s = materialButton;
        this.f4399t = textView;
        this.f4400u = materialButton2;
        this.f4401v = linearLayoutCompat;
        this.f4402w = toolbar;
    }
}
