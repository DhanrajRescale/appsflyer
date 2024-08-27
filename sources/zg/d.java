package zg;

import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.prod.R;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f42449b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f42450c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f42451d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f42452e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f42453f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f42454g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f42455h = new d(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f42456a = i10;
    }

    public final String a(ExpiryOption expiryOption) {
        switch (this.f42456a) {
            case 1:
                return expiryOption.getDate() + " Days";
            case 2:
                return expiryOption.getDuration();
            case 3:
            default:
                return expiryOption.getSavePercentage();
            case 4:
                return h.m(h.f20067a, expiryOption.getPrice());
            case 5:
                return h.m(h.f20067a, expiryOption.getPricePerDay());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f42456a) {
            case 0:
                if (((ExpiryOption) obj).isSelected()) {
                    i10 = R.color.selectedTitle;
                } else {
                    i10 = R.color.white;
                }
                return Integer.valueOf(i10);
            case 1:
                return a((ExpiryOption) obj);
            case 2:
                return a((ExpiryOption) obj);
            case 3:
                return Boolean.valueOf(((ExpiryOption) obj).getMostPopular());
            case 4:
                return a((ExpiryOption) obj);
            case 5:
                return a((ExpiryOption) obj);
            default:
                return a((ExpiryOption) obj);
        }
    }
}
