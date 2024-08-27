package d1;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f13279b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f13280c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(0);
        this.f13281a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f13281a) {
            case 0:
                return new k(new LinkedHashMap());
            default:
                return null;
        }
    }
}
