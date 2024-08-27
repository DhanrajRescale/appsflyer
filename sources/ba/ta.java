package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.widget.BorderDrawableButton;
import com.assetgro.stockgro.widget.ConstraintLayoutWithDisableSupport;

/* loaded from: classes.dex */
public abstract class ta extends m4.m {
    public static final /* synthetic */ int I = 0;
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public ArenaGame H;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayoutWithDisableSupport f6173s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6174t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6175u;

    /* renamed from: v, reason: collision with root package name */
    public final BorderDrawableButton f6176v;

    /* renamed from: w, reason: collision with root package name */
    public final BorderDrawableButton f6177w;

    /* renamed from: x, reason: collision with root package name */
    public final na f6178x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f6179y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f6180z;

    public ta(Object obj, View view, ConstraintLayoutWithDisableSupport constraintLayoutWithDisableSupport, TextView textView, ConstraintLayout constraintLayout, BorderDrawableButton borderDrawableButton, BorderDrawableButton borderDrawableButton2, na naVar, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, ImageView imageView2, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, 1);
        this.f6173s = constraintLayoutWithDisableSupport;
        this.f6174t = textView;
        this.f6175u = constraintLayout;
        this.f6176v = borderDrawableButton;
        this.f6177w = borderDrawableButton2;
        this.f6178x = naVar;
        this.f6179y = textView2;
        this.f6180z = textView3;
        this.A = textView4;
        this.B = imageView;
        this.C = textView5;
        this.D = imageView2;
        this.E = textView6;
        this.F = textView7;
        this.G = textView8;
    }

    public abstract void r(ArenaGame arenaGame);
}
