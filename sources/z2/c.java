package z2;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f41914b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f41915c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f41916d = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f41917a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f41917a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
        }
    }
}
