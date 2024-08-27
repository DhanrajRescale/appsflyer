package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class dt extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialCardView f4519s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f4520t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4521u;

    /* renamed from: v, reason: collision with root package name */
    public final LottieAnimationView f4522v;

    /* renamed from: w, reason: collision with root package name */
    public String f4523w;

    public dt(Object obj, View view, MaterialCardView materialCardView, ConstraintLayout constraintLayout, TextView textView, LottieAnimationView lottieAnimationView) {
        super(obj, view, 0);
        this.f4519s = materialCardView;
        this.f4520t = constraintLayout;
        this.f4521u = textView;
        this.f4522v = lottieAnimationView;
    }
}
