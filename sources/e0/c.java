package e0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, List list) {
        super(0);
        this.f14647a = i10;
        this.f14648b = list;
    }

    public final Integer a() {
        int i10 = this.f14647a;
        List list = this.f14648b;
        switch (i10) {
            case 0:
                Object obj = list.get(2);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            case 1:
                return Integer.valueOf(list.size());
            default:
                return Integer.valueOf(list.size());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f14647a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                return a();
        }
    }
}
