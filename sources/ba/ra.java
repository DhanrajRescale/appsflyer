package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.widget.BorderDrawableButton;

/* loaded from: classes.dex */
public abstract class ra extends m4.m {
    public static final /* synthetic */ int D = 0;
    public final TextView A;
    public oc.c B;
    public ArenaGame C;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5943s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5944t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5945u;

    /* renamed from: v, reason: collision with root package name */
    public final BorderDrawableButton f5946v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5947w;

    /* renamed from: x, reason: collision with root package name */
    public final LottieAnimationView f5948x;

    /* renamed from: y, reason: collision with root package name */
    public final LottieAnimationView f5949y;

    /* renamed from: z, reason: collision with root package name */
    public final na f5950z;

    public ra(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, BorderDrawableButton borderDrawableButton, TextView textView3, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, na naVar, TextView textView4) {
        super(obj, view, 1);
        this.f5943s = constraintLayout;
        this.f5944t = textView;
        this.f5945u = textView2;
        this.f5946v = borderDrawableButton;
        this.f5947w = textView3;
        this.f5948x = lottieAnimationView;
        this.f5949y = lottieAnimationView2;
        this.f5950z = naVar;
        this.A = textView4;
    }
}
