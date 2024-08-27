package ba;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class to extends m4.m {
    public final MarketAssetToolbarView A;
    public final Toolbar B;

    /* renamed from: s, reason: collision with root package name */
    public final CardView f6212s;

    /* renamed from: t, reason: collision with root package name */
    public final InputView f6213t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6214u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6215v;

    /* renamed from: w, reason: collision with root package name */
    public final PriceInputView f6216w;

    /* renamed from: x, reason: collision with root package name */
    public final ProgressBar f6217x;

    /* renamed from: y, reason: collision with root package name */
    public final InputView f6218y;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f6219z;

    public to(Object obj, View view, CardView cardView, InputView inputView, TextView textView, TextView textView2, PriceInputView priceInputView, ProgressBar progressBar, InputView inputView2, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6212s = cardView;
        this.f6213t = inputView;
        this.f6214u = textView;
        this.f6215v = textView2;
        this.f6216w = priceInputView;
        this.f6217x = progressBar;
        this.f6218y = inputView2;
        this.f6219z = materialButton;
        this.A = marketAssetToolbarView;
        this.B = toolbar;
    }
}
