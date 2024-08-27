package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class t6 extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6158x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6159s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6160t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6161u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f6162v;

    /* renamed from: w, reason: collision with root package name */
    public WalletCta f6163w;

    public t6(Object obj, View view, MaterialButton materialButton, ImageView imageView, TextView textView, LinearLayout linearLayout) {
        super(obj, view, 0);
        this.f6159s = materialButton;
        this.f6160t = imageView;
        this.f6161u = textView;
        this.f6162v = linearLayout;
    }
}
