package bl;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final cl.c f7109a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f7110b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f7111c;

    /* renamed from: d, reason: collision with root package name */
    public final View.OnTouchListener f7112d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7113e;

    public i(cl.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f7109a = mapping;
        this.f7110b = new WeakReference(hostView);
        this.f7111c = new WeakReference(rootView);
        this.f7112d = cl.g.f(hostView);
        this.f7113e = true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        View view2 = (View) this.f7111c.get();
        View view3 = (View) this.f7110b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.a(this.f7109a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f7112d;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
