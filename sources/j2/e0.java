package j2;

import android.graphics.RectF;
import android.text.Layout;
import d2.w0;
import i0.b1;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f20703a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20704b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20705c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20706d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20707e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20708f;

    public e0(d0 d0Var, l lVar, long j10) {
        float c10;
        this.f20703a = d0Var;
        this.f20704b = lVar;
        this.f20705c = j10;
        ArrayList arrayList = lVar.f20737h;
        boolean isEmpty = arrayList.isEmpty();
        float f10 = s0.g.f34069a;
        if (isEmpty) {
            c10 = 0.0f;
        } else {
            c10 = ((a) ((p) arrayList.get(0)).f20745a).f20630d.c(0);
        }
        this.f20706d = c10;
        ArrayList arrayList2 = lVar.f20737h;
        if (!arrayList2.isEmpty()) {
            p pVar = (p) vt.g0.C(arrayList2);
            f10 = ((a) pVar.f20745a).f20630d.c(r3.f21965e - 1) + pVar.f20750f;
        }
        this.f20707e = f10;
        this.f20708f = lVar.f20736g;
    }

    public final u2.h a(int i10) {
        int a02;
        l lVar = this.f20704b;
        lVar.e(i10);
        int length = lVar.f20730a.f20740a.f20699a.length();
        ArrayList arrayList = lVar.f20737h;
        if (i10 == length) {
            a02 = vt.y.f(arrayList);
        } else {
            a02 = hl.f.a0(i10, arrayList);
        }
        p pVar = (p) arrayList.get(a02);
        o oVar = pVar.f20745a;
        if (((a) oVar).f20630d.f21964d.isRtlCharAt(pVar.a(i10))) {
            return u2.h.f36681b;
        }
        return u2.h.f36680a;
    }

    public final m1.d b(int i10) {
        boolean z10;
        float h10;
        float h11;
        float g10;
        float g11;
        l lVar = this.f20704b;
        lVar.d(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.a0(i10, arrayList));
        o oVar = pVar.f20745a;
        int a10 = pVar.a(i10);
        a aVar = (a) oVar;
        CharSequence charSequence = aVar.f20631e;
        if (a10 >= 0 && a10 < charSequence.length()) {
            k2.t tVar = aVar.f20630d;
            Layout layout = tVar.f21964d;
            int lineForOffset = layout.getLineForOffset(a10);
            float f10 = tVar.f(lineForOffset);
            float d10 = tVar.d(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isRtlCharAt = layout.isRtlCharAt(a10);
            if (z10 && !isRtlCharAt) {
                h10 = tVar.g(a10, false);
                h11 = tVar.g(a10 + 1, true);
            } else {
                if (z10 && isRtlCharAt) {
                    g10 = tVar.h(a10, false);
                    g11 = tVar.h(a10 + 1, true);
                } else if (isRtlCharAt) {
                    g10 = tVar.g(a10, false);
                    g11 = tVar.g(a10 + 1, true);
                } else {
                    h10 = tVar.h(a10, false);
                    h11 = tVar.h(a10 + 1, true);
                }
                float f11 = g10;
                h10 = g11;
                h11 = f11;
            }
            RectF rectF = new RectF(h10, f10, h11, d10);
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = rectF.right;
            float f15 = rectF.bottom;
            long g12 = t0.t.g(s0.g.f34069a, pVar.f20750f);
            return new m1.d(m1.c.d(g12) + f12, m1.c.e(g12) + f13, m1.c.d(g12) + f14, m1.c.e(g12) + f15);
        }
        StringBuilder n10 = a3.a.n("offset(", a10, ") is out of bounds [0,");
        n10.append(charSequence.length());
        n10.append(')');
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final m1.d c(int i10) {
        int a02;
        l lVar = this.f20704b;
        lVar.e(i10);
        int length = lVar.f20730a.f20740a.f20699a.length();
        ArrayList arrayList = lVar.f20737h;
        if (i10 == length) {
            a02 = vt.y.f(arrayList);
        } else {
            a02 = hl.f.a0(i10, arrayList);
        }
        p pVar = (p) arrayList.get(a02);
        o oVar = pVar.f20745a;
        int a10 = pVar.a(i10);
        a aVar = (a) oVar;
        CharSequence charSequence = aVar.f20631e;
        if (a10 >= 0 && a10 <= charSequence.length()) {
            k2.t tVar = aVar.f20630d;
            float g10 = tVar.g(a10, false);
            int lineForOffset = tVar.f21964d.getLineForOffset(a10);
            float f10 = tVar.f(lineForOffset);
            float d10 = tVar.d(lineForOffset);
            long g11 = t0.t.g(s0.g.f34069a, pVar.f20750f);
            return new m1.d(m1.c.d(g11) + g10, m1.c.e(g11) + f10, m1.c.d(g11) + g10, m1.c.e(g11) + d10);
        }
        StringBuilder n10 = a3.a.n("offset(", a10, ") is out of bounds [0,");
        n10.append(charSequence.length());
        n10.append(']');
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final float d(int i10) {
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        return ((a) oVar).f20630d.d(i10 - pVar.f20748d) + pVar.f20750f;
    }

    public final int e(int i10, boolean z10) {
        int e10;
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        int i11 = i10 - pVar.f20748d;
        k2.t tVar = ((a) oVar).f20630d;
        if (z10) {
            Layout layout = tVar.f21964d;
            if (layout.getEllipsisStart(i11) == 0) {
                k2.g gVar = (k2.g) tVar.f21975o.getValue();
                Layout layout2 = gVar.f21924a;
                e10 = gVar.c(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                e10 = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            e10 = tVar.e(i11);
        }
        return e10 + pVar.f20746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (Intrinsics.a(this.f20703a, e0Var.f20703a) && Intrinsics.a(this.f20704b, e0Var.f20704b) && w2.j.a(this.f20705c, e0Var.f20705c) && this.f20706d == e0Var.f20706d && this.f20707e == e0Var.f20707e && Intrinsics.a(this.f20708f, e0Var.f20708f)) {
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        int a02;
        l lVar = this.f20704b;
        int length = lVar.f20730a.f20740a.f20699a.length();
        ArrayList arrayList = lVar.f20737h;
        if (i10 >= length) {
            a02 = vt.y.f(arrayList);
        } else if (i10 < 0) {
            a02 = 0;
        } else {
            a02 = hl.f.a0(i10, arrayList);
        }
        p pVar = (p) arrayList.get(a02);
        o oVar = pVar.f20745a;
        return ((a) oVar).f20630d.f21964d.getLineForOffset(pVar.a(i10)) + pVar.f20748d;
    }

    public final int g(float f10) {
        int c02;
        l lVar = this.f20704b;
        ArrayList arrayList = lVar.f20737h;
        if (f10 <= s0.g.f34069a) {
            c02 = 0;
        } else if (f10 >= lVar.f20734e) {
            c02 = vt.y.f(arrayList);
        } else {
            c02 = hl.f.c0(arrayList, f10);
        }
        p pVar = (p) arrayList.get(c02);
        int i10 = pVar.f20747c - pVar.f20746b;
        int i11 = pVar.f20748d;
        if (i10 != 0) {
            float f11 = f10 - pVar.f20750f;
            k2.t tVar = ((a) pVar.f20745a).f20630d;
            return i11 + tVar.f21964d.getLineForVertical(((int) f11) - tVar.f21966f);
        }
        return i11;
    }

    public final float h(int i10) {
        float f10;
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        int i11 = i10 - pVar.f20748d;
        k2.t tVar = ((a) oVar).f20630d;
        float lineLeft = tVar.f21964d.getLineLeft(i11);
        if (i11 == tVar.f21965e - 1) {
            f10 = tVar.f21968h;
        } else {
            f10 = s0.g.f34069a;
        }
        return lineLeft + f10;
    }

    public final int hashCode() {
        return this.f20708f.hashCode() + v.e.a(this.f20707e, v.e.a(this.f20706d, v.e.c(this.f20705c, (this.f20704b.hashCode() + (this.f20703a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final float i(int i10) {
        float f10;
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        int i11 = i10 - pVar.f20748d;
        k2.t tVar = ((a) oVar).f20630d;
        float lineRight = tVar.f21964d.getLineRight(i11);
        if (i11 == tVar.f21965e - 1) {
            f10 = tVar.f21969i;
        } else {
            f10 = s0.g.f34069a;
        }
        return lineRight + f10;
    }

    public final int j(int i10) {
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        return ((a) oVar).f20630d.f21964d.getLineStart(i10 - pVar.f20748d) + pVar.f20746b;
    }

    public final float k(int i10) {
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        p pVar = (p) arrayList.get(hl.f.b0(i10, arrayList));
        o oVar = pVar.f20745a;
        return ((a) oVar).f20630d.f(i10 - pVar.f20748d) + pVar.f20750f;
    }

    public final int l(long j10) {
        int c02;
        l lVar = this.f20704b;
        lVar.getClass();
        float e10 = m1.c.e(j10);
        ArrayList arrayList = lVar.f20737h;
        if (e10 <= s0.g.f34069a) {
            c02 = 0;
        } else if (m1.c.e(j10) >= lVar.f20734e) {
            c02 = vt.y.f(arrayList);
        } else {
            c02 = hl.f.c0(arrayList, m1.c.e(j10));
        }
        p pVar = (p) arrayList.get(c02);
        int i10 = pVar.f20747c;
        int i11 = pVar.f20746b;
        if (i10 - i11 != 0) {
            long g10 = t0.t.g(m1.c.d(j10), m1.c.e(j10) - pVar.f20750f);
            a aVar = (a) pVar.f20745a;
            aVar.getClass();
            int e11 = (int) m1.c.e(g10);
            k2.t tVar = aVar.f20630d;
            int i12 = e11 - tVar.f21966f;
            Layout layout = tVar.f21964d;
            int lineForVertical = layout.getLineForVertical(i12);
            return i11 + layout.getOffsetForHorizontal(lineForVertical, (tVar.b(lineForVertical) * (-1)) + m1.c.d(g10));
        }
        return i11;
    }

    public final u2.h m(int i10) {
        int a02;
        l lVar = this.f20704b;
        lVar.e(i10);
        int length = lVar.f20730a.f20740a.f20699a.length();
        ArrayList arrayList = lVar.f20737h;
        if (i10 == length) {
            a02 = vt.y.f(arrayList);
        } else {
            a02 = hl.f.a0(i10, arrayList);
        }
        p pVar = (p) arrayList.get(a02);
        o oVar = pVar.f20745a;
        int a10 = pVar.a(i10);
        k2.t tVar = ((a) oVar).f20630d;
        if (tVar.f21964d.getParagraphDirection(tVar.f21964d.getLineForOffset(a10)) == 1) {
            return u2.h.f36680a;
        }
        return u2.h.f36681b;
    }

    public final n1.h n(int i10, int i11) {
        l lVar = this.f20704b;
        n nVar = lVar.f20730a;
        if (i10 >= 0 && i10 <= i11 && i11 <= nVar.f20740a.f20699a.length()) {
            if (i10 == i11) {
                return androidx.compose.ui.graphics.a.h();
            }
            n1.h h10 = androidx.compose.ui.graphics.a.h();
            hl.f.d0(lVar.f20737h, w0.b(i10, i11), new b1(h10, i10, i11, 1));
            return h10;
        }
        StringBuilder q10 = da.e.q("Start(", i10, ") or End(", i11, ") is out of range [0..");
        q10.append(nVar.f20740a.f20699a.length());
        q10.append("), or start > end!");
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final long o(int i10) {
        int a02;
        int i11;
        int preceding;
        int i12;
        int following;
        l lVar = this.f20704b;
        lVar.e(i10);
        int length = lVar.f20730a.f20740a.f20699a.length();
        ArrayList arrayList = lVar.f20737h;
        if (i10 == length) {
            a02 = vt.y.f(arrayList);
        } else {
            a02 = hl.f.a0(i10, arrayList);
        }
        p pVar = (p) arrayList.get(a02);
        o oVar = pVar.f20745a;
        int a10 = pVar.a(i10);
        a aVar = (a) oVar;
        l2.b bVar = ((l2.a) aVar.f20633g.getValue()).f23929a;
        bVar.a(a10);
        BreakIterator breakIterator = bVar.f23933d;
        if (bVar.e(breakIterator.preceding(a10))) {
            bVar.a(a10);
            i11 = a10;
            while (i11 != -1 && (!bVar.e(i11) || bVar.c(i11))) {
                bVar.a(i11);
                i11 = breakIterator.preceding(i11);
            }
        } else {
            bVar.a(a10);
            if (bVar.d(a10)) {
                if (breakIterator.isBoundary(a10) && !bVar.b(a10)) {
                    preceding = a10;
                } else {
                    preceding = breakIterator.preceding(a10);
                }
            } else if (bVar.b(a10)) {
                preceding = breakIterator.preceding(a10);
            } else {
                i11 = -1;
            }
            i11 = preceding;
        }
        if (i11 == -1) {
            i11 = a10;
        }
        l2.b bVar2 = ((l2.a) aVar.f20633g.getValue()).f23929a;
        bVar2.a(a10);
        BreakIterator breakIterator2 = bVar2.f23933d;
        if (bVar2.c(breakIterator2.following(a10))) {
            bVar2.a(a10);
            i12 = a10;
            while (i12 != -1 && (bVar2.e(i12) || !bVar2.c(i12))) {
                bVar2.a(i12);
                i12 = breakIterator2.following(i12);
            }
        } else {
            bVar2.a(a10);
            if (bVar2.b(a10)) {
                if (breakIterator2.isBoundary(a10) && !bVar2.d(a10)) {
                    following = a10;
                } else {
                    following = breakIterator2.following(a10);
                }
            } else if (bVar2.d(a10)) {
                following = breakIterator2.following(a10);
            } else {
                i12 = -1;
            }
            i12 = following;
        }
        if (i12 != -1) {
            a10 = i12;
        }
        long b10 = w0.b(i11, a10);
        int i13 = f0.f20711c;
        int i14 = pVar.f20746b;
        return w0.b(((int) (b10 >> 32)) + i14, ((int) (b10 & 4294967295L)) + i14);
    }

    public final boolean p(int i10) {
        l lVar = this.f20704b;
        lVar.f(i10);
        ArrayList arrayList = lVar.f20737h;
        Layout layout = ((a) ((p) arrayList.get(hl.f.b0(i10, arrayList))).f20745a).f20630d.f21964d;
        k2.s sVar = k2.u.f21976a;
        if (layout.getEllipsisCount(i10) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f20703a + ", multiParagraph=" + this.f20704b + ", size=" + ((Object) w2.j.b(this.f20705c)) + ", firstBaseline=" + this.f20706d + ", lastBaseline=" + this.f20707e + ", placeholderRects=" + this.f20708f + ')';
    }
}
