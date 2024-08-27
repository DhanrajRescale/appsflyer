package ba;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.assetgro.stockgro.widget.CrownImageView;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class f7 extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f4678x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final CardView f4679s;

    /* renamed from: t, reason: collision with root package name */
    public final CrownImageView f4680t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4681u;

    /* renamed from: v, reason: collision with root package name */
    public final StockChangeInfoView f4682v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f4683w;

    public f7(Object obj, View view, CardView cardView, CrownImageView crownImageView, TextView textView, StockChangeInfoView stockChangeInfoView, MaterialButton materialButton) {
        super(obj, view, 0);
        this.f4679s = cardView;
        this.f4680t = crownImageView;
        this.f4681u = textView;
        this.f4682v = stockChangeInfoView;
        this.f4683w = materialButton;
    }
}
