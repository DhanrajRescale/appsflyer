package vu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import qu.j2;

/* loaded from: classes2.dex */
public final class d0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f38361a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j2 j2Var = (j2) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (j2Var == null) {
            if (element instanceof j2) {
                return (j2) element;
            }
            return null;
        }
        return j2Var;
    }
}
