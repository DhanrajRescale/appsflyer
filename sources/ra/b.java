package ra;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33546b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f33547c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f33548a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33548a) {
            case 0:
                return Unit.f23355a;
            default:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
