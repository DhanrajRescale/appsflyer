package pg;

import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.x4;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f31057b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f31058c = new m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f31059d = new m(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(1);
        this.f31060a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f31060a) {
            case 0:
                OptionValue item = (OptionValue) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getContractName();
            case 1:
                return null;
            default:
                x4 it = (x4) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it != x4.f27083c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
