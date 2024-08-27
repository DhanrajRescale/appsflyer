package sa;

import com.assetgro.stockgro.data.model.AssetInsightData;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f34411b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f34412c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f34413a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34413a) {
            case 0:
                return ((AssetInsightData) obj).getInsightList();
            default:
                return ((AssetInsightData) obj).getType();
        }
    }
}
