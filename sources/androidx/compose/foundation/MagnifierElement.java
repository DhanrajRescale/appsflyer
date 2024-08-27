package androidx.compose.foundation;

import c2.y0;
import d0.i0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w2.g;
import x.c2;
import x.q1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lc2/y0;", "Lx/q1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MagnifierElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1197b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1198c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f1199d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1200e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1201f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1202g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1203h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1204i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1205j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f1206k;

    public MagnifierElement(i0 i0Var, Function1 function1, Function1 function12, float f10, boolean z10, long j10, float f11, float f12, boolean z11, c2 c2Var) {
        this.f1197b = i0Var;
        this.f1198c = function1;
        this.f1199d = function12;
        this.f1200e = f10;
        this.f1201f = z10;
        this.f1202g = j10;
        this.f1203h = f11;
        this.f1204i = f12;
        this.f1205j = z11;
        this.f1206k = c2Var;
    }

    @Override // c2.y0
    public final n d() {
        return new q1(this.f1197b, this.f1198c, this.f1199d, this.f1200e, this.f1201f, this.f1202g, this.f1203h, this.f1204i, this.f1205j, this.f1206k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (!Intrinsics.a(this.f1197b, magnifierElement.f1197b) || !Intrinsics.a(this.f1198c, magnifierElement.f1198c) || this.f1200e != magnifierElement.f1200e || this.f1201f != magnifierElement.f1201f) {
            return false;
        }
        int i10 = g.f38789d;
        if (this.f1202g == magnifierElement.f1202g && w2.e.a(this.f1203h, magnifierElement.f1203h) && w2.e.a(this.f1204i, magnifierElement.f1204i) && this.f1205j == magnifierElement.f1205j && Intrinsics.a(this.f1199d, magnifierElement.f1199d) && Intrinsics.a(this.f1206k, magnifierElement.f1206k)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int hashCode = this.f1197b.hashCode() * 31;
        int i11 = 0;
        Function1 function1 = this.f1198c;
        if (function1 != null) {
            i10 = function1.hashCode();
        } else {
            i10 = 0;
        }
        int d10 = v.e.d(this.f1201f, v.e.a(this.f1200e, (hashCode + i10) * 31, 31), 31);
        int i12 = g.f38789d;
        int d11 = v.e.d(this.f1205j, v.e.a(this.f1204i, v.e.a(this.f1203h, v.e.c(this.f1202g, d10, 31), 31), 31), 31);
        Function1 function12 = this.f1199d;
        if (function12 != null) {
            i11 = function12.hashCode();
        }
        return this.f1206k.hashCode() + ((d11 + i11) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r15, r8) != false) goto L19;
     */
    @Override // c2.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(g1.n r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            x.q1 r1 = (x.q1) r1
            float r2 = r1.f39687q
            long r3 = r1.f39689s
            float r5 = r1.f39690t
            float r6 = r1.f39691u
            boolean r7 = r1.f39692v
            x.c2 r8 = r1.f39693w
            kotlin.jvm.functions.Function1 r9 = r0.f1197b
            r1.f39684n = r9
            kotlin.jvm.functions.Function1 r9 = r0.f1198c
            r1.f39685o = r9
            float r9 = r0.f1200e
            r1.f39687q = r9
            boolean r10 = r0.f1201f
            r1.f39688r = r10
            long r10 = r0.f1202g
            r1.f39689s = r10
            float r12 = r0.f1203h
            r1.f39690t = r12
            float r13 = r0.f1204i
            r1.f39691u = r13
            boolean r14 = r0.f1205j
            r1.f39692v = r14
            kotlin.jvm.functions.Function1 r15 = r0.f1199d
            r1.f39686p = r15
            x.c2 r15 = r0.f1206k
            r1.f39693w = r15
            x.b2 r0 = r1.f39696z
            if (r0 == 0) goto L63
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L43
            goto L49
        L43:
            boolean r0 = r15.a()
            if (r0 == 0) goto L63
        L49:
            int r0 = w2.g.f38789d
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L63
            boolean r0 = w2.e.a(r12, r5)
            if (r0 == 0) goto L63
            boolean r0 = w2.e.a(r13, r6)
            if (r0 == 0) goto L63
            if (r14 != r7) goto L63
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r15, r8)
            if (r0 != 0) goto L66
        L63:
            r1.Q0()
        L66:
            r1.R0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierElement.j(g1.n):void");
    }
}
