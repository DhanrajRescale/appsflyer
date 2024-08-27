package g7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z2 implements a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final z2 f17160e = new z2(g1.f16784g);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17161a;

    /* renamed from: b, reason: collision with root package name */
    public int f17162b;

    /* renamed from: c, reason: collision with root package name */
    public int f17163c;

    /* renamed from: d, reason: collision with root package name */
    public int f17164d;

    public z2(int i10, int i11, List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f17161a = vt.g0.S(pages);
        Iterator it = pages.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            i12 += ((s4) it.next()).f17055b.size();
        }
        this.f17162b = i12;
        this.f17163c = i10;
        this.f17164d = i11;
    }

    public final u4 a(int i10) {
        ArrayList arrayList;
        int i11 = 0;
        int i12 = i10 - this.f17163c;
        while (true) {
            arrayList = this.f17161a;
            if (i12 < ((s4) arrayList.get(i11)).f17055b.size() || i11 >= vt.y.f(arrayList)) {
                break;
            }
            i12 -= ((s4) arrayList.get(i11)).f17055b.size();
            i11++;
        }
        return new u4(((s4) arrayList.get(i11)).f17056c, i12, i10 - this.f17163c, ((e() - i10) - this.f17164d) - 1, c(), d());
    }

    public final Object b(int i10) {
        ArrayList arrayList = this.f17161a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((s4) arrayList.get(i11)).f17055b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((s4) arrayList.get(i11)).f17055b.get(i10);
    }

    public final int c() {
        Integer valueOf;
        int[] iArr = ((s4) vt.g0.u(this.f17161a)).f17054a;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i10 = iArr[0];
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            valueOf = Integer.valueOf(i10);
        }
        Intrinsics.c(valueOf);
        return valueOf.intValue();
    }

    public final int d() {
        Integer valueOf;
        int[] iArr = ((s4) vt.g0.C(this.f17161a)).f17054a;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i10 = iArr[0];
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            valueOf = Integer.valueOf(i10);
        }
        Intrinsics.c(valueOf);
        return valueOf.intValue();
    }

    public final int e() {
        return this.f17163c + this.f17162b + this.f17164d;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    public final kp.j f(j1 pageEvent) {
        Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
        boolean z10 = pageEvent instanceof g1;
        ArrayList arrayList = this.f17161a;
        if (z10) {
            g1 g1Var = (g1) pageEvent;
            Iterator it = g1Var.f16786b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((s4) it.next()).f17055b.size();
            }
            int ordinal = g1Var.f16785a.ordinal();
            if (ordinal != 0) {
                List list = g1Var.f16786b;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        int i11 = this.f17164d;
                        int i12 = this.f17162b;
                        arrayList.addAll(arrayList.size(), list);
                        this.f17162b += i10;
                        this.f17164d = g1Var.f16788d;
                        int i13 = this.f17163c + i12;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            vt.d0.m(((s4) it2.next()).f17055b, arrayList2);
                        }
                        return new g3(i13, this.f17164d, i11, arrayList2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = this.f17163c;
                arrayList.addAll(0, list);
                this.f17162b += i10;
                this.f17163c = g1Var.f16787c;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    vt.d0.m(((s4) it3.next()).f17055b, arrayList3);
                }
                return new j3(this.f17163c, i14, arrayList3);
            }
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (pageEvent instanceof f1) {
            f1 f1Var = (f1) pageEvent;
            ?? cVar = new kotlin.ranges.c(f1Var.f16747b, f1Var.f16748c, 1);
            Iterator it4 = arrayList.iterator();
            int i15 = 0;
            while (it4.hasNext()) {
                s4 s4Var = (s4) it4.next();
                int[] iArr = s4Var.f17054a;
                int length = iArr.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        break;
                    }
                    if (cVar.h(iArr[i16])) {
                        i15 += s4Var.f17055b.size();
                        it4.remove();
                        break;
                    }
                    i16++;
                }
            }
            int i17 = this.f17162b - i15;
            this.f17162b = i17;
            b1 b1Var = b1.f16664b;
            b1 b1Var2 = f1Var.f16746a;
            int i18 = f1Var.f16749d;
            if (b1Var2 == b1Var) {
                int i19 = this.f17163c;
                this.f17163c = i18;
                return new i3(i15, i18, i19);
            }
            int i20 = this.f17164d;
            this.f17164d = i18;
            return new h3(this.f17163c + i17, i15, i18, i20);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final String toString() {
        int i10 = this.f17162b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b(i11));
        }
        String B = vt.g0.B(arrayList, null, null, null, null, 63);
        StringBuilder sb2 = new StringBuilder("[(");
        nn.d.w(sb2, this.f17163c, " placeholders), ", B, ", (");
        return nn.d.m(sb2, this.f17164d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z2(g1 insertEvent) {
        this(insertEvent.f16787c, insertEvent.f16788d, insertEvent.f16786b);
        Intrinsics.checkNotNullParameter(insertEvent, "insertEvent");
    }
}
