package oh;

import com.assetgro.stockgro.data.model.RedemptionOffer;
import ij.h;
import iu.k;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30073b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f30074c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f30075d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f30076e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f30077f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f30078g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f30079h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f30080i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f30081j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f30082k = new a(9);

    /* renamed from: l, reason: collision with root package name */
    public static final a f30083l = new a(10);

    /* renamed from: m, reason: collision with root package name */
    public static final a f30084m = new a(11);

    /* renamed from: n, reason: collision with root package name */
    public static final a f30085n = new a(12);

    /* renamed from: o, reason: collision with root package name */
    public static final a f30086o = new a(13);

    /* renamed from: p, reason: collision with root package name */
    public static final a f30087p = new a(14);

    /* renamed from: q, reason: collision with root package name */
    public static final a f30088q = new a(15);

    /* renamed from: r, reason: collision with root package name */
    public static final a f30089r = new a(16);

    /* renamed from: s, reason: collision with root package name */
    public static final a f30090s = new a(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f30091a = i10;
    }

    public final Boolean a(RedemptionOffer redemptionOffer) {
        boolean z10 = false;
        switch (this.f30091a) {
            case 1:
                if (redemptionOffer.getPricing().getBonus() <= redemptionOffer.getWalletInfo().getBonus()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 11:
                if (redemptionOffer.getInventory_exists() && redemptionOffer.getBoughtQuantity() < redemptionOffer.getInventory().getPerUserLimit()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 12:
                if (redemptionOffer.getPricing().getCash() > redemptionOffer.getWalletInfo().getCash() && redemptionOffer.getPricing().getBonus() <= redemptionOffer.getWalletInfo().getBonus()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 13:
                if (redemptionOffer.getPricing().getCash() <= redemptionOffer.getWalletInfo().getCash() || redemptionOffer.getPricing().getBonus() > redemptionOffer.getWalletInfo().getBonus()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                if (redemptionOffer.getInventory_exists() && redemptionOffer.getBoughtQuantity() < redemptionOffer.getInventory().getPerUserLimit()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public final String d(RedemptionOffer redemptionOffer) {
        switch (this.f30091a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                Iterator<T> it = redemptionOffer.getDescription().iterator();
                while (it.hasNext()) {
                    sb2.append((String) it.next());
                    sb2.append("\n");
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                return sb3;
            case 7:
                h hVar = h.f20067a;
                return h.l(redemptionOffer.getPricing().getBonus());
            case 8:
                h hVar2 = h.f20067a;
                return h.l(redemptionOffer.getPricing().getCash());
            case 9:
                h hVar3 = h.f20067a;
                return h.l(redemptionOffer.getPricing().getTotal());
            case 15:
                return redemptionOffer.getTitle();
            case 16:
                h hVar4 = h.f20067a;
                return h.l(redemptionOffer.getWalletInfo().getBonus());
            default:
                h hVar5 = h.f20067a;
                return h.l(redemptionOffer.getWalletInfo().getCash());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f30091a) {
            case 0:
                return d((RedemptionOffer) obj);
            case 1:
                return a((RedemptionOffer) obj);
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                RedemptionOffer redemptionOffer = (RedemptionOffer) obj;
                if (redemptionOffer.getInventory_exists() && redemptionOffer.getBoughtQuantity() == redemptionOffer.getInventory().getPerUserLimit()) {
                    i10 = 1;
                } else {
                    i10 = (redemptionOffer.getInventory_exists() && !redemptionOffer.getAlreadyBought() && redemptionOffer.getInventory().getAvailable() == 0) ? 2 : 0;
                }
                return Integer.valueOf(i10);
            case 6:
                return ((RedemptionOffer) obj).getInstructions();
            case 7:
                return d((RedemptionOffer) obj);
            case 8:
                return d((RedemptionOffer) obj);
            case 9:
                return d((RedemptionOffer) obj);
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                return a((RedemptionOffer) obj);
            case 12:
                return a((RedemptionOffer) obj);
            case 13:
                return a((RedemptionOffer) obj);
            case 14:
                return a((RedemptionOffer) obj);
            case 15:
                return d((RedemptionOffer) obj);
            case 16:
                return d((RedemptionOffer) obj);
            default:
                return d((RedemptionOffer) obj);
        }
    }

    public final void invoke(Throwable th2) {
        switch (this.f30091a) {
            case 2:
                th2.printStackTrace();
                return;
            case 3:
                th2.printStackTrace();
                return;
            case 4:
                th2.printStackTrace();
                return;
            default:
                th2.printStackTrace();
                return;
        }
    }
}
