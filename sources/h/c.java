package h;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.d1;
import androidx.lifecycle.f1;
import androidx.lifecycle.h1;
import androidx.media3.common.ParserException;
import coil.request.NullRequestDataException;
import g7.a1;
import g7.b1;
import g7.y0;
import g7.z0;
import java.io.EOFException;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;
import tu.k1;
import tu.l1;

/* loaded from: classes.dex */
public final class c implements h4.l, g4.g, b7.b0, p7.c, m8.a {

    /* renamed from: e, reason: collision with root package name */
    public static c f17581e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17582a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17583b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17584c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17585d;

    public /* synthetic */ c(int i10, Object obj, Object obj2, Object obj3) {
        this.f17582a = i10;
        this.f17583b = obj;
        this.f17584c = obj2;
        this.f17585d = obj3;
    }

    public static c N(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [g7.z0] */
    public static final g7.c0 i(c cVar, g7.c0 c0Var, a1 a1Var, a1 a1Var2) {
        z0 z0Var;
        z0 z0Var2;
        z0 z0Var3;
        z0 z0Var4;
        ?? r11;
        cVar.getClass();
        y0 y0Var = y0.f17134c;
        if (c0Var == null || (z0Var = c0Var.f16682a) == null) {
            z0Var = y0Var;
        }
        z0 z0Var5 = a1Var.f16646a;
        z0 z0Var6 = null;
        if (a1Var2 != null) {
            z0Var2 = a1Var2.f16646a;
        } else {
            z0Var2 = null;
        }
        z0 k10 = k(z0Var, z0Var5, z0Var5, z0Var2);
        if (c0Var == null || (z0Var3 = c0Var.f16683b) == null) {
            z0Var3 = y0Var;
        }
        if (a1Var2 != null) {
            z0Var4 = a1Var2.f16647b;
        } else {
            z0Var4 = null;
        }
        z0 z0Var7 = a1Var.f16646a;
        z0 k11 = k(z0Var3, z0Var7, a1Var.f16647b, z0Var4);
        if (c0Var != null && (r11 = c0Var.f16684c) != 0) {
            y0Var = r11;
        }
        if (a1Var2 != null) {
            z0Var6 = a1Var2.f16648c;
        }
        return new g7.c0(k10, k11, k(y0Var, z0Var7, a1Var.f16648c, z0Var6), a1Var, a1Var2);
    }

    public static z0 k(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4) {
        if (z0Var4 == null) {
            return z0Var3;
        }
        if (!(z0Var instanceof g7.x0) || (((z0Var2 instanceof y0) && (z0Var4 instanceof y0)) || (z0Var4 instanceof g7.w0))) {
            return z0Var4;
        }
        return z0Var;
    }

    public static y8.e m(y8.j jVar, Throwable th2) {
        Drawable b10;
        if (th2 instanceof NullRequestDataException) {
            b10 = d9.d.b(jVar, jVar.K, jVar.J, jVar.M.f41312l);
            if (b10 == null) {
                b10 = d9.d.b(jVar, jVar.I, jVar.H, jVar.M.f41311k);
            }
        } else {
            b10 = d9.d.b(jVar, jVar.I, jVar.H, jVar.M.f41311k);
        }
        return new y8.e(b10, jVar, th2);
    }

    public final Location A(String str) {
        try {
            if (((LocationManager) this.f17584c).isProviderEnabled(str)) {
                return ((LocationManager) this.f17584c).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public final Executor B() {
        switch (this.f17582a) {
            case 23:
                return (Executor) this.f17583b;
            default:
                return (Executor) this.f17585d;
        }
    }

    public final int C(int i10, int i11) {
        return ((TypedArray) this.f17584c).getResourceId(i10, i11);
    }

    public final String D(int i10) {
        return ((TypedArray) this.f17584c).getString(i10);
    }

    public final j8.e E(String str) {
        j8.e eVar;
        l7.t a10 = l7.t.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        ((l7.s) this.f17583b).b();
        Cursor P = yk.g.P((l7.s) this.f17583b, a10, false);
        try {
            int i10 = q6.l.i(P, "work_spec_id");
            int i11 = q6.l.i(P, "system_id");
            if (P.moveToFirst()) {
                eVar = new j8.e(P.getString(i10), P.getInt(i11));
            } else {
                eVar = null;
            }
            return eVar;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final CharSequence F(int i10) {
        return ((TypedArray) this.f17584c).getText(i10);
    }

    public final androidx.lifecycle.a1 G(ou.b modelClass, String key) {
        boolean isInstance;
        androidx.lifecycle.a1 viewModel;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        h1 h1Var = (h1) this.f17583b;
        h1Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.lifecycle.a1 a1Var = (androidx.lifecycle.a1) h1Var.f1912a.get(key);
        iu.e eVar = (iu.e) modelClass;
        eVar.getClass();
        iu.e.INSTANCE.getClass();
        Class jClass = eVar.f20549a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = iu.e.f20546c;
        Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = zq.f.S(num.intValue(), a1Var);
        } else {
            if (jClass.isPrimitive()) {
                Intrinsics.checkNotNullParameter(jClass, "<this>");
                jClass = yk.g.z(iu.a0.a(jClass));
            }
            isInstance = jClass.isInstance(a1Var);
        }
        if (isInstance) {
            Object obj = (d1) this.f17584c;
            if (obj instanceof f1) {
                Intrinsics.c(a1Var);
                ((f1) obj).d(a1Var);
            }
            Intrinsics.d(a1Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return a1Var;
        }
        y4.e extras = new y4.e((y4.c) this.f17585d);
        extras.b(z4.d.f42013a, key);
        d1 factory = (d1) this.f17584c;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                viewModel = factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                viewModel = factory.a(yk.g.y(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            viewModel = factory.c(yk.g.y(modelClass), extras);
        }
        h1 h1Var2 = (h1) this.f17583b;
        h1Var2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        androidx.lifecycle.a1 a1Var2 = (androidx.lifecycle.a1) h1Var2.f1912a.put(key, viewModel);
        if (a1Var2 != null) {
            a1Var2.b();
        }
        return viewModel;
    }

    public final boolean H(int i10) {
        return ((TypedArray) this.f17584c).hasValue(i10);
    }

    public final void I(g5.f fVar, Uri uri, Map map, long j10, long j11, z5.r rVar) {
        boolean z10;
        z5.l lVar = new z5.l(fVar, j10, j11);
        this.f17585d = lVar;
        if (((z5.p) this.f17584c) != null) {
            return;
        }
        z5.p[] d10 = ((z5.s) this.f17583b).d(uri, map);
        boolean z11 = true;
        if (d10.length == 1) {
            this.f17584c = d10[0];
        } else {
            int length = d10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                z5.p pVar = d10[i10];
                try {
                } catch (EOFException unused) {
                    if (((z5.p) this.f17584c) == null && lVar.f42106d != j10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    if (((z5.p) this.f17584c) == null && lVar.f42106d != j10) {
                        z11 = false;
                    }
                    yk.j.H0(z11);
                    lVar.f42108f = 0;
                    throw th2;
                }
                if (pVar.g(lVar)) {
                    this.f17584c = pVar;
                    lVar.f42108f = 0;
                    break;
                }
                if (((z5.p) this.f17584c) == null && lVar.f42106d != j10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                yk.j.H0(z10);
                lVar.f42108f = 0;
                i10++;
            }
            if (((z5.p) this.f17584c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i11 = e5.x.f15050a;
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < d10.length; i12++) {
                    sb3.append(d10[i12].getClass().getSimpleName());
                    if (i12 < d10.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String sb4 = sb2.toString();
                uri.getClass();
                throw new ParserException(sb4, null, false, 1);
            }
        }
        ((z5.p) this.f17584c).d(rVar);
    }

    public final void J(j8.e eVar) {
        ((l7.s) this.f17583b).b();
        ((l7.s) this.f17583b).c();
        try {
            ((l7.b) this.f17584c).e(eVar);
            ((l7.s) this.f17583b).h();
        } finally {
            ((l7.s) this.f17583b).f();
        }
    }

    public final boolean K() {
        if (((l3) this.f17583b).getValue() == this.f17585d) {
            Object obj = this.f17584c;
            if (((c) obj) == null || !((c) obj).K()) {
                return false;
            }
        }
        return true;
    }

    public final boolean L() {
        return ((w2.e) this.f17583b) == null && ((String) this.f17584c) == null;
    }

    public final boolean M(int i10, j3.d dVar, k3.c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        k3.b bVar = (k3.b) this.f17584c;
        int[] iArr = dVar.f20882r0;
        bVar.f21978a = iArr[0];
        bVar.f21979b = iArr[1];
        bVar.f21980c = dVar.s();
        ((k3.b) this.f17584c).f21981d = dVar.m();
        k3.b bVar2 = (k3.b) this.f17584c;
        bVar2.f21986i = false;
        bVar2.f21987j = i10;
        if (bVar2.f21978a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar2.f21979b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.Y > s0.g.f34069a) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && dVar.Y > s0.g.f34069a) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr2 = dVar.f20886v;
        if (z12 && iArr2[0] == 4) {
            bVar2.f21978a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar2.f21979b = 1;
        }
        cVar.b(dVar, bVar2);
        dVar.T(((k3.b) this.f17584c).f21982e);
        dVar.O(((k3.b) this.f17584c).f21983f);
        k3.b bVar3 = (k3.b) this.f17584c;
        dVar.G = bVar3.f21985h;
        dVar.K(bVar3.f21984g);
        k3.b bVar4 = (k3.b) this.f17584c;
        bVar4.f21987j = 0;
        return bVar4.f21986i;
    }

    public final void O(Exception exc, boolean z10) {
        int i10;
        this.f17584c = null;
        lp.o0 q10 = lp.o0.q((Set) this.f17583b);
        ((Set) this.f17583b).clear();
        lp.l0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            n5.d dVar = (n5.d) listIterator.next();
            dVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            dVar.j(i10, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0039, code lost:
    
        if (((d9.h) r18.f17585d).a(r20) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y8.m P(y8.j r19, z8.g r20) {
        /*
            r18 = this;
            r0 = r19
            r4 = r20
            java.util.List r1 = r0.f41373l
            boolean r2 = r1.isEmpty()
            android.graphics.Bitmap$Config r3 = r0.f41368g
            if (r2 != 0) goto L1a
            android.graphics.Bitmap$Config[] r2 = d9.e.f14221a
            boolean r2 = vt.v.o(r2, r3)
            if (r2 == 0) goto L17
            goto L1a
        L17:
            r15 = r18
            goto L3d
        L1a:
            boolean r2 = yk.o.S(r3)
            if (r2 != 0) goto L23
            r15 = r18
            goto L3b
        L23:
            boolean r2 = yk.o.S(r3)
            if (r2 != 0) goto L2c
        L29:
            r15 = r18
            goto L31
        L2c:
            boolean r2 = r0.f41378q
            if (r2 != 0) goto L29
            goto L17
        L31:
            java.lang.Object r2 = r15.f17585d
            d9.h r2 = (d9.h) r2
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L3d
        L3b:
            r2 = r3
            goto L3f
        L3d:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L3f:
            al.d r3 = r4.f42187a
            z8.b r5 = z8.b.f42176b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r5)
            if (r3 != 0) goto L56
            al.d r3 = r4.f42188b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r5)
            if (r3 == 0) goto L52
            goto L56
        L52:
            z8.f r3 = r0.C
        L54:
            r5 = r3
            goto L59
        L56:
            z8.f r3 = z8.f.f42184b
            goto L54
        L59:
            boolean r3 = r0.f41379r
            if (r3 == 0) goto L6a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6a
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r1) goto L6a
            r1 = 1
        L68:
            r7 = r1
            goto L6c
        L6a:
            r1 = 0
            goto L68
        L6c:
            y8.m r16 = new y8.m
            android.content.Context r1 = r0.f41362a
            android.graphics.ColorSpace r3 = r0.f41369h
            boolean r6 = d9.d.a(r19)
            boolean r8 = r0.f41380s
            java.lang.String r9 = r0.f41367f
            okhttp3.Headers r10 = r0.f41375n
            y8.q r11 = r0.f41376o
            y8.n r12 = r0.D
            y8.b r13 = r0.f41381t
            y8.b r14 = r0.f41382u
            y8.b r0 = r0.f41383v
            r17 = r0
            r0 = r16
            r4 = r20
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.P(y8.j, z8.g):y8.m");
    }

    public final void Q(androidx.lifecycle.m mVar) {
        androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) this.f17585d;
        if (y0Var != null) {
            y0Var.run();
        }
        androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0((androidx.lifecycle.v) this.f17583b, mVar);
        this.f17585d = y0Var2;
        ((Handler) this.f17584c).postAtFrontOfQueue(y0Var2);
    }

    public final void R() {
        ((TypedArray) this.f17584c).recycle();
    }

    public final void S(String str) {
        ((l7.s) this.f17583b).b();
        q7.g a10 = ((l7.x) this.f17585d).a();
        if (str == null) {
            a10.d(1);
        } else {
            a10.f(1, str);
        }
        ((l7.s) this.f17583b).c();
        try {
            a10.g();
            ((l7.s) this.f17583b).h();
        } finally {
            ((l7.s) this.f17583b).f();
            ((l7.x) this.f17585d).c(a10);
        }
    }

    public final void T(a1 states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f17583b = states.f16646a;
        this.f17585d = states.f16648c;
        this.f17584c = states.f16647b;
    }

    public final void U(a1 sourceLoadStates, a1 a1Var) {
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        l(new c.g(26, this, sourceLoadStates, a1Var));
    }

    public final void V(b1 type, z0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.f17585d = state;
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.f17584c = state;
            return;
        }
        this.f17583b = state;
    }

    public final void W(int i10, int[] iArr, int[] iArr2, String[] strArr) {
        ((String[][]) this.f17583b)[i10] = strArr;
        ((int[][]) this.f17584c)[i10] = iArr;
        ((int[][]) this.f17585d)[i10] = iArr2;
    }

    public final a1 X() {
        return new a1((z0) this.f17583b, (z0) this.f17584c, (z0) this.f17585d);
    }

    public final void Y(j3.e eVar, int i10, int i11, int i12) {
        eVar.getClass();
        int i13 = eVar.f20855d0;
        int i14 = eVar.f20857e0;
        eVar.f20855d0 = 0;
        eVar.f20857e0 = 0;
        eVar.T(i11);
        eVar.O(i12);
        if (i13 < 0) {
            eVar.f20855d0 = 0;
        } else {
            eVar.f20855d0 = i13;
        }
        if (i14 < 0) {
            eVar.f20857e0 = 0;
        } else {
            eVar.f20857e0 = i14;
        }
        j3.e eVar2 = (j3.e) this.f17585d;
        eVar2.f20893v0 = i10;
        eVar2.X();
    }

    public final void Z(j3.e eVar) {
        ((ArrayList) this.f17583b).clear();
        int size = eVar.f20935s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            j3.d dVar = (j3.d) eVar.f20935s0.get(i10);
            int[] iArr = dVar.f20882r0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f17583b).add(dVar);
            }
        }
        eVar.f20892u0.f21990a = true;
    }

    @Override // g4.g
    public final Uri a() {
        return (Uri) this.f17583b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y8.m a0(y8.m r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            android.graphics.Bitmap$Config r2 = r0.f41390b
            y8.b r3 = r0.f41403o
            boolean r4 = yk.o.S(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f17585d
            d9.h r4 = (d9.h) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r8 = r2
            r4 = r5
            goto L21
        L1f:
            r4 = 0
            r8 = r2
        L21:
            y8.b r2 = r0.f41403o
            boolean r2 = r2.f41299a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f17584c
            d9.l r2 = (d9.l) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f14243e     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            y8.b r3 = y8.b.f41297d
            r21 = r3
            goto L3f
        L39:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L3c:
            r21 = r3
            r5 = r4
        L3f:
            if (r5 == 0) goto L6d
            android.content.Context r7 = r0.f41389a
            android.graphics.ColorSpace r9 = r0.f41391c
            z8.g r10 = r0.f41392d
            z8.f r11 = r0.f41393e
            boolean r12 = r0.f41394f
            boolean r13 = r0.f41395g
            boolean r14 = r0.f41396h
            java.lang.String r15 = r0.f41397i
            okhttp3.Headers r2 = r0.f41398j
            y8.q r3 = r0.f41399k
            y8.n r4 = r0.f41400l
            y8.b r5 = r0.f41401m
            y8.b r0 = r0.f41402n
            y8.m r22 = new y8.m
            r6 = r22
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r22
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a0(y8.m):y8.m");
    }

    @Override // b7.b0
    public final void b(e5.p pVar) {
        long c10;
        long j10;
        long j11;
        yk.j.I0((e5.u) this.f17584c);
        int i10 = e5.x.f15050a;
        e5.u uVar = (e5.u) this.f17584c;
        synchronized (uVar) {
            try {
                long j12 = uVar.f15047c;
                if (j12 != -9223372036854775807L) {
                    c10 = j12 + uVar.f15046b;
                } else {
                    c10 = uVar.c();
                }
                j10 = c10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e5.u uVar2 = (e5.u) this.f17584c;
        synchronized (uVar2) {
            j11 = uVar2.f15046b;
        }
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            b5.v vVar = (b5.v) this.f17583b;
            if (j11 != vVar.f3656p) {
                b5.u a10 = vVar.a();
                a10.f3604o = j11;
                b5.v vVar2 = new b5.v(a10);
                this.f17583b = vVar2;
                ((z5.b0) this.f17585d).e(vVar2);
            }
            int a11 = pVar.a();
            ((z5.b0) this.f17585d).c(a11, pVar);
            ((z5.b0) this.f17585d).b(j10, 1, a11, 0, null);
        }
    }

    @Override // b7.b0
    public final void c(e5.u uVar, z5.r rVar, b7.h0 h0Var) {
        this.f17584c = uVar;
        h0Var.a();
        h0Var.b();
        z5.b0 f10 = rVar.f(h0Var.f3872d, 5);
        this.f17585d = f10;
        f10.e((b5.v) this.f17583b);
    }

    @Override // g4.g
    public final void d() {
    }

    @Override // g4.g
    public final Uri e() {
        return (Uri) this.f17585d;
    }

    @Override // g4.g
    public final ClipDescription f() {
        return (ClipDescription) this.f17584c;
    }

    @Override // p7.c
    public final p7.d g(p7.b bVar) {
        return new l7.w(bVar.f30720a, (String) this.f17583b, (File) this.f17584c, bVar.f30722c.f25500b, ((p7.c) this.f17585d).g(bVar));
    }

    @Override // g4.g
    public final Object h() {
        return null;
    }

    public final f3.c j() {
        w2.e eVar = (w2.e) this.f17583b;
        if (eVar != null) {
            return new f3.e(eVar.f38783a);
        }
        String str = (String) this.f17584c;
        if (str != null) {
            return f3.h.k(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.f17585d) + ". Using WrapContent.");
        return f3.h.k("wrap");
    }

    public final void l(Function1 function1) {
        k1 k1Var;
        Object value;
        g7.c0 c0Var;
        tu.q0 q0Var = (tu.q0) this.f17584c;
        do {
            k1Var = (k1) q0Var;
            value = k1Var.getValue();
            g7.c0 c0Var2 = (g7.c0) value;
            c0Var = (g7.c0) function1.invoke(c0Var2);
            if (Intrinsics.a(c0Var2, c0Var)) {
                return;
            }
        } while (!k1Var.l(value, c0Var));
        if (c0Var != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f17583b).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(c0Var);
            }
        }
    }

    public final void n(Runnable runnable) {
        ((k8.j) this.f17583b).execute(runnable);
    }

    public final float o(f3.c cVar) {
        if (cVar instanceof f3.h) {
            String e10 = ((f3.h) cVar).e();
            if (((HashMap) this.f17584c).containsKey(e10)) {
                return ((g3.d) ((HashMap) this.f17584c).get(e10)).value();
            }
            if (((HashMap) this.f17583b).containsKey(e10)) {
                return ((Integer) ((HashMap) this.f17583b).get(e10)).floatValue();
            }
            return s0.g.f34069a;
        }
        if (cVar instanceof f3.e) {
            return ((f3.e) cVar).g();
        }
        return s0.g.f34069a;
    }

    public final z0 p(b1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return (z0) this.f17585d;
                }
                throw new NoWhenBranchMatchedException();
            }
            return (z0) this.f17584c;
        }
        return (z0) this.f17583b;
    }

    public final boolean q(int i10, boolean z10) {
        return ((TypedArray) this.f17584c).getBoolean(i10, z10);
    }

    public final ColorStateList r(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (((TypedArray) this.f17584c).hasValue(i10) && (resourceId = ((TypedArray) this.f17584c).getResourceId(i10, 0)) != 0 && (colorStateList = r3.k.getColorStateList((Context) this.f17583b, resourceId)) != null) {
            return colorStateList;
        }
        return ((TypedArray) this.f17584c).getColorStateList(i10);
    }

    public final long s() {
        Object obj = this.f17585d;
        if (((z5.q) obj) != null) {
            return ((z5.q) obj).getPosition();
        }
        return -1L;
    }

    public final int t(int i10, int i11) {
        return ((TypedArray) this.f17584c).getDimensionPixelOffset(i10, i11);
    }

    public final String toString() {
        switch (this.f17582a) {
            case 5:
                String str = "[ ";
                if (((c3.g) this.f17583b) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder p10 = da.e.p(str);
                        p10.append(((c3.g) this.f17583b).f7935h[i10]);
                        p10.append(" ");
                        str = p10.toString();
                    }
                }
                StringBuilder r10 = da.e.r(str, "] ");
                r10.append((c3.g) this.f17583b);
                return r10.toString();
            case 19:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f17583b) != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf((Uri) this.f17583b));
                }
                if (((String) this.f17584c) != null) {
                    sb2.append(" action=");
                    sb2.append((String) this.f17584c);
                }
                if (((String) this.f17585d) != null) {
                    sb2.append(" mimetype=");
                    sb2.append((String) this.f17585d);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
                return sb3;
            default:
                return super.toString();
        }
    }

    public final int u(int i10, int i11) {
        return ((TypedArray) this.f17584c).getDimensionPixelSize(i10, i11);
    }

    public final Drawable v(int i10) {
        int resourceId;
        if (((TypedArray) this.f17584c).hasValue(i10) && (resourceId = ((TypedArray) this.f17584c).getResourceId(i10, 0)) != 0) {
            return iu.j.m((Context) this.f17583b, resourceId);
        }
        return ((TypedArray) this.f17584c).getDrawable(i10);
    }

    public final Drawable w(int i10) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f17584c).hasValue(i10) && (resourceId = ((TypedArray) this.f17584c).getResourceId(i10, 0)) != 0) {
            m.x a10 = m.x.a();
            Context context = (Context) this.f17583b;
            synchronized (a10) {
                f10 = a10.f25797a.f(context, resourceId, true);
            }
            return f10;
        }
        return null;
    }

    public final z5.p x(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f17584c)) {
            if (((AtomicBoolean) this.f17584c).get()) {
                constructor = (Constructor) this.f17585d;
            } else {
                try {
                    try {
                        constructor = ((j5.d) ((z5.m) this.f17583b)).g();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f17584c).set(true);
                        constructor = (Constructor) this.f17585d;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (z5.p) constructor.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public final Typeface y(int i10, int i11, m.t0 t0Var) {
        int resourceId = ((TypedArray) this.f17584c).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f17585d) == null) {
            this.f17585d = new TypedValue();
        }
        Context context = (Context) this.f17583b;
        TypedValue typedValue = (TypedValue) this.f17585d;
        ThreadLocal threadLocal = t3.p.f35324a;
        if (context.isRestricted()) {
            return null;
        }
        return t3.p.b(context, resourceId, typedValue, i11, t0Var, true, false);
    }

    public final int z(int i10, int i11) {
        return ((TypedArray) this.f17584c).getInt(i10, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Intent intent) {
        this(19, intent.getData(), intent.getAction(), intent.getType());
        this.f17582a = 19;
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, String str2) {
        this(4, null, str, str2);
        this.f17582a = 4;
    }

    public c(n8.i iVar, d9.l lVar) {
        Object jVar;
        this.f17582a = 29;
        this.f17583b = iVar;
        this.f17584c = lVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (!d9.a.f14214a) {
                if (i10 != 26 && i10 != 27) {
                    jVar = new d9.j(true);
                } else {
                    jVar = new Object();
                }
                this.f17585d = jVar;
            }
        } else {
            boolean z10 = d9.a.f14214a;
        }
        jVar = new d9.j(false);
        this.f17585d = jVar;
    }

    public c(l7.s sVar) {
        this.f17582a = 27;
        this.f17583b = sVar;
        this.f17584c = new j8.b(this, sVar, 2);
        this.f17585d = new j8.h(this, sVar, 2);
    }

    public c(androidx.lifecycle.t provider) {
        this.f17582a = 10;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f17583b = new androidx.lifecycle.v(provider);
        this.f17584c = new Handler();
    }

    public c(h1 store, d1 factory, y4.c extras) {
        this.f17582a = 11;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f17583b = store;
        this.f17584c = factory;
        this.f17585d = extras;
    }

    public c(ExecutorService executorService) {
        this.f17582a = 28;
        this.f17584c = new Handler(Looper.getMainLooper());
        this.f17585d = new m8.b(this, 0);
        this.f17583b = new k8.j(executorService);
    }

    public c(c3.f fVar, c3.f fVar2) {
        this.f17582a = 5;
        this.f17585d = fVar;
        this.f17584c = fVar2;
    }

    public c(String str) {
        this.f17582a = 18;
        b5.u uVar = new b5.u();
        uVar.f3600k = str;
        this.f17583b = new b5.v(uVar);
    }

    public c(z5.s sVar) {
        this.f17582a = 15;
        this.f17583b = sVar;
    }

    public c(Context context, TypedArray typedArray) {
        this.f17582a = 2;
        this.f17583b = context;
        this.f17584c = typedArray;
    }

    public c(Context context, LocationManager locationManager) {
        this.f17582a = 1;
        this.f17585d = new Object();
        this.f17583b = context;
        this.f17584c = locationManager;
    }

    public c(j3.e eVar) {
        this.f17582a = 7;
        this.f17583b = new ArrayList();
        this.f17584c = new Object();
        this.f17585d = eVar;
    }

    public c(int i10, int i11) {
        this.f17582a = i10;
        if (i10 != 12) {
            if (i10 != 26) {
                switch (i10) {
                    case 20:
                        this.f17583b = new ReentrantLock();
                        this.f17584c = l1.a(a1.f16645f);
                        this.f17585d = new g7.d();
                        return;
                    case 21:
                        this.f17583b = new CopyOnWriteArrayList();
                        k1 a10 = l1.a(null);
                        this.f17584c = a10;
                        this.f17585d = new tu.s0(a10);
                        return;
                    case 22:
                        y0 y0Var = y0.f17134c;
                        this.f17583b = y0Var;
                        this.f17584c = y0Var;
                        this.f17585d = y0Var;
                        return;
                    default:
                        this.f17583b = new HashMap();
                        this.f17584c = new HashMap();
                        this.f17585d = new HashMap();
                        return;
                }
            }
            this.f17583b = Collections.emptyList();
            this.f17584c = Collections.emptyList();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(c5.c[] r5) {
        /*
            r4 = this;
            r0 = 13
            r4.f17582a = r0
            k5.j0 r0 = new k5.j0
            r0.<init>()
            c5.f r1 = new c5.f
            r1.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f7987c = r2
            r1.f7988d = r2
            c5.b r2 = c5.b.f7951e
            r1.f7989e = r2
            r1.f7990f = r2
            r1.f7991g = r2
            r1.f7992h = r2
            java.nio.ByteBuffer r2 = c5.c.f7956a
            r1.f7995k = r2
            java.nio.ShortBuffer r3 = r2.asShortBuffer()
            r1.f7996l = r3
            r1.f7997m = r2
            r2 = -1
            r1.f7986b = r2
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.<init>(c5.c[]):void");
    }

    public c(c5.c[] cVarArr, k5.j0 j0Var, c5.f fVar) {
        this.f17582a = 13;
        c5.c[] cVarArr2 = new c5.c[cVarArr.length + 2];
        this.f17583b = cVarArr2;
        System.arraycopy(cVarArr, 0, cVarArr2, 0, cVarArr.length);
        this.f17584c = j0Var;
        this.f17585d = fVar;
        c5.c[] cVarArr3 = (c5.c[]) this.f17583b;
        cVarArr3[cVarArr.length] = j0Var;
        cVarArr3[cVarArr.length + 1] = fVar;
    }

    public c(o2.t0 t0Var, c cVar) {
        this.f17582a = 3;
        this.f17583b = t0Var;
        this.f17584c = cVar;
        this.f17585d = t0Var.getValue();
    }

    public c(j5.d dVar) {
        this.f17582a = 16;
        this.f17583b = dVar;
        this.f17584c = new AtomicBoolean(false);
    }

    public c(n5.g gVar) {
        this.f17582a = 14;
        this.f17585d = gVar;
        this.f17583b = new HashSet();
    }

    public c(int i10) {
        this.f17582a = 9;
        this.f17583b = new String[i10];
        this.f17584c = new int[i10];
        this.f17585d = new int[i10];
    }
}
