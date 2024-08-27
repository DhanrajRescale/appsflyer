package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes.dex */
public abstract class ai extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ComposeView f4203s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposeView f4204t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f4205u;

    public ai(Object obj, View view, ComposeView composeView, ComposeView composeView2, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4203s = composeView;
        this.f4204t = composeView2;
        this.f4205u = toolbar;
    }
}
