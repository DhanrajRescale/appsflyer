package bf;

import com.assetgro.stockgro.data.model.StockGyanGroup;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f6965b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f6966c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f6967a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f6967a;
        switch (i10) {
            case 0:
                StockGyanGroup stockGyanGroup = (StockGyanGroup) obj;
                switch (i10) {
                    case 0:
                        return stockGyanGroup.getDisplayPicture().getUrl();
                    default:
                        return stockGyanGroup.getName();
                }
            default:
                StockGyanGroup stockGyanGroup2 = (StockGyanGroup) obj;
                switch (i10) {
                    case 0:
                        return stockGyanGroup2.getDisplayPicture().getUrl();
                    default:
                        return stockGyanGroup2.getName();
                }
        }
    }
}
