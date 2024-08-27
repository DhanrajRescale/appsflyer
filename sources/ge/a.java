package ge;

import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17294b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f17295c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f17296d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f17297e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f17298f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f17299g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f17300h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f17301i = new a(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f17302a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17302a;
        switch (i10) {
            case 0:
                fv.f it = (fv.f) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f23355a;
            case 1:
                fv.f it2 = (fv.f) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f23355a;
            case 2:
                fv.f it3 = (fv.f) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                return Unit.f23355a;
            case 3:
                NonStockgroContact nonStockgroContact = (NonStockgroContact) obj;
                switch (i10) {
                    case 3:
                        return nonStockgroContact.getPhoneNumber();
                    default:
                        return nonStockgroContact.getUuid();
                }
            case 4:
                NonStockgroContact nonStockgroContact2 = (NonStockgroContact) obj;
                switch (i10) {
                    case 3:
                        return nonStockgroContact2.getPhoneNumber();
                    default:
                        return nonStockgroContact2.getUuid();
                }
            case 5:
                StockgroContact stockgroContact = (StockgroContact) obj;
                switch (i10) {
                    case 5:
                        return stockgroContact.getDisplayPicture();
                    case 6:
                        return stockgroContact.getName();
                    default:
                        return stockgroContact.getUuid();
                }
            case 6:
                StockgroContact stockgroContact2 = (StockgroContact) obj;
                switch (i10) {
                    case 5:
                        return stockgroContact2.getDisplayPicture();
                    case 6:
                        return stockgroContact2.getName();
                    default:
                        return stockgroContact2.getUuid();
                }
            default:
                StockgroContact stockgroContact3 = (StockgroContact) obj;
                switch (i10) {
                    case 5:
                        return stockgroContact3.getDisplayPicture();
                    case 6:
                        return stockgroContact3.getName();
                    default:
                        return stockgroContact3.getUuid();
                }
        }
    }
}
