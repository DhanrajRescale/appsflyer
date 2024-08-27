package j2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f20699a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20700b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20701c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20702d;

    static {
        d1.r rVar = a0.f20634a;
    }

    public e(List list, List list2, List list3, String str) {
        List M;
        this.f20699a = str;
        this.f20700b = list;
        this.f20701c = list2;
        this.f20702d = list3;
        if (list2 == null || (M = vt.g0.M(list2, new c2.p(1))) == null) {
            return;
        }
        int size = M.size();
        int i10 = -1;
        int i11 = 0;
        while (i11 < size) {
            d dVar = (d) M.get(i11);
            if (dVar.f20686b >= i10) {
                int length = this.f20699a.length();
                int i12 = dVar.f20687c;
                if (i12 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + dVar.f20686b + ", " + i12 + ") is out of boundary").toString());
                }
                i11++;
                i10 = i12;
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i10) {
        ?? r12;
        List list = this.f20702d;
        if (list != null) {
            r12 = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                d dVar = (d) obj;
                if ((dVar.f20685a instanceof k) && f.c(0, i10, dVar.f20686b, dVar.f20687c)) {
                    r12.add(obj);
                }
            }
        } else {
            r12 = vt.i0.f38321a;
        }
        Intrinsics.d(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return r12;
    }

    public final boolean b(int i10) {
        List list = this.f20702d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            if ((dVar.f20685a instanceof k) && f.c(0, i10, dVar.f20686b, dVar.f20687c)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e subSequence(int i10, int i11) {
        if (i10 <= i11) {
            String str = this.f20699a;
            if (i10 == 0 && i11 == str.length()) {
                return this;
            }
            String substring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new e(f.a(i10, i11, this.f20700b), f.a(i10, i11, this.f20701c), f.a(i10, i11, this.f20702d), substring);
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f20699a.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.a(this.f20699a, eVar.f20699a) && Intrinsics.a(this.f20700b, eVar.f20700b) && Intrinsics.a(this.f20701c, eVar.f20701c) && Intrinsics.a(this.f20702d, eVar.f20702d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f20699a.hashCode() * 31;
        int i12 = 0;
        List list = this.f20700b;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List list2 = this.f20701c;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        List list3 = this.f20702d;
        if (list3 != null) {
            i12 = list3.hashCode();
        }
        return i14 + i12;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20699a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20699a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r3, java.util.ArrayList r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L6
            vt.i0 r4 = vt.i0.f38321a
        L6:
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto Le
            vt.i0 r5 = vt.i0.f38321a
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L16
            r4 = r0
        L16:
            r5.getClass()
            r2.<init>(r4, r0, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.e.<init>(java.lang.String, java.util.ArrayList, int):void");
    }
}
