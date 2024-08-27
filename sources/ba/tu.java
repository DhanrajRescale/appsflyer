package ba;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.ChipView;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class tu extends m4.m {
    public final InputView A;
    public final InputView B;
    public final RelativeLayout C;
    public final ChipView D;
    public final ConstraintLayout E;

    /* renamed from: s, reason: collision with root package name */
    public final RelativeLayout f6227s;

    /* renamed from: t, reason: collision with root package name */
    public final InputView f6228t;

    /* renamed from: u, reason: collision with root package name */
    public final InputView f6229u;

    /* renamed from: v, reason: collision with root package name */
    public final RelativeLayout f6230v;

    /* renamed from: w, reason: collision with root package name */
    public final ChipView f6231w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f6232x;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialButton f6233y;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f6234z;

    public tu(Object obj, View view, RelativeLayout relativeLayout, InputView inputView, InputView inputView2, RelativeLayout relativeLayout2, ChipView chipView, MaterialButton materialButton, MaterialButton materialButton2, RelativeLayout relativeLayout3, InputView inputView3, InputView inputView4, RelativeLayout relativeLayout4, ChipView chipView2, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f6227s = relativeLayout;
        this.f6228t = inputView;
        this.f6229u = inputView2;
        this.f6230v = relativeLayout2;
        this.f6231w = chipView;
        this.f6232x = materialButton;
        this.f6233y = materialButton2;
        this.f6234z = relativeLayout3;
        this.A = inputView3;
        this.B = inputView4;
        this.C = relativeLayout4;
        this.D = chipView2;
        this.E = constraintLayout;
    }
}
