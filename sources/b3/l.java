package b3;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import vt.g0;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public t9.c f3129b;

    /* renamed from: c, reason: collision with root package name */
    public int f3130c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3131d = new ArrayList();

    public static g1.o b(g1.o oVar, e eVar, Function1 function1) {
        return oVar.g(new k(eVar, function1));
    }

    public final e c() {
        ArrayList arrayList = this.f3131d;
        int i10 = this.f3130c;
        this.f3130c = i10 + 1;
        e eVar = (e) g0.x(i10, arrayList);
        if (eVar == null) {
            e eVar2 = new e(Integer.valueOf(this.f3130c));
            arrayList.add(eVar2);
            return eVar2;
        }
        return eVar;
    }
}
