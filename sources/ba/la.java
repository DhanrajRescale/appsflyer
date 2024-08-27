package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;

/* loaded from: classes.dex */
public abstract class la extends m4.m {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public final TextView D;
    public Portfolio E;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5334s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5335t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5336u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5337v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5338w;

    /* renamed from: x, reason: collision with root package name */
    public final LottieAnimationView f5339x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5340y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5341z;

    public la(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, LottieAnimationView lottieAnimationView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout, TextView textView8) {
        super(obj, view, 0);
        this.f5334s = constraintLayout;
        this.f5335t = textView;
        this.f5336u = textView2;
        this.f5337v = textView3;
        this.f5338w = imageView;
        this.f5339x = lottieAnimationView;
        this.f5340y = textView4;
        this.f5341z = textView5;
        this.A = textView6;
        this.B = textView7;
        this.C = linearLayout;
        this.D = textView8;
    }
}
