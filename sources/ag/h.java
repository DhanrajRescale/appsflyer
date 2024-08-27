package ag;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f417b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f418c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f419a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f419a;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        break;
                    default:
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        break;
                    default:
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
