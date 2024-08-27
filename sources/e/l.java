package e;

import android.content.ClipData;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import b5.q0;
import d2.a0;
import d4.d3;
import d4.r2;
import d4.s2;
import d4.t2;
import d4.u2;
import e4.y;
import e5.p;
import ea.p0;
import ek.c0;
import ek.x;
import g7.a3;
import g7.b3;
import g7.x1;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.o;
import m.j2;
import m.k1;
import m.q;
import m.u3;
import r5.x0;
import x1.f0;
import x1.t;
import x1.u;
import x1.v;
import x1.w;

/* loaded from: classes.dex */
public final class l implements k1, j2, l.m, q, u3.k, y, w5.a, l5.i, x0, xs.b, yj.g, x, ek.a, ek.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14640a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14641b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(b3 config, Object obj, Function0 pagingSourceFactory) {
        this(config, obj, pagingSourceFactory, 0);
        this.f14640a = 20;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
    }

    @Override // m.j2
    public final void B(o oVar, l.q qVar) {
        l.h hVar = null;
        ((l.i) this.f14641b).f23600g.removeCallbacksAndMessages(null);
        int size = ((l.i) this.f14641b).f23602i.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (oVar == ((l.h) ((l.i) this.f14641b).f23602i.get(i10)).f23573b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < ((l.i) this.f14641b).f23602i.size()) {
            hVar = (l.h) ((l.i) this.f14641b).f23602i.get(i11);
        }
        ((l.i) this.f14641b).f23600g.postAtTime(new l.g(this, hVar, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // ek.c
    public final Object C(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // l5.i
    public final boolean E() {
        return true;
    }

    @Override // l5.i
    public final long F() {
        return 0L;
    }

    @Override // r5.x0
    public final long G() {
        long j10 = Long.MAX_VALUE;
        for (x0 x0Var : (x0[]) this.f14641b) {
            long G = x0Var.G();
            if (G != Long.MIN_VALUE) {
                j10 = Math.min(j10, G);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // l5.i
    public final long H(long j10) {
        return 1L;
    }

    @Override // l5.i
    public final long I(long j10, long j11) {
        return 1L;
    }

    @Override // r5.x0
    public final void J(long j10) {
        for (x0 x0Var : (x0[]) this.f14641b) {
            x0Var.J(j10);
        }
    }

    public final d3 K() {
        return ((u2) this.f14641b).b();
    }

    public final n1.c L() {
        return (n1.c) this.f14641b;
    }

    public final void M() {
        long j10;
        l5.h hVar = (l5.h) this.f14641b;
        synchronized (w5.b.f38812b) {
            try {
                if (w5.b.f38813c) {
                    j10 = w5.b.f38814d;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = l5.h.Q;
        hVar.M = j10;
        hVar.v(true);
    }

    public final q0 N(z5.q qVar, j5.d dVar) {
        q0 q0Var = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.n(((p) this.f14641b).f15036a, 0, 10);
                ((p) this.f14641b).F(0);
                if (((p) this.f14641b).w() != 4801587) {
                    break;
                }
                ((p) this.f14641b).G(3);
                int t10 = ((p) this.f14641b).t();
                int i11 = t10 + 10;
                if (q0Var == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(((p) this.f14641b).f15036a, 0, bArr, 0, 10);
                    qVar.n(bArr, 10, t10);
                    q0Var = new k6.j(dVar).j1(i11, bArr);
                } else {
                    qVar.d(t10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.i();
        qVar.d(i10);
        return q0Var;
    }

    public final x1.f O(v vVar, f0 f0Var) {
        boolean z10;
        long j10;
        long j11;
        l lVar;
        l lVar2 = this;
        List list = vVar.f39925a;
        t.o oVar = new t.o(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            w wVar = (w) list.get(i10);
            u uVar = (u) ((t.o) lVar2.f14641b).c(wVar.f39927a);
            if (uVar == null) {
                j11 = wVar.f39928b;
                j10 = wVar.f39930d;
                z10 = false;
            } else {
                long D = ((a0) f0Var).D(uVar.f39923b);
                long j12 = uVar.f39922a;
                z10 = uVar.f39924c;
                j10 = D;
                j11 = j12;
            }
            long j13 = wVar.f39927a;
            List list2 = list;
            int i11 = size;
            oVar.g(j13, new t(j13, wVar.f39928b, wVar.f39930d, wVar.f39931e, wVar.f39932f, j11, j10, z10, wVar.f39933g, wVar.f39935i, wVar.f39936j, wVar.f39937k));
            boolean z11 = wVar.f39931e;
            long j14 = wVar.f39927a;
            if (z11) {
                lVar = this;
                ((t.o) lVar.f14641b).g(j14, new u(wVar.f39928b, wVar.f39929c, z11));
            } else {
                lVar = this;
                ((t.o) lVar.f14641b).h(j14);
            }
            i10++;
            lVar2 = lVar;
            list = list2;
            size = i11;
        }
        return new x1.f(oVar, vVar);
    }

    @Override // yj.g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor l() {
        hr.c cVar = (hr.c) this.f14641b;
        cVar.getClass();
        try {
            Os.lseek(((ParcelFileDescriptor) cVar.f18690b).getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return (ParcelFileDescriptor) cVar.f18690b;
        } catch (ErrnoException e10) {
            throw new IOException(e10);
        }
    }

    @Override // ek.c
    public final Class a() {
        return InputStream.class;
    }

    @Override // l5.i
    public final long b(long j10) {
        return 0L;
    }

    @Override // yj.g
    public final void c() {
    }

    @Override // e4.y
    public final boolean d(View view) {
        switch (this.f14640a) {
            case 14:
                ((DrawerLayout) this.f14641b).getClass();
                if (DrawerLayout.m(view) && ((DrawerLayout) this.f14641b).h(view) != 2) {
                    ((DrawerLayout) this.f14641b).c(view);
                    return true;
                }
                return false;
            default:
                a8.j jVar = (a8.j) this.f14641b;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = jVar.f274f;
                if (viewPager2.f2526r) {
                    viewPager2.d(currentItem, true);
                }
                return true;
        }
    }

    @Override // l5.i
    public final long e(long j10, long j11) {
        return j11;
    }

    @Override // ek.x
    public final ek.w f(c0 c0Var) {
        return new ek.b((AssetManager) this.f14641b, this);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ((p0) this.f14641b).getClass();
        return 60L;
    }

    @Override // l5.i
    public final long h(long j10, long j11) {
        return 0L;
    }

    @Override // r5.x0
    public final long i() {
        long j10 = Long.MAX_VALUE;
        for (x0 x0Var : (x0[]) this.f14641b) {
            long i10 = x0Var.i();
            if (i10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, i10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // l5.i
    public final long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l5.i
    public final m5.j k(long j10) {
        return (m5.j) this.f14641b;
    }

    @Override // m.j2
    public final void m(o oVar, MenuItem menuItem) {
        ((l.i) this.f14641b).f23600g.removeCallbacksAndMessages(oVar);
    }

    @Override // l.m
    public final void n(o oVar) {
        l.m mVar = ((ActionMenuView) this.f14641b).f983v;
        if (mVar != null) {
            mVar.n(oVar);
        }
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long i10 = i();
            if (i10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (x0 x0Var : (x0[]) this.f14641b) {
                long i11 = x0Var.i();
                if (i11 != Long.MIN_VALUE && i11 <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == i10 || z11) {
                    z10 |= x0Var.s(j10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // l5.i
    public final long t(long j10, long j11) {
        return 0L;
    }

    @Override // r5.x0
    public final boolean u() {
        for (x0 x0Var : (x0[]) this.f14641b) {
            if (x0Var.u()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.m
    public final boolean v(o oVar, MenuItem menuItem) {
        u3 u3Var;
        Object obj = this.f14641b;
        if (((ActionMenuView) obj).A != null) {
            l lVar = (l) ((ActionMenuView) obj).A;
            if (((Toolbar) lVar.f14641b).G.a(menuItem) || ((u3Var = ((Toolbar) lVar.f14641b).I) != null && u3Var.onMenuItemClick(menuItem))) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.k
    public final int x(Object obj) {
        return ((z3.h) obj).f42000c;
    }

    @Override // ek.a
    public final yj.k y(AssetManager assetManager, String str) {
        return new yj.k(assetManager, str, 0);
    }

    @Override // u3.k
    public final boolean z(Object obj) {
        return ((z3.h) obj).f42001d;
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.f14640a = i10;
        this.f14641b = obj;
    }

    public l(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14640a = 27;
        this.f14641b = new hr.c(parcelFileDescriptor, 23);
    }

    public l(ViewGroup viewGroup) {
        this.f14640a = 21;
        this.f14641b = viewGroup.getOverlay();
    }

    public l(int i10) {
        this.f14640a = i10;
        if (i10 == 2) {
            this.f14641b = new ArrayDeque();
            return;
        }
        if (i10 == 13) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f14641b = new t2();
                return;
            } else if (i11 >= 29) {
                this.f14641b = new s2();
                return;
            } else {
                this.f14641b = new r2();
                return;
            }
        }
        if (i10 == 15) {
            this.f14641b = new LinkedHashMap();
            return;
        }
        if (i10 == 19) {
            this.f14641b = new p(10);
            return;
        }
        if (i10 == 7) {
            this.f14641b = new n1.c();
            return;
        }
        if (i10 == 8) {
            this.f14641b = new t.o((Object) null);
        } else if (i10 == 23) {
            this.f14641b = yk.j.N0(Looper.getMainLooper());
        } else if (i10 != 24) {
            this.f14641b = f.c.f15870a;
        }
    }

    public l(b3 config, Object obj, Function0 pagingSourceFactory, int i10) {
        this.f14640a = 20;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f14641b = new x1(new a3(pagingSourceFactory, null), obj, config).f17124f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b3 b3Var, Function0 function0) {
        this(b3Var, (Object) null, function0);
        this.f14640a = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener, int i10) {
        this(context, simpleOnGestureListener);
        this.f14640a = 12;
    }

    public l(ClipData clipData, int i10) {
        this.f14640a = 11;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14641b = new d4.d(clipData, i10);
        } else {
            this.f14641b = new d4.f(clipData, i10);
        }
    }

    public l(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f14640a = 12;
        this.f14641b = new hr.c(context, simpleOnGestureListener);
    }

    public l(d3 d3Var) {
        this.f14640a = 13;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f14641b = new t2(d3Var);
        } else if (i10 >= 29) {
            this.f14641b = new s2(d3Var);
        } else {
            this.f14641b = new r2(d3Var);
        }
    }
}
