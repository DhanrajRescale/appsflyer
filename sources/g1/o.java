package g1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16418a = 0;

    Object b(Object obj, Function2 function2);

    boolean c(Function1 function1);

    default o g(o oVar) {
        if (oVar == l.f16404b) {
            return this;
        }
        return new i(this, oVar);
    }
}
