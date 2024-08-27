package ba;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class ns extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5605s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5606t;

    /* renamed from: u, reason: collision with root package name */
    public String f5607u;

    /* renamed from: v, reason: collision with root package name */
    public String f5608v;

    public ns(Object obj, View view, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.f5605s = textView;
        this.f5606t = textView2;
    }

    public abstract void r(String str);

    public abstract void s(String str);
}
