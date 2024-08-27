package d0;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f13183a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map b10 = ((o0) obj2).b();
        if (b10.isEmpty()) {
            return null;
        }
        return b10;
    }
}
