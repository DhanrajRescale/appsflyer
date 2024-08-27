package vu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import qu.j2;

/* loaded from: classes2.dex */
public final class c0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f38359a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof j2) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 1;
            }
            if (i10 == 0) {
                return element;
            }
            return Integer.valueOf(i10 + 1);
        }
        return obj;
    }
}
