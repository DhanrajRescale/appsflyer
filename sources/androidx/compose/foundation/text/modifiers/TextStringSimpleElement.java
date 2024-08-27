package androidx.compose.foundation.text.modifiers;

import c2.y0;
import g1.n;
import j2.g0;
import jr.h;
import k0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import n1.x;
import o2.r;
import v.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lc2/y0;", "Lk0/k;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f1334b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1335c;

    /* renamed from: d, reason: collision with root package name */
    public final r f1336d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1337e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1338f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1339g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1340h;

    /* renamed from: i, reason: collision with root package name */
    public final x f1341i;

    public TextStringSimpleElement(String str, g0 g0Var, r rVar, int i10, boolean z10, int i11, int i12, x xVar) {
        this.f1334b = str;
        this.f1335c = g0Var;
        this.f1336d = rVar;
        this.f1337e = i10;
        this.f1338f = z10;
        this.f1339g = i11;
        this.f1340h = i12;
        this.f1341i = xVar;
    }

    @Override // c2.y0
    public final n d() {
        return new k(this.f1334b, this.f1335c, this.f1336d, this.f1337e, this.f1338f, this.f1339g, this.f1340h, this.f1341i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (Intrinsics.a(this.f1341i, textStringSimpleElement.f1341i) && Intrinsics.a(this.f1334b, textStringSimpleElement.f1334b) && Intrinsics.a(this.f1335c, textStringSimpleElement.f1335c) && Intrinsics.a(this.f1336d, textStringSimpleElement.f1336d) && j.N(this.f1337e, textStringSimpleElement.f1337e) && this.f1338f == textStringSimpleElement.f1338f && this.f1339g == textStringSimpleElement.f1339g && this.f1340h == textStringSimpleElement.f1340h) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int d10 = (((e.d(this.f1338f, da.e.f(this.f1337e, (this.f1336d.hashCode() + h.f(this.f1335c, this.f1334b.hashCode() * 31, 31)) * 31, 31), 31) + this.f1339g) * 31) + this.f1340h) * 31;
        x xVar = this.f1341i;
        if (xVar != null) {
            i10 = xVar.hashCode();
        } else {
            i10 = 0;
        }
        return d10 + i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3.f20722a.b(r0.f20722a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    @Override // c2.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(g1.n r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.j(g1.n):void");
    }
}
