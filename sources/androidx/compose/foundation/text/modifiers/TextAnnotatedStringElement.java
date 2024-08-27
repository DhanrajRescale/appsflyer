package androidx.compose.foundation.text.modifiers;

import c2.y0;
import g1.n;
import j2.e;
import j2.g0;
import java.util.List;
import k0.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import n1.x;
import o2.r;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lc2/y0;", "Lk0/h;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final e f1322b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1323c;

    /* renamed from: d, reason: collision with root package name */
    public final r f1324d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f1325e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1326f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1327g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1328h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1329i;

    /* renamed from: j, reason: collision with root package name */
    public final List f1330j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f1331k;

    /* renamed from: l, reason: collision with root package name */
    public final x f1332l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f1333m;

    public TextAnnotatedStringElement(e eVar, g0 g0Var, r rVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, x xVar, Function1 function13) {
        this.f1322b = eVar;
        this.f1323c = g0Var;
        this.f1324d = rVar;
        this.f1325e = function1;
        this.f1326f = i10;
        this.f1327g = z10;
        this.f1328h = i11;
        this.f1329i = i12;
        this.f1330j = list;
        this.f1331k = function12;
        this.f1332l = xVar;
        this.f1333m = function13;
    }

    @Override // c2.y0
    public final n d() {
        return new h(this.f1322b, this.f1323c, this.f1324d, this.f1325e, this.f1326f, this.f1327g, this.f1328h, this.f1329i, this.f1330j, this.f1331k, this.f1332l, this.f1333m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (Intrinsics.a(this.f1332l, textAnnotatedStringElement.f1332l) && Intrinsics.a(this.f1322b, textAnnotatedStringElement.f1322b) && Intrinsics.a(this.f1323c, textAnnotatedStringElement.f1323c) && Intrinsics.a(this.f1330j, textAnnotatedStringElement.f1330j) && Intrinsics.a(this.f1324d, textAnnotatedStringElement.f1324d) && Intrinsics.a(this.f1325e, textAnnotatedStringElement.f1325e) && Intrinsics.a(this.f1333m, textAnnotatedStringElement.f1333m) && j.N(this.f1326f, textAnnotatedStringElement.f1326f) && this.f1327g == textAnnotatedStringElement.f1327g && this.f1328h == textAnnotatedStringElement.f1328h && this.f1329i == textAnnotatedStringElement.f1329i && Intrinsics.a(this.f1331k, textAnnotatedStringElement.f1331k) && Intrinsics.a(null, null)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = (this.f1324d.hashCode() + jr.h.f(this.f1323c, this.f1322b.hashCode() * 31, 31)) * 31;
        int i14 = 0;
        Function1 function1 = this.f1325e;
        if (function1 != null) {
            i10 = function1.hashCode();
        } else {
            i10 = 0;
        }
        int d10 = (((v.e.d(this.f1327g, da.e.f(this.f1326f, (hashCode + i10) * 31, 31), 31) + this.f1328h) * 31) + this.f1329i) * 31;
        List list = this.f1330j;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (d10 + i11) * 31;
        Function1 function12 = this.f1331k;
        if (function12 != null) {
            i12 = function12.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 961;
        x xVar = this.f1332l;
        if (xVar != null) {
            i13 = xVar.hashCode();
        } else {
            i13 = 0;
        }
        int i17 = (i16 + i13) * 31;
        Function1 function13 = this.f1333m;
        if (function13 != null) {
            i14 = function13.hashCode();
        }
        return i17 + i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3.f20722a.b(r0.f20722a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // c2.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(g1.n r11) {
        /*
            r10 = this;
            k0.h r11 = (k0.h) r11
            n1.x r0 = r11.f21869x
            n1.x r1 = r10.f1332l
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r1, r0)
            r2 = 1
            r0 = r0 ^ r2
            r11.f21869x = r1
            r1 = 0
            if (r0 != 0) goto L27
            j2.g0 r0 = r11.f21860o
            j2.g0 r3 = r10.f1323c
            if (r3 == r0) goto L22
            j2.b0 r3 = r3.f20722a
            j2.b0 r0 = r0.f20722a
            boolean r0 = r3.b(r0)
            if (r0 == 0) goto L27
            goto L25
        L22:
            r3.getClass()
        L25:
            r8 = r1
            goto L28
        L27:
            r8 = r2
        L28:
            j2.e r0 = r11.f21859n
            j2.e r3 = r10.f1322b
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r3)
            if (r0 == 0) goto L34
            r9 = r1
            goto L3d
        L34:
            r11.f21859n = r3
            t0.n1 r0 = r11.C
            r1 = 0
            r0.setValue(r1)
            r9 = r2
        L3d:
            j2.g0 r1 = r10.f1323c
            java.util.List r2 = r10.f1330j
            int r3 = r10.f1329i
            int r4 = r10.f1328h
            boolean r5 = r10.f1327g
            o2.r r6 = r10.f1324d
            int r7 = r10.f1326f
            r0 = r11
            boolean r0 = r0.V0(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function1 r1 = r10.f1331k
            kotlin.jvm.functions.Function1 r2 = r10.f1333m
            kotlin.jvm.functions.Function1 r3 = r10.f1325e
            boolean r1 = r11.U0(r3, r1, r2)
            r11.Q0(r8, r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.j(g1.n):void");
    }
}
