package i0;

import android.graphics.Matrix;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, int i10, int i11, int i12) {
        super(1);
        this.f18794a = i12;
        this.f18797d = obj;
        this.f18795b = i10;
        this.f18796c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f18794a;
        int i12 = this.f18796c;
        int i13 = this.f18795b;
        Object obj2 = this.f18797d;
        switch (i11) {
            case 1:
                j2.p pVar = (j2.p) obj;
                n1.p0 p0Var = (n1.p0) obj2;
                j2.o oVar = pVar.f20745a;
                int a10 = pVar.a(i13);
                int a11 = pVar.a(i12);
                j2.a aVar = (j2.a) oVar;
                CharSequence charSequence = aVar.f20631e;
                if (a10 >= 0 && a10 <= a11 && a11 <= charSequence.length()) {
                    Path path = new Path();
                    k2.t tVar = aVar.f20630d;
                    tVar.f21964d.getSelectionPath(a10, a11, path);
                    int i14 = tVar.f21966f;
                    if (i14 != 0 && !path.isEmpty()) {
                        path.offset(s0.g.f34069a, i14);
                    }
                    long g10 = t0.t.g(s0.g.f34069a, pVar.f20750f);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate(m1.c.d(g10), m1.c.e(g10));
                    path.transform(matrix);
                    long j10 = m1.c.f27233b;
                    n1.h hVar = (n1.h) p0Var;
                    hVar.getClass();
                    hVar.f28138a.addPath(path, m1.c.d(j10), m1.c.e(j10));
                    return Unit.f23355a;
                }
                StringBuilder q10 = da.e.q("start(", a10, ") or end(", a11, ") is out of range [0..");
                q10.append(charSequence.length());
                q10.append("], or start > end!");
                throw new IllegalArgumentException(q10.toString().toString());
            default:
                String newValue = (String) obj;
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                Integer g11 = kotlin.text.r.g(newValue);
                if (g11 != null) {
                    i10 = g11.intValue();
                } else {
                    i10 = 1;
                }
                ((t0.g1) obj2).setValue(Integer.valueOf(Math.min(Math.max(i10, i13), i12)));
                return Unit.f23355a;
        }
    }
}
