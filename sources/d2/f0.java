package d2;

import android.R;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class f0 {
    public static final void a(@NotNull e4.m mVar, @NotNull h2.o oVar) {
        if (t0.t.o(oVar)) {
            h2.u uVar = h2.i.f17846v;
            h2.j jVar = oVar.f17862d;
            h2.a aVar = (h2.a) hl.f.m0(jVar, uVar);
            if (aVar != null) {
                mVar.b(new e4.f(R.id.accessibilityActionPageUp, aVar.f17809a));
            }
            h2.u uVar2 = h2.i.f17848x;
            LinkedHashMap linkedHashMap = jVar.f17850a;
            Object obj = linkedHashMap.get(uVar2);
            Object obj2 = null;
            if (obj == null) {
                obj = null;
            }
            h2.a aVar2 = (h2.a) obj;
            if (aVar2 != null) {
                mVar.b(new e4.f(R.id.accessibilityActionPageDown, aVar2.f17809a));
            }
            Object obj3 = linkedHashMap.get(h2.i.f17847w);
            if (obj3 == null) {
                obj3 = null;
            }
            h2.a aVar3 = (h2.a) obj3;
            if (aVar3 != null) {
                mVar.b(new e4.f(R.id.accessibilityActionPageLeft, aVar3.f17809a));
            }
            Object obj4 = linkedHashMap.get(h2.i.f17849y);
            if (obj4 != null) {
                obj2 = obj4;
            }
            h2.a aVar4 = (h2.a) obj2;
            if (aVar4 != null) {
                mVar.b(new e4.f(R.id.accessibilityActionPageRight, aVar4.f17809a));
            }
        }
    }
}
