package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class x5 extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f6608v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6609s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6610t;

    /* renamed from: u, reason: collision with root package name */
    public WithdrawPreCheckData f6611u;

    public x5(View view, TextView textView, MaterialButton materialButton, Object obj) {
        super(obj, view, 0);
        this.f6609s = materialButton;
        this.f6610t = textView;
    }
}
