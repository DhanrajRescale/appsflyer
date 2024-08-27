package qu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f32287a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineContext) obj).l((CoroutineContext.Element) obj2);
    }
}
