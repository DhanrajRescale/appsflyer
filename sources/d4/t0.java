package d4;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13827a;

    /* renamed from: b, reason: collision with root package name */
    public int f13828b;

    /* renamed from: c, reason: collision with root package name */
    public int f13829c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f13830d;

    public t0(wt.d map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f13830d = map;
        this.f13828b = -1;
        this.f13829c = map.f39468h;
        f();
    }

    public final void b() {
        if (((wt.d) this.f13830d).f39468h == this.f13829c) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public final Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.f13828b) {
            return c(view);
        }
        Object tag = view.getTag(this.f13827a);
        if (((Class) this.f13830d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void f() {
        while (true) {
            int i10 = this.f13827a;
            Serializable serializable = this.f13830d;
            if (i10 < ((wt.d) serializable).f39466f && ((wt.d) serializable).f39463c[i10] < 0) {
                this.f13827a = i10 + 1;
            } else {
                return;
            }
        }
    }

    public final void g(View view, Object obj) {
        c cVar;
        if (Build.VERSION.SDK_INT >= this.f13828b) {
            d(view, obj);
            return;
        }
        if (h(e(view), obj)) {
            View.AccessibilityDelegate d10 = n1.d(view);
            if (d10 == null) {
                cVar = null;
            } else if (d10 instanceof a) {
                cVar = ((a) d10).f13716a;
            } else {
                cVar = new c(d10);
            }
            if (cVar == null) {
                cVar = new c();
            }
            n1.n(view, cVar);
            view.setTag(this.f13827a, obj);
            n1.h(view, this.f13829c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public final boolean hasNext() {
        if (this.f13827a < ((wt.d) this.f13830d).f39466f) {
            return true;
        }
        return false;
    }

    public final void remove() {
        b();
        if (this.f13828b != -1) {
            Serializable serializable = this.f13830d;
            ((wt.d) serializable).c();
            ((wt.d) serializable).m(this.f13828b);
            this.f13828b = -1;
            this.f13829c = ((wt.d) serializable).f39468h;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }

    public t0(int i10, Class cls, int i11, int i12) {
        this.f13827a = i10;
        this.f13830d = cls;
        this.f13829c = i11;
        this.f13828b = i12;
    }
}
