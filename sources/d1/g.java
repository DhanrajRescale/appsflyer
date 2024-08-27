package d1;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f13264b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f13265c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f13266a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13266a) {
            case 0:
                return new k((Map) obj);
            default:
                return obj;
        }
    }
}
