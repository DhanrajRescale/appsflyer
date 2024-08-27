package m9;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27655i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f27656j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10, List list) {
        super(list);
        this.f27655i = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                r9.c cVar = (r9.c) ((x9.a) list.get(0)).f40115b;
                int length = cVar != null ? cVar.f33467b.length : 0;
                this.f27656j = new r9.c(new float[length], new int[length]);
                return;
            }
            super(list);
            this.f27656j = new x9.d();
            return;
        }
        super(list);
        this.f27656j = new PointF();
    }

    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        Object obj;
        x9.d dVar;
        Object obj2 = aVar.f40115b;
        int i10 = this.f27655i;
        Object obj3 = this.f27656j;
        switch (i10) {
            case 0:
                r9.c cVar = (r9.c) obj3;
                r9.c cVar2 = (r9.c) obj2;
                r9.c cVar3 = (r9.c) aVar.f40116c;
                cVar.getClass();
                int[] iArr = cVar2.f33467b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f33467b;
                if (length == iArr2.length) {
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        cVar.f33466a[i11] = w9.e.d(cVar2.f33466a[i11], cVar3.f33466a[i11], f10);
                        cVar.f33467b[i11] = bl.j.y(iArr[i11], f10, iArr2[i11]);
                    }
                    return cVar;
                }
                StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb2.append(iArr.length);
                sb2.append(" vs ");
                throw new IllegalArgumentException(nn.d.m(sb2, iArr2.length, ")"));
            case 1:
                return l(aVar, f10, f10, f10);
            default:
                if (obj2 != null && (obj = aVar.f40116c) != null) {
                    x9.d dVar2 = (x9.d) obj2;
                    x9.d dVar3 = (x9.d) obj;
                    x9.c cVar4 = this.f27643e;
                    if (cVar4 == null || (dVar = (x9.d) cVar4.n(aVar.f40120g, aVar.f40121h.floatValue(), dVar2, dVar3, f10, e(), this.f27642d)) == null) {
                        x9.d dVar4 = (x9.d) obj3;
                        float d10 = w9.e.d(dVar2.f40141a, dVar3.f40141a, f10);
                        float d11 = w9.e.d(dVar2.f40142b, dVar3.f40142b, f10);
                        dVar4.f40141a = d10;
                        dVar4.f40142b = d11;
                        return dVar4;
                    }
                    return dVar;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // m9.e
    public final /* bridge */ /* synthetic */ Object h(x9.a aVar, float f10, float f11, float f12) {
        switch (this.f27655i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                super.h(aVar, f10, f11, f12);
                throw null;
        }
    }

    public final PointF l(x9.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f40115b;
        if (obj2 != null && (obj = aVar.f40116c) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            x9.c cVar = this.f27643e;
            if (cVar != null && (pointF = (PointF) cVar.n(aVar.f40120g, aVar.f40121h.floatValue(), pointF2, pointF3, f10, e(), this.f27642d)) != null) {
                return pointF;
            }
            PointF pointF4 = (PointF) this.f27656j;
            float f13 = pointF2.x;
            float b10 = nn.d.b(pointF3.x, f13, f11, f13);
            float f14 = pointF2.y;
            pointF4.set(b10, nn.d.b(pointF3.y, f14, f12, f14));
            return pointF4;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
