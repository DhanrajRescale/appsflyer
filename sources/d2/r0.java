package d2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends d4.c {
    public static final t.s N;
    public t.t A;
    public final t.u B;
    public final t.t C;
    public final t.t D;
    public final String E;
    public final String F;
    public final r2.h G;
    public final t.t H;
    public a3 I;
    public boolean J;
    public final androidx.activity.b K;
    public final ArrayList L;
    public final n0 M;

    /* renamed from: d */
    public final a0 f13578d;

    /* renamed from: e */
    public int f13579e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final n0 f13580f = new n0(this, 0);

    /* renamed from: g */
    public final AccessibilityManager f13581g;

    /* renamed from: h */
    public long f13582h;

    /* renamed from: i */
    public final c0 f13583i;

    /* renamed from: j */
    public final d0 f13584j;

    /* renamed from: k */
    public List f13585k;

    /* renamed from: l */
    public final Handler f13586l;

    /* renamed from: m */
    public final e4.k f13587m;

    /* renamed from: n */
    public int f13588n;

    /* renamed from: o */
    public AccessibilityNodeInfo f13589o;

    /* renamed from: p */
    public boolean f13590p;

    /* renamed from: q */
    public final t.t f13591q;

    /* renamed from: r */
    public final t.t f13592r;

    /* renamed from: s */
    public final t.k0 f13593s;

    /* renamed from: t */
    public final t.k0 f13594t;

    /* renamed from: u */
    public int f13595u;

    /* renamed from: v */
    public Integer f13596v;

    /* renamed from: w */
    public final t.g f13597w;

    /* renamed from: x */
    public final su.c f13598x;

    /* renamed from: y */
    public boolean f13599y;

    /* renamed from: z */
    public i0 f13600z;

    static {
        int i10;
        int[] elements = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i11 = t.j.f34870a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        t.s sVar = new t.s(32);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i12 = sVar.f34898b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i12 >= 0 && i12 <= (i10 = sVar.f34898b)) {
            sVar.c(i10 + 32);
            int[] iArr = sVar.f34897a;
            int i13 = sVar.f34898b;
            if (i12 != i13) {
                vt.t.c(i12 + 32, i12, i13, iArr, iArr);
            }
            vt.t.g(elements, iArr, i12, 0, 12);
            sVar.f34898b += 32;
            N = sVar;
            return;
        }
        StringBuilder n10 = a3.a.n("Index ", i12, " must be in 0..");
        n10.append(sVar.f34898b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [d2.c0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [d2.d0] */
    public r0(a0 a0Var) {
        this.f13578d = a0Var;
        Object systemService = a0Var.getContext().getSystemService("accessibility");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f13581g = accessibilityManager;
        this.f13582h = 100L;
        this.f13583i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: d2.c0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                List<AccessibilityServiceInfo> list;
                r0 r0Var = r0.this;
                if (z10) {
                    list = r0Var.f13581g.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = vt.i0.f38321a;
                }
                r0Var.f13585k = list;
            }
        };
        this.f13584j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: d2.d0
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                r0 r0Var = r0.this;
                r0Var.f13585k = r0Var.f13581g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f13585k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f13586l = new Handler(Looper.getMainLooper());
        this.f13587m = new e4.k(new g0(this));
        this.f13588n = Integer.MIN_VALUE;
        this.f13591q = new t.t();
        this.f13592r = new t.t();
        this.f13593s = new t.k0(0);
        this.f13594t = new t.k0(0);
        this.f13595u = -1;
        this.f13597w = new t.g(0);
        this.f13598x = hl.f.a(1, null, 6);
        this.f13599y = true;
        t.t tVar = t.k.f34874a;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A = tVar;
        this.B = new t.u();
        this.C = new t.t();
        this.D = new t.t();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new r2.h();
        this.H = new t.t();
        h2.o a10 = a0Var.getSemanticsOwner().a();
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new a3(a10, tVar);
        a0Var.addOnAttachStateChangeListener(new l.f(this, 2));
        this.K = new androidx.activity.b(this, 8);
        this.L = new ArrayList();
        this.M = new n0(this, 1);
    }

    public static final boolean A(h2.h hVar, float f10) {
        Function0 function0 = hVar.f17822a;
        if ((f10 < s0.g.f34069a && ((Number) function0.mo2invoke()).floatValue() > s0.g.f34069a) || (f10 > s0.g.f34069a && ((Number) function0.mo2invoke()).floatValue() < ((Number) hVar.f17823b.mo2invoke()).floatValue())) {
            return true;
        }
        return false;
    }

    public static final boolean B(h2.h hVar) {
        Function0 function0 = hVar.f17822a;
        float floatValue = ((Number) function0.mo2invoke()).floatValue();
        boolean z10 = hVar.f17824c;
        if ((floatValue > s0.g.f34069a && !z10) || (((Number) function0.mo2invoke()).floatValue() < ((Number) hVar.f17823b.mo2invoke()).floatValue() && z10)) {
            return true;
        }
        return false;
    }

    public static final boolean C(h2.h hVar) {
        Function0 function0 = hVar.f17822a;
        float floatValue = ((Number) function0.mo2invoke()).floatValue();
        float floatValue2 = ((Number) hVar.f17823b.mo2invoke()).floatValue();
        boolean z10 = hVar.f17824c;
        if ((floatValue < floatValue2 && !z10) || (((Number) function0.mo2invoke()).floatValue() > s0.g.f34069a && z10)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void H(r0 r0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        r0Var.G(i10, i11, num, null);
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i10);
                Intrinsics.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean t(h2.o oVar) {
        boolean z10;
        i2.a aVar = (i2.a) hl.f.m0(oVar.f17862d, h2.r.D);
        h2.u uVar = h2.r.f17901u;
        h2.j jVar = oVar.f17862d;
        h2.g gVar = (h2.g) hl.f.m0(jVar, uVar);
        boolean z11 = true;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = jVar.f17850a.get(h2.r.C);
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            if (gVar != null && h2.g.a(gVar.f17821a, 4)) {
                z11 = z10;
            }
            return z11;
        }
        return z10;
    }

    public static j2.e v(h2.o oVar) {
        Object obj = oVar.f17862d.f17850a.get(h2.r.f17906z);
        j2.e eVar = null;
        if (obj == null) {
            obj = null;
        }
        j2.e eVar2 = (j2.e) obj;
        List list = (List) hl.f.m0(oVar.f17862d, h2.r.f17903w);
        if (list != null) {
            eVar = (j2.e) vt.g0.w(list);
        }
        if (eVar2 == null) {
            return eVar;
        }
        return eVar2;
    }

    public static String w(h2.o oVar) {
        j2.e eVar;
        if (oVar == null) {
            return null;
        }
        h2.u uVar = h2.r.f17882b;
        h2.j jVar = oVar.f17862d;
        if (jVar.f17850a.containsKey(uVar)) {
            return yk.j.T0((List) jVar.e(uVar), ",", null, 62);
        }
        h2.u uVar2 = h2.i.f17832h;
        LinkedHashMap linkedHashMap = jVar.f17850a;
        if (linkedHashMap.containsKey(uVar2)) {
            Object obj = linkedHashMap.get(h2.r.f17906z);
            if (obj == null) {
                obj = null;
            }
            j2.e eVar2 = (j2.e) obj;
            if (eVar2 == null) {
                return null;
            }
            return eVar2.f20699a;
        }
        Object obj2 = linkedHashMap.get(h2.r.f17903w);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (eVar = (j2.e) vt.g0.w(list)) == null) {
            return null;
        }
        return eVar.f20699a;
    }

    public final int D(int i10) {
        if (i10 == this.f13578d.getSemanticsOwner().a().f17865g) {
            return -1;
        }
        return i10;
    }

    public final void E(h2.o oVar, a3 a3Var) {
        int[] iArr = t.l.f34879a;
        t.u uVar = new t.u();
        List g10 = h2.o.g(oVar, true, 4);
        int size = g10.size();
        int i10 = 0;
        while (true) {
            androidx.compose.ui.node.a aVar = oVar.f17861c;
            if (i10 < size) {
                h2.o oVar2 = (h2.o) g10.get(i10);
                if (s().b(oVar2.f17865g)) {
                    t.u uVar2 = a3Var.f13353b;
                    int i11 = oVar2.f17865g;
                    if (!uVar2.c(i11)) {
                        z(aVar);
                        return;
                    }
                    uVar.a(i11);
                }
                i10++;
            } else {
                t.u uVar3 = a3Var.f13353b;
                int[] iArr2 = uVar3.f34906b;
                long[] jArr = uVar3.f34905a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128 && !uVar.c(iArr2[(i12 << 3) + i14])) {
                                    z(aVar);
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
                List g11 = h2.o.g(oVar, true, 4);
                int size2 = g11.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    h2.o oVar3 = (h2.o) g11.get(i15);
                    if (s().b(oVar3.f17865g)) {
                        Object g12 = this.H.g(oVar3.f17865g);
                        Intrinsics.c(g12);
                        E(oVar3, (a3) g12);
                    }
                }
                return;
            }
        }
    }

    public final boolean F(AccessibilityEvent accessibilityEvent) {
        if (!x()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f13590p = true;
        }
        try {
            return ((Boolean) this.f13580f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f13590p = false;
        }
    }

    public final boolean G(int i10, int i11, Integer num, List list) {
        if (i10 != Integer.MIN_VALUE && x()) {
            AccessibilityEvent n10 = n(i10, i11);
            if (num != null) {
                n10.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                n10.setContentDescription(yk.j.T0(list, ",", null, 62));
            }
            return F(n10);
        }
        return false;
    }

    public final void I(int i10, int i11, String str) {
        AccessibilityEvent n10 = n(D(i10), 32);
        n10.setContentChangeTypes(i11);
        if (str != null) {
            n10.getText().add(str);
        }
        F(n10);
    }

    public final void J(int i10) {
        i0 i0Var = this.f13600z;
        if (i0Var != null) {
            h2.o oVar = i0Var.f13451a;
            if (i10 != oVar.f17865g) {
                return;
            }
            if (SystemClock.uptimeMillis() - i0Var.f13456f <= 1000) {
                AccessibilityEvent n10 = n(D(oVar.f17865g), 131072);
                n10.setFromIndex(i0Var.f13454d);
                n10.setToIndex(i0Var.f13455e);
                n10.setAction(i0Var.f13452b);
                n10.setMovementGranularity(i0Var.f13453c);
                n10.getText().add(w(oVar));
                F(n10);
            }
        }
        this.f13600z = null;
    }

    public final void K(androidx.compose.ui.node.a aVar, t.u uVar) {
        h2.j n10;
        androidx.compose.ui.node.a R;
        if (!aVar.C() || this.f13578d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            return;
        }
        t.g gVar = this.f13597w;
        int i10 = gVar.f34858c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (c3.d((androidx.compose.ui.node.a) gVar.f34857b[i11], aVar)) {
                return;
            }
        }
        if (!aVar.f1422w.d(8)) {
            aVar = t0.t.R(aVar, s.f13608f);
        }
        if (aVar != null && (n10 = aVar.n()) != null) {
            if (!n10.f17851b && (R = t0.t.R(aVar, s.f13607e)) != null) {
                aVar = R;
            }
            int i12 = aVar.f1401b;
            if (!uVar.a(i12)) {
                return;
            }
            H(this, D(i12), 2048, 1, 8);
        }
    }

    public final void L(androidx.compose.ui.node.a aVar) {
        if (!aVar.C() || this.f13578d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            return;
        }
        int i10 = aVar.f1401b;
        h2.h hVar = (h2.h) this.f13591q.g(i10);
        h2.h hVar2 = (h2.h) this.f13592r.g(i10);
        if (hVar == null && hVar2 == null) {
            return;
        }
        AccessibilityEvent n10 = n(i10, 4096);
        if (hVar != null) {
            n10.setScrollX((int) ((Number) hVar.f17822a.mo2invoke()).floatValue());
            n10.setMaxScrollX((int) ((Number) hVar.f17823b.mo2invoke()).floatValue());
        }
        if (hVar2 != null) {
            n10.setScrollY((int) ((Number) hVar2.f17822a.mo2invoke()).floatValue());
            n10.setMaxScrollY((int) ((Number) hVar2.f17823b.mo2invoke()).floatValue());
        }
        F(n10);
    }

    public final boolean M(h2.o oVar, int i10, int i11, boolean z10) {
        String w10;
        Integer num;
        Integer num2;
        h2.u uVar = h2.i.f17831g;
        h2.j jVar = oVar.f17862d;
        boolean z11 = false;
        if (jVar.f17850a.containsKey(uVar) && t0.t.o(oVar)) {
            hu.c cVar = (hu.c) ((h2.a) jVar.e(uVar)).f17810b;
            if (cVar == null) {
                return false;
            }
            return ((Boolean) cVar.b(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        }
        if ((i10 == i11 && i11 == this.f13595u) || (w10 = w(oVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > w10.length()) {
            i10 = -1;
        }
        this.f13595u = i10;
        if (w10.length() > 0) {
            z11 = true;
        }
        int i12 = oVar.f17865g;
        int D = D(i12);
        Integer num3 = null;
        if (z11) {
            num = Integer.valueOf(this.f13595u);
        } else {
            num = null;
        }
        if (z11) {
            num2 = Integer.valueOf(this.f13595u);
        } else {
            num2 = null;
        }
        if (z11) {
            num3 = Integer.valueOf(w10.length());
        }
        F(o(D, num, num2, num3, w10));
        J(i12);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[LOOP:1: B:8:0x0030->B:26:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[EDGE_INSN: B:27:0x00d4->B:34:0x00d4 BREAK  A[LOOP:1: B:8:0x0030->B:26:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList N(java.util.ArrayList r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.r0.N(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    @Override // d4.c
    public final e4.k b(View view) {
        return this.f13587m;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r17, android.view.accessibility.AccessibilityNodeInfo r18, java.lang.String r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.r0.j(int, android.view.accessibility.AccessibilityNodeInfo, java.lang.String, android.os.Bundle):void");
    }

    public final Rect k(b3 b3Var) {
        Rect rect = b3Var.f13371b;
        long g10 = t0.t.g(rect.left, rect.top);
        a0 a0Var = this.f13578d;
        long t10 = a0Var.t(g10);
        long t11 = a0Var.t(t0.t.g(rect.right, rect.bottom));
        return new Rect((int) Math.floor(m1.c.d(t10)), (int) Math.floor(m1.c.e(t10)), (int) Math.ceil(m1.c.d(t11)), (int) Math.ceil(m1.c.e(t11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002c, B:14:0x005a, B:19:0x006d, B:21:0x0075, B:24:0x0080, B:26:0x0085, B:28:0x0094, B:30:0x009b, B:31:0x00a4, B:40:0x0043), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bf -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(yt.a r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.r0.l(yt.a):java.lang.Object");
    }

    public final boolean m(int i10, long j10, boolean z10) {
        h2.u uVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i11;
        h2.h hVar;
        int i12;
        int i13 = 0;
        if (!Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        t.t s7 = s();
        if (!m1.c.b(j10, m1.c.f27235d) && m1.c.f(j10)) {
            if (z10) {
                uVar = h2.r.f17898r;
            } else if (!z10) {
                uVar = h2.r.f17897q;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr3 = s7.f34901c;
            long[] jArr3 = s7.f34899a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    long j11 = jArr3[i14];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = i13;
                        while (i17 < i16) {
                            if ((j11 & 255) < 128) {
                                b3 b3Var = (b3) objArr3[(i14 << 3) + i17];
                                Rect rect = b3Var.f13371b;
                                float f10 = rect.left;
                                jArr2 = jArr3;
                                float f11 = rect.top;
                                objArr2 = objArr3;
                                float f12 = rect.right;
                                float f13 = rect.bottom;
                                if (m1.c.d(j10) >= f10 && m1.c.d(j10) < f12 && m1.c.e(j10) >= f11 && m1.c.e(j10) < f13 && (hVar = (h2.h) hl.f.m0(b3Var.f13370a.f17862d, uVar)) != null) {
                                    boolean z12 = hVar.f17824c;
                                    if (z12) {
                                        i12 = -i10;
                                    } else {
                                        i12 = i10;
                                    }
                                    Function0 function0 = hVar.f17822a;
                                    if ((i10 != 0 || !z12) && i12 >= 0 ? ((Number) function0.mo2invoke()).floatValue() < ((Number) hVar.f17823b.mo2invoke()).floatValue() : ((Number) function0.mo2invoke()).floatValue() > s0.g.f34069a) {
                                        z11 = true;
                                    }
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                i11 = i15;
                            }
                            j11 >>= i11;
                            i17++;
                            i15 = i11;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr3;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        objArr = objArr3;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i13 = 0;
                }
                return z11;
            }
        }
        return false;
    }

    public final AccessibilityEvent n(int i10, int i11) {
        b3 b3Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        a0 a0Var = this.f13578d;
        obtain.setPackageName(a0Var.getContext().getPackageName());
        obtain.setSource(a0Var, i10);
        if (x() && (b3Var = (b3) s().g(i10)) != null) {
            obtain.setPassword(b3Var.f13370a.f17862d.f17850a.containsKey(h2.r.E));
        }
        return obtain;
    }

    public final AccessibilityEvent o(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent n10 = n(i10, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (num != null) {
            n10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            n10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            n10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            n10.getText().add(charSequence);
        }
        return n10;
    }

    public final void p(h2.o oVar, ArrayList arrayList, t.t tVar) {
        boolean r10 = t0.t.r(oVar);
        boolean booleanValue = ((Boolean) oVar.f17862d.g(h2.r.f17893m, m0.f13520b)).booleanValue();
        int i10 = oVar.f17865g;
        if ((booleanValue || y(oVar)) && s().c(i10)) {
            arrayList.add(oVar);
        }
        if (booleanValue) {
            tVar.k(i10, N(vt.g0.S(h2.o.g(oVar, false, 7)), r10));
            return;
        }
        List g10 = h2.o.g(oVar, false, 7);
        int size = g10.size();
        for (int i11 = 0; i11 < size; i11++) {
            p((h2.o) g10.get(i11), arrayList, tVar);
        }
    }

    public final int q(h2.o oVar) {
        h2.u uVar = h2.r.f17882b;
        h2.j jVar = oVar.f17862d;
        if (!jVar.f17850a.containsKey(uVar)) {
            h2.u uVar2 = h2.r.A;
            if (jVar.f17850a.containsKey(uVar2)) {
                return (int) (4294967295L & ((j2.f0) jVar.e(uVar2)).f20712a);
            }
        }
        return this.f13595u;
    }

    public final int r(h2.o oVar) {
        h2.u uVar = h2.r.f17882b;
        h2.j jVar = oVar.f17862d;
        if (!jVar.f17850a.containsKey(uVar)) {
            h2.u uVar2 = h2.r.A;
            if (jVar.f17850a.containsKey(uVar2)) {
                return (int) (((j2.f0) jVar.e(uVar2)).f20712a >> 32);
            }
        }
        return this.f13595u;
    }

    public final t.t s() {
        h2.o oVar;
        if (this.f13599y) {
            this.f13599y = false;
            this.A = c3.a(this.f13578d.getSemanticsOwner());
            if (x()) {
                t.t tVar = this.C;
                tVar.a();
                t.t tVar2 = this.D;
                tVar2.a();
                b3 b3Var = (b3) s().g(-1);
                if (b3Var != null) {
                    oVar = b3Var.f13370a;
                } else {
                    oVar = null;
                }
                Intrinsics.c(oVar);
                ArrayList N2 = N(vt.y.h(oVar), t0.t.r(oVar));
                int f10 = vt.y.f(N2);
                int i10 = 1;
                if (1 <= f10) {
                    while (true) {
                        int i11 = ((h2.o) N2.get(i10 - 1)).f17865g;
                        int i12 = ((h2.o) N2.get(i10)).f17865g;
                        tVar.k(i11, Integer.valueOf(i12));
                        tVar2.k(i12, Integer.valueOf(i11));
                        if (i10 == f10) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.A;
    }

    public final String u(h2.o oVar) {
        float floatValue;
        int f10;
        h2.j jVar = oVar.f17862d;
        h2.r rVar = h2.r.f17881a;
        Object m02 = hl.f.m0(jVar, h2.r.f17883c);
        h2.u uVar = h2.r.D;
        h2.j jVar2 = oVar.f17862d;
        i2.a aVar = (i2.a) hl.f.m0(jVar2, uVar);
        h2.g gVar = (h2.g) hl.f.m0(jVar2, h2.r.f17901u);
        a0 a0Var = this.f13578d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && m02 == null) {
                        m02 = a0Var.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (gVar != null && h2.g.a(gVar.f17821a, 2) && m02 == null) {
                    m02 = a0Var.getContext().getResources().getString(R.string.state_off);
                }
            } else if (gVar != null && h2.g.a(gVar.f17821a, 2) && m02 == null) {
                m02 = a0Var.getContext().getResources().getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) hl.f.m0(jVar2, h2.r.C);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || !h2.g.a(gVar.f17821a, 4)) && m02 == null) {
                if (booleanValue) {
                    m02 = a0Var.getContext().getResources().getString(R.string.selected);
                } else {
                    m02 = a0Var.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        h2.f fVar = (h2.f) hl.f.m0(jVar2, h2.r.f17884d);
        if (fVar != null) {
            h2.f fVar2 = h2.f.f17817c;
            if (fVar != h2.f.f17817c) {
                if (m02 == null) {
                    nu.d dVar = fVar.f17818a;
                    if (((Number) dVar.e()).floatValue() - ((Number) dVar.b()).floatValue() == s0.g.f34069a) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = (s0.g.f34069a - ((Number) dVar.b()).floatValue()) / (((Number) dVar.e()).floatValue() - ((Number) dVar.b()).floatValue());
                    }
                    if (floatValue < s0.g.f34069a) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    if (floatValue == s0.g.f34069a) {
                        f10 = 0;
                    } else if (floatValue == 1.0f) {
                        f10 = 100;
                    } else {
                        f10 = kotlin.ranges.d.f(Math.round(floatValue * 100), 1, 99);
                    }
                    m02 = a0Var.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(f10));
                }
            } else if (m02 == null) {
                m02 = a0Var.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) m02;
    }

    public final boolean x() {
        if (this.f13581g.isEnabled() && (!this.f13585k.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean y(h2.o oVar) {
        String str;
        boolean z10;
        List list = (List) hl.f.m0(oVar.f17862d, h2.r.f17882b);
        if (list != null) {
            str = (String) vt.g0.w(list);
        } else {
            str = null;
        }
        if (str == null && v(oVar) == null && u(oVar) == null && !t(oVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (c3.f(oVar)) {
            if (oVar.f17862d.f17851b) {
                return true;
            }
            if (!oVar.f17863e && oVar.j().isEmpty()) {
                if (w0.k(oVar.f17861c, h2.n.f17855b) == null && z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void z(androidx.compose.ui.node.a aVar) {
        if (this.f13597w.add(aVar)) {
            this.f13598x.o(Unit.f23355a);
        }
    }
}
