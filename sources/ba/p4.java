package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public abstract class p4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5718s;

    /* renamed from: t, reason: collision with root package name */
    public final FloatingActionButton f5719t;

    /* renamed from: u, reason: collision with root package name */
    public final ComposeView f5720u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f5721v;

    public p4(Object obj, View view, TextView textView, FloatingActionButton floatingActionButton, ComposeView composeView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5718s = textView;
        this.f5719t = floatingActionButton;
        this.f5720u = composeView;
        this.f5721v = toolbar;
    }
}
