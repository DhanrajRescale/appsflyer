package ej;

import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f15473b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f15474c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f15475a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f15475a) {
            case 0:
                return ((MySubscriptionResponse) obj).getPackages();
            default:
                MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) obj;
                if (mySubscriptionResponse.getLevel() != 0 && !mySubscriptionResponse.getAutopayEnabled()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
