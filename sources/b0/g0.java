package b0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g0 {
    public static final c a(int i10, String str) {
        WeakHashMap weakHashMap = y1.f3042v;
        return new c(i10, str);
    }

    public static final v1 b(int i10, String str) {
        WeakHashMap weakHashMap = y1.f3042v;
        return new v1(new v0(0, 0, 0, 0), str);
    }

    public static y1 c(t0.n nVar) {
        y1 y1Var;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1366542614);
        View view = (View) rVar.m(AndroidCompositionLocals_androidKt.f1433g);
        WeakHashMap weakHashMap = y1.f3042v;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new y1(view);
                    weakHashMap.put(view, obj);
                }
                y1Var = (y1) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        rVar.b0(-959038935);
        boolean j10 = rVar.j(y1Var) | rVar.j(view);
        Object Q = rVar.Q();
        if (j10 || Q == t0.m.f35080a) {
            Q = new x.z(7, y1Var, view);
            rVar.k0(Q);
        }
        rVar.s(false);
        t0.t.c(y1Var, (Function1) Q, rVar);
        rVar.s(false);
        return y1Var;
    }
}
