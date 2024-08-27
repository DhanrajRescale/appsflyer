package ph;

import com.assetgro.stockgro.data.model.RedemptionOffer;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f31089b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f31090c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f31091d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f31092e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f31093f = new f(4);

    /* renamed from: g, reason: collision with root package name */
    public static final f f31094g = new f(5);

    /* renamed from: h, reason: collision with root package name */
    public static final f f31095h = new f(6);

    /* renamed from: i, reason: collision with root package name */
    public static final f f31096i = new f(7);

    /* renamed from: j, reason: collision with root package name */
    public static final f f31097j = new f(8);

    /* renamed from: k, reason: collision with root package name */
    public static final f f31098k = new f(9);

    /* renamed from: l, reason: collision with root package name */
    public static final f f31099l = new f(10);

    /* renamed from: m, reason: collision with root package name */
    public static final f f31100m = new f(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f31101a = i10;
    }

    public final Boolean a(RedemptionOffer redemptionOffer) {
        switch (this.f31101a) {
            case 0:
                return Boolean.valueOf(redemptionOffer.getCtaExists());
            case 5:
                return Boolean.valueOf(redemptionOffer.getInventory_exists());
            default:
                return Boolean.valueOf(redemptionOffer.getPricingExists());
        }
    }

    public final String d(RedemptionOffer redemptionOffer) {
        switch (this.f31101a) {
            case 1:
                return redemptionOffer.getCta().getLink();
            case 2:
                return redemptionOffer.getId();
            case 3:
                String str = redemptionOffer.getCreativeUrls().get(0);
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                return str;
            case 4:
            case 5:
            case 9:
            default:
                return redemptionOffer.getTitle();
            case 6:
                return redemptionOffer.getInventory().getTotal();
            case 7:
                return String.valueOf(redemptionOffer.getPricing().getBonus());
            case 8:
                return String.valueOf(redemptionOffer.getPricing().getCash());
            case 10:
                return redemptionOffer.getSubTitle();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31101a) {
            case 0:
                return a((RedemptionOffer) obj);
            case 1:
                return d((RedemptionOffer) obj);
            case 2:
                return d((RedemptionOffer) obj);
            case 3:
                return d((RedemptionOffer) obj);
            case 4:
                return Long.valueOf(((RedemptionOffer) obj).getInventory().getAvailable());
            case 5:
                return a((RedemptionOffer) obj);
            case 6:
                return d((RedemptionOffer) obj);
            case 7:
                return d((RedemptionOffer) obj);
            case 8:
                return d((RedemptionOffer) obj);
            case 9:
                return a((RedemptionOffer) obj);
            case 10:
                return d((RedemptionOffer) obj);
            default:
                return d((RedemptionOffer) obj);
        }
    }
}
