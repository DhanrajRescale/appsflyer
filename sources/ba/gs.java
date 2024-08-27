package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.StockChangeInfoBoldView;

/* loaded from: classes.dex */
public abstract class gs extends m4.m {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4858y = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4859s;

    /* renamed from: t, reason: collision with root package name */
    public final StockChangeInfoBoldView f4860t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4861u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4862v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4863w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f4864x;

    public gs(Object obj, View view, TextView textView, StockChangeInfoBoldView stockChangeInfoBoldView, ImageView imageView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f4859s = textView;
        this.f4860t = stockChangeInfoBoldView;
        this.f4861u = imageView;
        this.f4862v = textView2;
        this.f4863w = textView3;
        this.f4864x = constraintLayout;
    }
}
