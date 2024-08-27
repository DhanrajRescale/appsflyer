package bl;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final cl.c f7074a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f7075b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f7076c;

    /* renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f7077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7078e;

    public a(cl.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f7074a = mapping;
        this.f7075b = new WeakReference(hostView);
        this.f7076c = new WeakReference(rootView);
        this.f7077d = cl.g.e(hostView);
        this.f7078e = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f7077d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.f7076c.get();
            View view3 = (View) this.f7075b.get();
            if (view2 != null && view3 != null) {
                c.a(this.f7074a, view2, view3);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
