package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class vc extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6423x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6424s;

    /* renamed from: t, reason: collision with root package name */
    public final StockChangeInfoView f6425t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f6426u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6427v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6428w;

    public vc(Object obj, View view, TextView textView, StockChangeInfoView stockChangeInfoView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, 0);
        this.f6424s = textView;
        this.f6425t = stockChangeInfoView;
        this.f6426u = imageView;
        this.f6427v = textView2;
        this.f6428w = textView3;
    }
}
