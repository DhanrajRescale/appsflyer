package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainItemViewModel;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class bb extends m4.m {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4275y = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4276s;

    /* renamed from: t, reason: collision with root package name */
    public final StockChangeInfoView f4277t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4278u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4279v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4280w;

    /* renamed from: x, reason: collision with root package name */
    public OptionChainItemViewModel f4281x;

    public bb(Object obj, View view, TextView textView, StockChangeInfoView stockChangeInfoView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, 1);
        this.f4276s = textView;
        this.f4277t = stockChangeInfoView;
        this.f4278u = textView2;
        this.f4279v = textView3;
        this.f4280w = textView4;
    }
}
