package w;

import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class b2 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38445a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38446b;

    public b2(float f10, float f11, t tVar) {
        IntRange k10 = kotlin.ranges.d.k(0, tVar.b());
        ArrayList arrayList = new ArrayList(vt.z.k(k10));
        nu.f it = k10.iterator();
        while (it.f29173c) {
            arrayList.add(new i0(f10, f11, tVar.a(it.b())));
        }
        this.f38446b = arrayList;
    }

    public final g0 a(int i10) {
        Object obj = this.f38446b;
        int i11 = this.f38445a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return (i0) ((List) obj).get(i10);
                    default:
                        return (i0) obj;
                }
            case 1:
                switch (i11) {
                    case 0:
                        return (i0) ((List) obj).get(i10);
                    default:
                        return (i0) obj;
                }
            default:
                return (g0) obj;
        }
    }

    public b2(float f10, float f11) {
        this.f38446b = new i0(f10, f11, 0.01f);
    }

    public b2(g0 g0Var) {
        this.f38446b = g0Var;
    }
}
