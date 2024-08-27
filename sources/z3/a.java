package z3;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.t;
import androidx.work.u;
import b8.l;
import b8.n;
import com.google.android.material.appbar.AppBarLayout;
import d4.v0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import wn.k;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41979a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41980b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41981c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f41982d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3) {
        this.f41979a = i10;
        this.f41982d = obj;
        this.f41980b = obj2;
        this.f41981c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b8.n] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        k kVar;
        OverScroller overScroller;
        boolean z10 = true;
        ?? r22 = 1;
        switch (this.f41979a) {
            case 0:
                hr.c cVar = (hr.c) this.f41980b;
                Typeface typeface = (Typeface) this.f41981c;
                t3.b bVar = (t3.b) cVar.f18690b;
                if (bVar != null) {
                    bVar.f(typeface);
                    return;
                }
                return;
            case 1:
                ((c4.a) this.f41980b).b(this.f41981c);
                return;
            case 2:
                try {
                    obj = ((Callable) this.f41980b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f41982d).post(new a((int) (r22 == true ? 1 : 0), this, (c4.a) this.f41981c, obj));
                return;
            case 3:
                try {
                    z10 = ((Boolean) ((op.a) this.f41982d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((b8.a) this.f41980b).b((String) this.f41981c, z10);
                return;
            case 4:
                Object obj2 = this.f41981c;
                Object obj3 = this.f41982d;
                try {
                    ((op.a) this.f41980b).get();
                    u.w().u(n.f4126t, String.format("Starting work for %s", ((n) obj3).f4131e.f21076c), new Throwable[0]);
                    ((n) obj3).f4144r = ((n) obj3).f4132f.startWork();
                    ((l8.j) obj2).l(((n) obj3).f4144r);
                    return;
                } catch (Throwable th2) {
                    ((l8.j) obj2).k(th2);
                    return;
                }
            case 5:
                Object obj4 = this.f41981c;
                ?? r32 = this.f41982d;
                try {
                    try {
                        t tVar = (t) ((l8.j) this.f41980b).get();
                        if (tVar == null) {
                            u.w().v(n.f4126t, String.format("%s returned a null result. Treating it as a failure.", ((n) r32).f4131e.f21076c), new Throwable[0]);
                        } else {
                            u.w().u(n.f4126t, String.format("%s returned a %s result.", ((n) r32).f4131e.f21076c, tVar), new Throwable[0]);
                            ((n) r32).f4134h = tVar;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        u.w().v(n.f4126t, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    } catch (CancellationException e11) {
                        u.w().z(n.f4126t, String.format("%s was cancelled", (String) obj4), e11);
                    } catch (ExecutionException e12) {
                        e = e12;
                        u.w().v(n.f4126t, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    }
                    r32 = (n) r32;
                    r32.c();
                    return;
                } catch (Throwable th3) {
                    ((n) r32).c();
                    throw th3;
                }
            case 6:
                j8.k o10 = ((WorkDatabase) this.f41980b).n().o((String) this.f41981c);
                if (o10 != null && o10.b()) {
                    synchronized (((i8.c) this.f41982d).f19734c) {
                        ((i8.c) this.f41982d).f19737f.put((String) this.f41981c, o10);
                        ((i8.c) this.f41982d).f19738g.add(o10);
                        Object obj5 = this.f41982d;
                        ((i8.c) obj5).f19739h.b(((i8.c) obj5).f19738g);
                    }
                    return;
                }
                return;
            case 7:
                ((l) this.f41980b).f4113f.g((String) this.f41981c, (h.c) this.f41982d);
                return;
            case 8:
                View view = (View) this.f41981c;
                if (view != null && (overScroller = (kVar = (k) this.f41982d).f39336d) != null) {
                    boolean computeScrollOffset = overScroller.computeScrollOffset();
                    Object obj6 = this.f41980b;
                    if (computeScrollOffset) {
                        kVar.w((CoordinatorLayout) obj6, view, kVar.f39336d.getCurrY());
                        v0.m(view, this);
                        return;
                    }
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj6;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) kVar).C(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f11084l) {
                        appBarLayout.g(appBarLayout.h(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((xn.a) this.f41982d).f((View) this.f41980b, (FrameLayout) this.f41981c);
                return;
            default:
                ft.e eVar = (ft.e) this.f41980b;
                ct.b b10 = ((pt.j) this.f41982d).b((Runnable) this.f41981c);
                eVar.getClass();
                ft.b.d(eVar, b10);
                return;
        }
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, int i10) {
        this.f41979a = i10;
        this.f41980b = obj;
        this.f41981c = str;
        this.f41982d = obj2;
    }
}
