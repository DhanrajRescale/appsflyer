package qu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f32308a = new iu.k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj;
        if (element instanceof b0) {
            return (b0) element;
        }
        return null;
    }
}
