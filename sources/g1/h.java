package g1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f16399a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        m mVar = (m) obj2;
        if (str.length() == 0) {
            return mVar.toString();
        }
        return str + ", " + mVar;
    }
}
