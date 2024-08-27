package wf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i f39056b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f39057c = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f39058a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39058a;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        th2.printStackTrace();
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
                        th3.printStackTrace();
                        break;
                    default:
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
