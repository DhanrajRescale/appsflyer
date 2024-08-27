package j0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q f20602b = new q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f20603c = new q(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(1);
        this.f20604a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f20604a) {
            case 0:
                return Unit.f23355a;
            default:
                int i10 = ((p2.n) obj).f30594a;
                return Unit.f23355a;
        }
    }
}
