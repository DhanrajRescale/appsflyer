package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.widget.BorderDrawableButton;

/* loaded from: classes.dex */
public abstract class pa extends m4.m {
    public static final /* synthetic */ int G = 0;
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public oc.c E;
    public ArenaGame F;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5741s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5742t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5743u;

    /* renamed from: v, reason: collision with root package name */
    public final BorderDrawableButton f5744v;

    /* renamed from: w, reason: collision with root package name */
    public final BorderDrawableButton f5745w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f5746x;

    /* renamed from: y, reason: collision with root package name */
    public final na f5747y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5748z;

    public pa(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, BorderDrawableButton borderDrawableButton, BorderDrawableButton borderDrawableButton2, TextView textView3, na naVar, TextView textView4, ImageView imageView, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, 1);
        this.f5741s = constraintLayout;
        this.f5742t = textView;
        this.f5743u = textView2;
        this.f5744v = borderDrawableButton;
        this.f5745w = borderDrawableButton2;
        this.f5746x = textView3;
        this.f5747y = naVar;
        this.f5748z = textView4;
        this.A = imageView;
        this.B = textView5;
        this.C = textView6;
        this.D = textView7;
    }
}
