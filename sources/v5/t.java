package v5;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: h, reason: collision with root package name */
    public static final t0.s f37767h = new t0.s(18);

    /* renamed from: i, reason: collision with root package name */
    public static final t0.s f37768i = new t0.s(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f37769a;

    /* renamed from: e, reason: collision with root package name */
    public int f37773e;

    /* renamed from: f, reason: collision with root package name */
    public int f37774f;

    /* renamed from: g, reason: collision with root package name */
    public int f37775g;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f37771c = new s[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37770b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f37772d = -1;

    public t(int i10) {
        this.f37769a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, float f10) {
        s sVar;
        int i11 = this.f37772d;
        ArrayList arrayList = this.f37770b;
        if (i11 != 1) {
            Collections.sort(arrayList, f37767h);
            this.f37772d = 1;
        }
        int i12 = this.f37775g;
        s[] sVarArr = this.f37771c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f37775g = i13;
            sVar = sVarArr[i13];
        } else {
            sVar = new Object();
        }
        int i14 = this.f37773e;
        this.f37773e = i14 + 1;
        sVar.f37764a = i14;
        sVar.f37765b = i10;
        sVar.f37766c = f10;
        arrayList.add(sVar);
        this.f37774f += i10;
        while (true) {
            int i15 = this.f37774f;
            int i16 = this.f37769a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                s sVar2 = (s) arrayList.get(0);
                int i18 = sVar2.f37765b;
                if (i18 <= i17) {
                    this.f37774f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f37775g;
                    if (i19 < 5) {
                        this.f37775g = i19 + 1;
                        sVarArr[i19] = sVar2;
                    }
                } else {
                    sVar2.f37765b = i18 - i17;
                    this.f37774f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f37772d;
        ArrayList arrayList = this.f37770b;
        if (i10 != 0) {
            Collections.sort(arrayList, f37768i);
            this.f37772d = 0;
        }
        float f10 = 0.5f * this.f37774f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s sVar = (s) arrayList.get(i12);
            i11 += sVar.f37765b;
            if (i11 >= f10) {
                return sVar.f37766c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) jr.h.l(arrayList, 1)).f37766c;
    }
}
