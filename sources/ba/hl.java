package ba;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.TnCLinkView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class hl extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final InputView f4951s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f4952t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f4953u;

    /* renamed from: v, reason: collision with root package name */
    public final TnCLinkView f4954v;

    public hl(Object obj, View view, InputView inputView, ConstraintLayout constraintLayout, MaterialButton materialButton, TnCLinkView tnCLinkView) {
        super(obj, view, 0);
        this.f4951s = inputView;
        this.f4952t = constraintLayout;
        this.f4953u = materialButton;
        this.f4954v = tnCLinkView;
    }
}
