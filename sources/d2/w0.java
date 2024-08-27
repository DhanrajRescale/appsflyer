package d2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class w0 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f13656a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13657b = 0;

    public static final r1.f A(int i10, t0.n nVar, int i11) {
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(44534090);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        Resources w10 = w(rVar);
        Resources.Theme theme = context.getTheme();
        Configuration configuration = w10.getConfiguration();
        rVar.b0(1466937987);
        if ((((i11 & 112) ^ 48) > 32 && rVar.f(i10)) || (i11 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = z10 | rVar.h(w10) | rVar.h(theme) | rVar.h(configuration);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            TypedValue typedValue = new TypedValue();
            w10.getValue(i10, typedValue, true);
            XmlResourceParser xml = w10.getXml(i10);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next == 2) {
                Unit unit = Unit.f23355a;
                Q = t(theme, w10, xml, typedValue.changingConfigurations).f16429a;
                rVar.k0(Q);
            } else {
                throw new XmlPullParserException("No start tag found");
            }
        }
        r1.f fVar = (r1.f) Q;
        rVar.s(false);
        rVar.s(false);
        return fVar;
    }

    public static final h2.o a(androidx.compose.ui.node.a aVar, boolean z10) {
        g1.n nVar = aVar.f1422w.f7658e;
        c2.n nVar2 = null;
        if ((nVar.f16408d & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f16407c & 8) != 0) {
                    g1.n nVar3 = nVar;
                    v0.h hVar = null;
                    while (nVar3 != null) {
                        if (nVar3 instanceof c2.z1) {
                            nVar2 = nVar3;
                            break loop0;
                        }
                        if ((nVar3.f16407c & 8) != 0 && (nVar3 instanceof c2.o)) {
                            int i10 = 0;
                            for (g1.n nVar4 = ((c2.o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                if ((nVar4.f16407c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVar3 = nVar4;
                                    } else {
                                        if (hVar == null) {
                                            hVar = new v0.h(new g1.n[16]);
                                        }
                                        if (nVar3 != null) {
                                            hVar.b(nVar3);
                                            nVar3 = null;
                                        }
                                        hVar.b(nVar4);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVar3 = c2.g.f(hVar);
                    }
                }
                if ((nVar.f16408d & 8) == 0) {
                    break;
                }
                nVar = nVar.f16410f;
            }
        }
        Intrinsics.c(nVar2);
        g1.n nVar5 = ((g1.n) ((c2.z1) nVar2)).f16405a;
        h2.j n10 = aVar.n();
        Intrinsics.c(n10);
        return new h2.o(nVar5, z10, aVar, n10);
    }

    public static final long b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                long j10 = (i11 & 4294967295L) | (i10 << 32);
                int i12 = j2.f0.f20711c;
                return j10;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean c(ArrayList arrayList) {
        ?? r02;
        long j10;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() != 0 && arrayList.size() != 1) {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int f10 = vt.y.f(arrayList);
            int i10 = 0;
            while (i10 < f10) {
                i10++;
                Object obj2 = arrayList.get(i10);
                h2.o oVar = (h2.o) obj2;
                h2.o oVar2 = (h2.o) obj;
                r02.add(new m1.c(t0.t.g(Math.abs(m1.c.d(oVar2.e().a()) - m1.c.d(oVar.e().a())), Math.abs(m1.c.e(oVar2.e().a()) - m1.c.e(oVar.e().a())))));
                obj = obj2;
            }
        } else {
            r02 = vt.i0.f38321a;
        }
        if (r02.size() == 1) {
            j10 = ((m1.c) vt.g0.u(r02)).f27237a;
        } else if (!r02.isEmpty()) {
            Object u10 = vt.g0.u(r02);
            int f11 = vt.y.f(r02);
            if (1 <= f11) {
                int i11 = 1;
                while (true) {
                    u10 = new m1.c(m1.c.h(((m1.c) u10).f27237a, ((m1.c) r02.get(i11)).f27237a));
                    if (i11 == f11) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((m1.c) u10).f27237a;
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (m1.c.e(j10) < m1.c.d(j10)) {
            return true;
        }
        return false;
    }

    public static final boolean d(Object obj) {
        if (obj instanceof e1.q) {
            e1.q qVar = (e1.q) obj;
            if (qVar.c() != t0.h1.f35033a && qVar.c() != t0.o3.f35116a && qVar.c() != t0.g2.f35024a) {
                return false;
            }
            Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return d(value);
        }
        if ((obj instanceof ut.d) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f13656a;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final long e(int i10, t0.n nVar) {
        return g2.a.f16428a.a((Context) ((t0.r) nVar).m(AndroidCompositionLocals_androidKt.f1428b), i10);
    }

    public static final int f(float f10) {
        double floor;
        if (f10 >= s0.g.f34069a) {
            floor = Math.ceil(f10);
        } else {
            floor = Math.floor(f10);
        }
        return ((int) floor) * (-1);
    }

    public static final boolean g(m1.d dVar, float f10, float f11) {
        if (f10 <= dVar.f27241c && dVar.f27239a <= f10 && f11 <= dVar.f27242d && dVar.f27240b <= f11) {
            return true;
        }
        return false;
    }

    public static final o2.t h(Context context) {
        int i10;
        o2.b bVar = new o2.b(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        return new o2.t(bVar, new o2.d(i10));
    }

    public static final float i(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final void j(j2.l lVar, n1.r rVar, n1.p pVar, float f10, n1.w0 w0Var, u2.j jVar, p1.i iVar, int i10) {
        ArrayList arrayList = lVar.f20737h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j2.p pVar2 = (j2.p) arrayList.get(i11);
            ((j2.a) pVar2.f20745a).f(rVar, pVar, f10, w0Var, jVar, iVar, i10);
            rVar.r(s0.g.f34069a, ((j2.a) pVar2.f20745a).b());
        }
    }

    public static final androidx.compose.ui.node.a k(androidx.compose.ui.node.a aVar, Function1 function1) {
        for (androidx.compose.ui.node.a q10 = aVar.q(); q10 != null; q10 = q10.q()) {
            if (((Boolean) function1.invoke(q10)).booleanValue()) {
                return q10;
            }
        }
        return null;
    }

    public static final int l(o2.d0 d0Var, int i10) {
        boolean z10;
        if (d0Var.compareTo(o2.d0.f29462d) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean a10 = o2.z.a(i10, 1);
        if (a10 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        if (!a10) {
            return 0;
        }
        return 2;
    }

    public static final Rect m(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        int i12 = i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i12 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i12 < i11) {
                    int nextSpanTransition = spanned.nextSpanTransition(i12, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i12, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        k2.i.a(textPaint2, charSequence, i12, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i12, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i12 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            k2.i.a(textPaint, charSequence, i12, i11, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i12, i11, rect3);
        }
        return rect3;
    }

    public static final int n(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            if (z10) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        }
        if (!z10) {
            return lineForOffset + 1;
        }
        return lineForOffset;
    }

    public static final c2.z1 o(androidx.compose.ui.node.a aVar) {
        g1.n nVar = aVar.f1422w.f7658e;
        Object obj = null;
        if ((nVar.f16408d & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f16407c & 8) != 0) {
                    g1.n nVar2 = nVar;
                    v0.h hVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof c2.z1) {
                            if (((c2.z1) nVar2).A0()) {
                                obj = nVar2;
                                break loop0;
                            }
                        } else if ((nVar2.f16407c & 8) != 0 && (nVar2 instanceof c2.o)) {
                            int i10 = 0;
                            for (g1.n nVar3 = ((c2.o) nVar2).f7801o; nVar3 != null; nVar3 = nVar3.f16410f) {
                                if ((nVar3.f16407c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (hVar == null) {
                                            hVar = new v0.h(new g1.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            hVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        hVar.b(nVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVar2 = c2.g.f(hVar);
                    }
                }
                if ((nVar.f16408d & 8) == 0) {
                    break;
                }
                nVar = nVar.f16410f;
            }
        }
        return (c2.z1) obj;
    }

    public static final j2.e p(p2.c0 c0Var) {
        j2.e eVar = c0Var.f30522a;
        eVar.getClass();
        long j10 = c0Var.f30523b;
        return eVar.subSequence(j2.f0.e(j10), j2.f0.d(j10));
    }

    public static final j2.e q(p2.c0 c0Var, int i10) {
        j2.e eVar = c0Var.f30522a;
        long j10 = c0Var.f30523b;
        return eVar.subSequence(j2.f0.d(j10), Math.min(j2.f0.d(j10) + i10, c0Var.f30522a.f20699a.length()));
    }

    public static final j2.e r(p2.c0 c0Var, int i10) {
        j2.e eVar = c0Var.f30522a;
        long j10 = c0Var.f30523b;
        return eVar.subSequence(Math.max(0, j2.f0.e(j10) - i10), j2.f0.e(j10));
    }

    public static final g1.o s(g1.o oVar, g1.o oVar2) {
        e2 e2Var = new e2();
        return oVar.g(e2Var).g(oVar2).g(e2Var.f13410c);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final g2.b t(android.content.res.Resources.Theme r42, android.content.res.Resources r43, android.content.res.XmlResourceParser r44, int r45) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.w0.t(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):g2.b");
    }

    public static final q1.b u(int i10, t0.n nVar, int i11) {
        TypedValue typedValue;
        boolean z10;
        q1.b aVar;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(473971343);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        rVar.m(AndroidCompositionLocals_androidKt.f1427a);
        Resources resources = context.getResources();
        g2.e eVar = (g2.e) rVar.m(AndroidCompositionLocals_androidKt.f1430d);
        synchronized (eVar) {
            typedValue = (TypedValue) eVar.f16434a.g(i10);
            z10 = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                t.t tVar = eVar.f16434a;
                int e10 = tVar.e(i10);
                Object[] objArr = tVar.f34901c;
                Object obj = objArr[e10];
                tVar.f34900b[e10] = i10;
                objArr[e10] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        g2.b bVar = null;
        if (charSequence != null && kotlin.text.w.v(charSequence, ".xml")) {
            rVar.b0(-738265077);
            Resources.Theme theme = context.getTheme();
            int i12 = typedValue.changingConfigurations;
            rVar.b0(21855625);
            g2.d dVar = (g2.d) rVar.m(AndroidCompositionLocals_androidKt.f1429c);
            g2.c cVar = new g2.c(i10, theme);
            WeakReference weakReference = (WeakReference) dVar.f16433a.get(cVar);
            if (weakReference != null) {
                bVar = (g2.b) weakReference.get();
            }
            if (bVar == null) {
                XmlResourceParser xml = resources.getXml(i10);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    if (Intrinsics.a(xml.getName(), "vector")) {
                        bVar = t(theme, resources, xml, i12);
                        dVar.f16433a.put(cVar, new WeakReference(bVar));
                    } else {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            rVar.s(false);
            aVar = t0.t.s0(bVar.f16429a, rVar);
            rVar.s(false);
        } else {
            rVar.b0(-738264922);
            Object theme2 = context.getTheme();
            rVar.b0(-738264848);
            boolean h10 = rVar.h(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !rVar.f(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean h11 = h10 | z10 | rVar.h(theme2);
            Object Q = rVar.Q();
            if (h11 || Q == t0.m.f35080a) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    Intrinsics.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    Q = new n1.e(((BitmapDrawable) drawable).getBitmap());
                    rVar.k0(Q);
                } catch (Exception e11) {
                    throw new RuntimeException("Error attempting to load resource: " + ((Object) charSequence), e11);
                }
            }
            n1.h0 h0Var = (n1.h0) Q;
            rVar.s(false);
            n1.e eVar2 = (n1.e) h0Var;
            aVar = new q1.a(h0Var, w2.h.f38791b, hl.f.k(eVar2.f28128a.getWidth(), eVar2.f28128a.getHeight()));
            rVar.s(false);
        }
        rVar.s(false);
        return aVar;
    }

    public static final void v(float[] fArr, float[] fArr2) {
        float i10 = i(0, 0, fArr2, fArr);
        float i11 = i(0, 1, fArr2, fArr);
        float i12 = i(0, 2, fArr2, fArr);
        float i13 = i(0, 3, fArr2, fArr);
        float i14 = i(1, 0, fArr2, fArr);
        float i15 = i(1, 1, fArr2, fArr);
        float i16 = i(1, 2, fArr2, fArr);
        float i17 = i(1, 3, fArr2, fArr);
        float i18 = i(2, 0, fArr2, fArr);
        float i19 = i(2, 1, fArr2, fArr);
        float i20 = i(2, 2, fArr2, fArr);
        float i21 = i(2, 3, fArr2, fArr);
        float i22 = i(3, 0, fArr2, fArr);
        float i23 = i(3, 1, fArr2, fArr);
        float i24 = i(3, 2, fArr2, fArr);
        float i25 = i(3, 3, fArr2, fArr);
        fArr[0] = i10;
        fArr[1] = i11;
        fArr[2] = i12;
        fArr[3] = i13;
        fArr[4] = i14;
        fArr[5] = i15;
        fArr[6] = i16;
        fArr[7] = i17;
        fArr[8] = i18;
        fArr[9] = i19;
        fArr[10] = i20;
        fArr[11] = i21;
        fArr[12] = i22;
        fArr[13] = i23;
        fArr[14] = i24;
        fArr[15] = i25;
    }

    public static final Resources w(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.m(AndroidCompositionLocals_androidKt.f1427a);
        return ((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b)).getResources();
    }

    public static final void x(e4.m mVar, h2.o oVar) {
        int size;
        h2.b bVar = (h2.b) hl.f.m0(oVar.h(), h2.r.f17887g);
        if (bVar != null) {
            mVar.k(e4.k.e(bVar.f17811a, bVar.f17812b, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        if (hl.f.m0(oVar.h(), h2.r.f17886f) != null) {
            List g10 = h2.o.g(oVar, true, 4);
            int size2 = g10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                h2.o oVar2 = (h2.o) g10.get(i11);
                if (oVar2.h().f17850a.containsKey(h2.r.C)) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean c10 = c(arrayList);
            if (c10) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (c10) {
                i10 = arrayList.size();
            }
            mVar.k(e4.k.e(size, i10, 0));
        }
    }

    public static final void y(e4.m mVar, h2.o oVar) {
        int i10;
        int i11;
        a3.a.u(hl.f.m0(oVar.h(), h2.r.f17888h));
        h2.o i12 = oVar.i();
        if (i12 != null && hl.f.m0(i12.h(), h2.r.f17886f) != null) {
            h2.b bVar = (h2.b) hl.f.m0(i12.h(), h2.r.f17887g);
            if (bVar != null && (bVar.f17811a < 0 || bVar.f17812b < 0)) {
                return;
            }
            if (!oVar.h().f17850a.containsKey(h2.r.C)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List g10 = h2.o.g(i12, true, 4);
            int size = g10.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                h2.o oVar2 = (h2.o) g10.get(i14);
                if (oVar2.h().f17850a.containsKey(h2.r.C)) {
                    arrayList.add(oVar2);
                    if (oVar2.f17861c.s() < oVar.f17861c.s()) {
                        i13++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean c10 = c(arrayList);
                if (c10) {
                    i10 = 0;
                } else {
                    i10 = i13;
                }
                if (c10) {
                    i11 = i13;
                } else {
                    i11 = 0;
                }
                Object obj = oVar.h().f17850a.get(h2.r.C);
                if (obj == null) {
                    obj = Boolean.FALSE;
                }
                mVar.l(e4.l.a(i10, 1, i11, 1, false, ((Boolean) obj).booleanValue()));
            }
        }
    }

    public static final long z(long j10, long j11) {
        int c10;
        int e10 = j2.f0.e(j10);
        int d10 = j2.f0.d(j10);
        if (j2.f0.e(j11) < j2.f0.d(j10) && j2.f0.e(j10) < j2.f0.d(j11)) {
            if (j2.f0.e(j11) <= j2.f0.e(j10) && j2.f0.d(j10) <= j2.f0.d(j11)) {
                e10 = j2.f0.e(j11);
                d10 = e10;
            } else {
                if (j2.f0.e(j10) <= j2.f0.e(j11) && j2.f0.d(j11) <= j2.f0.d(j10)) {
                    c10 = j2.f0.c(j11);
                } else {
                    int e11 = j2.f0.e(j11);
                    if (e10 < j2.f0.d(j11) && e11 <= e10) {
                        e10 = j2.f0.e(j11);
                        c10 = j2.f0.c(j11);
                    } else {
                        d10 = j2.f0.e(j11);
                    }
                }
                d10 -= c10;
            }
        } else if (d10 > j2.f0.e(j11)) {
            e10 -= j2.f0.c(j11);
            c10 = j2.f0.c(j11);
            d10 -= c10;
        }
        return b(e10, d10);
    }
}
