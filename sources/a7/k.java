package a7;

import e5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t0.s;

/* loaded from: classes.dex */
public final class k implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f250a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f251b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f252c;

    public k(ArrayList arrayList) {
        this.f250a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f251b = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f251b;
            jArr[i11] = cVar.f222b;
            jArr[i11 + 1] = cVar.f223c;
        }
        long[] jArr2 = this.f251b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f252c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // s6.b
    public final int a(long j10) {
        long[] jArr = this.f252c;
        int b10 = x.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // s6.b
    public final long b(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        long[] jArr = this.f252c;
        if (i10 < jArr.length) {
            z11 = true;
        }
        yk.j.E0(z11);
        return jArr[i10];
    }

    @Override // s6.b
    public final List c(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f250a;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f251b;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                c cVar = (c) list.get(i10);
                d5.b bVar = cVar.f221a;
                if (bVar.f13907e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new s(23));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d5.a a10 = ((c) arrayList2.get(i12)).f221a.a();
            a10.f13881e = (-1) - i12;
            a10.f13882f = 1;
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    @Override // s6.b
    public final int d() {
        return this.f252c.length;
    }
}
