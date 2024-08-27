package i1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.e;
import com.webengage.sdk.android.z0;
import d2.a0;
import d2.a3;
import d2.c3;
import d4.y2;
import f2.d;
import f2.i;
import h2.o;
import hl.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t.g;
import t.k;
import t.t;
import t.u;

/* loaded from: classes.dex */
public final class c implements e, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f19312a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f19313b;

    /* renamed from: c, reason: collision with root package name */
    public d f19314c;

    /* renamed from: d, reason: collision with root package name */
    public final t f19315d = new t();

    /* renamed from: e, reason: collision with root package name */
    public final u f19316e = new u();

    /* renamed from: f, reason: collision with root package name */
    public final long f19317f = 100;

    /* renamed from: g, reason: collision with root package name */
    public int f19318g = 1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19319h = true;

    /* renamed from: i, reason: collision with root package name */
    public final g f19320i = new g(0);

    /* renamed from: j, reason: collision with root package name */
    public final su.c f19321j = f.a(1, null, 6);

    /* renamed from: k, reason: collision with root package name */
    public final Handler f19322k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public t f19323l;

    /* renamed from: m, reason: collision with root package name */
    public long f19324m;

    /* renamed from: n, reason: collision with root package name */
    public final t f19325n;

    /* renamed from: o, reason: collision with root package name */
    public a3 f19326o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19327p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.activity.b f19328q;

    public c(a0 a0Var, l1.d dVar) {
        this.f19312a = a0Var;
        this.f19313b = dVar;
        t tVar = k.f34874a;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f19323l = tVar;
        this.f19325n = new t();
        o a10 = a0Var.getSemanticsOwner().a();
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f19326o = new a3(a10, tVar);
        this.f19328q = new androidx.activity.b(this, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(yt.a r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof i1.b
            if (r0 == 0) goto L13
            r0 = r9
            i1.b r0 = (i1.b) r0
            int r1 = r0.f19311e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19311e = r1
            goto L18
        L13:
            i1.b r0 = new i1.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f19309c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f19311e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            su.b r2 = r0.f19308b
            i1.c r5 = r0.f19307a
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            su.b r2 = r0.f19308b
            i1.c r5 = r0.f19307a
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            ut.n.b(r9)
            su.c r9 = r8.f19321j     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            su.b r2 = new su.b     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f19307a = r5     // Catch: java.lang.Throwable -> L2e
            r0.f19308b = r2     // Catch: java.lang.Throwable -> L2e
            r0.f19311e = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.i()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.j()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f19327p     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f19327p = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f19322k     // Catch: java.lang.Throwable -> L2e
            androidx.activity.b r6 = r5.f19328q     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            t.g r9 = r5.f19320i     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f19317f     // Catch: java.lang.Throwable -> L2e
            r0.f19307a = r5     // Catch: java.lang.Throwable -> L2e
            r0.f19308b = r2     // Catch: java.lang.Throwable -> L2e
            r0.f19311e = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = kp.j.K(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            t.g r9 = r5.f19320i
            r9.clear()
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            t.g r0 = r5.f19320i
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.a(yt.a):java.lang.Object");
    }

    @Override // androidx.lifecycle.e
    public final void d(androidx.lifecycle.t tVar) {
        o(this.f19312a.getSemanticsOwner().a());
        j();
        this.f19314c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r15) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.e(int):void");
    }

    @Override // androidx.lifecycle.e
    public final void g(androidx.lifecycle.t tVar) {
        this.f19314c = (d) this.f19313b.mo2invoke();
        n(this.f19312a.getSemanticsOwner().a());
        j();
    }

    public final t h() {
        if (this.f19319h) {
            this.f19319h = false;
            this.f19323l = c3.a(this.f19312a.getSemanticsOwner());
            this.f19324m = System.currentTimeMillis();
        }
        return this.f19323l;
    }

    public final boolean i() {
        return this.f19314c != null;
    }

    public final void j() {
        String str;
        String str2;
        d dVar = this.f19314c;
        if (dVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        t tVar = this.f19315d;
        int i10 = tVar.f34903e;
        Object obj = dVar.f15906a;
        String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i11 = 0;
        View view = dVar.f15907b;
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = tVar.f34901c;
            long[] jArr = tVar.f34899a;
            int length = jArr.length - 2;
            if (length < 0) {
                str2 = "TREAT_AS_VIEW_TREE_APPEARED";
            } else {
                int i12 = 0;
                while (true) {
                    long j11 = jArr[i12];
                    str2 = str3;
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j11 & 255) < 128) {
                                arrayList.add((i) objArr[(i12 << 3) + i14]);
                            }
                            j11 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    str3 = str2;
                    j10 = -9187201950435737472L;
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList2.add(((i) arrayList.get(i15)).f15908a);
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 34) {
                f2.c.a(y2.h(obj), arrayList2);
            } else if (i16 >= 29) {
                ViewStructure b10 = f2.b.b(y2.h(obj), view);
                f2.a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                f2.b.d(y2.h(obj), b10);
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    f2.b.d(y2.h(obj), (ViewStructure) arrayList2.get(i17));
                }
                ViewStructure b11 = f2.b.b(y2.h(obj), view);
                str3 = str2;
                f2.a.a(b11).putBoolean(str3, true);
                f2.b.d(y2.h(obj), b11);
                tVar.a();
            }
            str3 = str2;
            tVar.a();
        }
        u uVar = this.f19316e;
        if (uVar.f34908d != 0) {
            ArrayList arrayList3 = new ArrayList();
            int[] iArr = uVar.f34906b;
            long[] jArr2 = uVar.f34905a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j12 = jArr2[i18];
                    long[] jArr3 = jArr2;
                    str = str3;
                    if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j12 & 255) < 128) {
                                arrayList3.add(Integer.valueOf(iArr[(i18 << 3) + i20]));
                            }
                            j12 >>= 8;
                        }
                        if (i19 != 8) {
                            break;
                        }
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    jArr2 = jArr3;
                    str3 = str;
                    c10 = 7;
                }
            } else {
                str = str3;
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i21 = 0; i21 < size2; i21++) {
                arrayList4.add(Long.valueOf(((Number) arrayList3.get(i21)).intValue()));
            }
            Intrinsics.checkNotNullParameter(arrayList4, "<this>");
            long[] jArr4 = new long[arrayList4.size()];
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                jArr4[i11] = ((Number) it.next()).longValue();
                i11++;
            }
            int i22 = Build.VERSION.SDK_INT;
            if (i22 >= 34) {
                ContentCaptureSession h10 = y2.h(obj);
                e4.k T = t0.t.T(view);
                Objects.requireNonNull(T);
                f2.b.f(h10, z0.f(T.f14993a), jArr4);
            } else if (i22 >= 29) {
                ViewStructure b12 = f2.b.b(y2.h(obj), view);
                f2.a.a(b12).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                f2.b.d(y2.h(obj), b12);
                ContentCaptureSession h11 = y2.h(obj);
                e4.k T2 = t0.t.T(view);
                Objects.requireNonNull(T2);
                f2.b.f(h11, z0.f(T2.f14993a), jArr4);
                ViewStructure b13 = f2.b.b(y2.h(obj), view);
                f2.a.a(b13).putBoolean(str, true);
                f2.b.d(y2.h(obj), b13);
            }
            uVar.b();
        }
    }

    public final void k(o oVar, a3 a3Var) {
        List g10 = o.g(oVar, true, 4);
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar2 = (o) g10.get(i10);
            if (h().b(oVar2.f17865g) && !a3Var.f13353b.c(oVar2.f17865g)) {
                n(oVar2);
            }
        }
        t tVar = this.f19325n;
        int[] iArr = tVar.f34900b;
        long[] jArr = tVar.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            if (!h().b(i14)) {
                                e(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        List g11 = o.g(oVar, true, 4);
        int size2 = g11.size();
        for (int i15 = 0; i15 < size2; i15++) {
            o oVar3 = (o) g11.get(i15);
            if (h().b(oVar3.f17865g)) {
                int i16 = oVar3.f17865g;
                if (tVar.b(i16)) {
                    Object g12 = tVar.g(i16);
                    if (g12 != null) {
                        k(oVar3, (a3) g12);
                    } else {
                        t0.t.D0("node not present in pruned tree before this change");
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i10, String str) {
        d dVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || (dVar = this.f19314c) == null) {
            return;
        }
        AutofillId a10 = dVar.a(i10);
        if (a10 != null) {
            if (i11 >= 29) {
                f2.b.e(y2.h(dVar.f15906a), a10, str);
                return;
            }
            return;
        }
        t0.t.D0("Invalid content capture ID");
        throw null;
    }

    public final void m(o oVar, a3 a3Var) {
        u uVar = new u();
        List g10 = o.g(oVar, true, 4);
        int size = g10.size();
        int i10 = 0;
        while (true) {
            su.c cVar = this.f19321j;
            g gVar = this.f19320i;
            androidx.compose.ui.node.a aVar = oVar.f17861c;
            if (i10 < size) {
                o oVar2 = (o) g10.get(i10);
                if (h().b(oVar2.f17865g)) {
                    u uVar2 = a3Var.f13353b;
                    int i11 = oVar2.f17865g;
                    if (!uVar2.c(i11)) {
                        if (gVar.add(aVar)) {
                            cVar.o(Unit.f23355a);
                            return;
                        }
                        return;
                    }
                    uVar.a(i11);
                }
                i10++;
            } else {
                u uVar3 = a3Var.f13353b;
                int[] iArr = uVar3.f34906b;
                long[] jArr = uVar3.f34905a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128 && !uVar.c(iArr[(i12 << 3) + i14])) {
                                    if (gVar.add(aVar)) {
                                        cVar.o(Unit.f23355a);
                                        return;
                                    }
                                    return;
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                List g11 = o.g(oVar, true, 4);
                int size2 = g11.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    o oVar3 = (o) g11.get(i15);
                    if (h().b(oVar3.f17865g)) {
                        Object g12 = this.f19325n.g(oVar3.f17865g);
                        if (g12 != null) {
                            m(oVar3, (a3) g12);
                        } else {
                            t0.t.D0("node not present in pruned tree before this change");
                            throw null;
                        }
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0201, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0203, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(h2.o r21) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.n(h2.o):void");
    }

    public final void o(o oVar) {
        if (!i()) {
            return;
        }
        e(oVar.f17865g);
        List j10 = oVar.j();
        int size = j10.size();
        for (int i10 = 0; i10 < size; i10++) {
            o((o) j10.get(i10));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f19322k.removeCallbacks(this.f19328q);
        this.f19314c = null;
    }
}
