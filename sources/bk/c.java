package bk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m9.p;

/* loaded from: classes.dex */
public final class c extends b4.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(6);
        this.f7037c = i10;
    }

    @Override // q9.e
    public m9.e a() {
        switch (this.f7037c) {
            case 0:
                return new m9.e((List) this.f3178b);
            case 1:
                return new m9.j(0, (List) this.f3178b);
            case 2:
                return new m9.e((List) this.f3178b);
            case 3:
                return new m9.j(1, (List) this.f3178b);
            case 4:
                return new m9.j(2, (List) this.f3178b);
            case 5:
                return new p((List) this.f3178b);
            default:
                return new m9.e((List) this.f3178b);
        }
    }

    public k h() {
        switch (this.f7037c) {
            case 0:
                return new b(this);
            case 1:
                return new g(this);
            default:
                return new m(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, List list) {
        super(list, 5);
        this.f7037c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ArrayList arrayList) {
        super(arrayList, 5);
        this.f7037c = 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x9.a aVar = (x9.a) arrayList.get(i10);
            r9.c cVar = (r9.c) aVar.f40115b;
            r9.c cVar2 = (r9.c) aVar.f40116c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f33466a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f33466a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new x9.a(cVar.a(copyOfRange), cVar2.a(copyOfRange));
                }
            }
            arrayList.set(i10, aVar);
        }
    }
}
