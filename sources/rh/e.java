package rh;

import com.assetgro.stockgro.data.model.RedeemedOffers;
import hv.t;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f33741b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f33742c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f33743d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f33744e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f33745f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f33746g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f33747h = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f33748i = new e(7);

    /* renamed from: j, reason: collision with root package name */
    public static final e f33749j = new e(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f33750a = i10;
    }

    public final String a(RedeemedOffers redeemedOffers) {
        switch (this.f33750a) {
            case 0:
                return redeemedOffers.getCouponCode();
            case 1:
                hv.e l10 = hv.e.l(0, redeemedOffers.getExpiryDate());
                t a10 = a3.a.a(l10, l10);
                jv.a b10 = jv.a.b("dd MMM yyyy | HH:mm");
                hv.g gVar = a10.f18769a;
                gVar.getClass();
                String a11 = b10.a(gVar);
                Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
                return a11;
            case 2:
                return a3.a.f("Visit ", redeemedOffers.getVendor().getVendorName());
            case 3:
                return redeemedOffers.getVendor().getLogo();
            case 4:
                hv.e l11 = hv.e.l(0, redeemedOffers.getBuyingDate());
                t a12 = a3.a.a(l11, l11);
                jv.a b11 = jv.a.b("dd MMM yyyy | HH:mm");
                hv.g gVar2 = a12.f18769a;
                gVar2.getClass();
                String a13 = b11.a(gVar2);
                Intrinsics.checkNotNullExpressionValue(a13, "format(...)");
                return a13;
            case 5:
                return redeemedOffers.getVendor().getSiteURL();
            case 6:
                return redeemedOffers.getTitle();
            case 7:
                ij.h hVar = ij.h.f20067a;
                return ij.h.l(redeemedOffers.getTotal());
            default:
                return redeemedOffers.getVendor().getVendorName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f33750a) {
            case 0:
                return a((RedeemedOffers) obj);
            case 1:
                return a((RedeemedOffers) obj);
            case 2:
                return a((RedeemedOffers) obj);
            case 3:
                return a((RedeemedOffers) obj);
            case 4:
                return a((RedeemedOffers) obj);
            case 5:
                return a((RedeemedOffers) obj);
            case 6:
                return a((RedeemedOffers) obj);
            case 7:
                return a((RedeemedOffers) obj);
            default:
                return a((RedeemedOffers) obj);
        }
    }
}
