package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class q7 extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5836w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final StockChangeInfoView f5837s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5838t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5839u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5840v;

    public q7(Object obj, View view, StockChangeInfoView stockChangeInfoView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.f5837s = stockChangeInfoView;
        this.f5838t = imageView;
        this.f5839u = textView;
        this.f5840v = textView2;
    }
}
