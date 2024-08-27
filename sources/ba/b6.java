package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class b6 extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4257v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4258s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4259t;

    /* renamed from: u, reason: collision with root package name */
    public WithdrawPreCheckData f4260u;

    public b6(View view, TextView textView, MaterialButton materialButton, Object obj) {
        super(obj, view, 0);
        this.f4258s = materialButton;
        this.f4259t = textView;
    }
}
