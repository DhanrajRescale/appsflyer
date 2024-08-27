package tg;

import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import hv.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f36025b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f36026c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f36027d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f36028e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f36029f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f36030g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f36031h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f36032i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f36033j = new c(8);

    /* renamed from: k, reason: collision with root package name */
    public static final c f36034k = new c(9);

    /* renamed from: l, reason: collision with root package name */
    public static final c f36035l = new c(10);

    /* renamed from: m, reason: collision with root package name */
    public static final c f36036m = new c(11);

    /* renamed from: n, reason: collision with root package name */
    public static final c f36037n = new c(12);

    /* renamed from: o, reason: collision with root package name */
    public static final c f36038o = new c(13);

    /* renamed from: p, reason: collision with root package name */
    public static final c f36039p = new c(14);

    /* renamed from: q, reason: collision with root package name */
    public static final c f36040q = new c(15);

    /* renamed from: r, reason: collision with root package name */
    public static final c f36041r = new c(16);

    /* renamed from: s, reason: collision with root package name */
    public static final c f36042s = new c(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f36043a = i10;
    }

    public final String a(Bought bought) {
        switch (this.f36043a) {
            case 0:
                ij.h hVar = ij.h.f20067a;
                return ij.h.k(2, bought.getAskPrice());
            case 1:
                ij.h hVar2 = ij.h.f20067a;
                return ij.h.k(2, bought.getBidPrice());
            case 2:
                return bought.getCancelReason();
            case 3:
                hv.e l10 = hv.e.l(0, bought.getEntryDate());
                t a10 = a3.a.a(l10, l10);
                jv.a b10 = jv.a.b("dd MMM | HH:mm");
                hv.g gVar = a10.f18769a;
                gVar.getClass();
                String a11 = b10.a(gVar);
                Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
                return a3.a.f("Ordered at: ", a11);
            case 4:
                hv.e l11 = hv.e.l(0, bought.getExecutionDate());
                t a12 = a3.a.a(l11, l11);
                jv.a b11 = jv.a.b("dd MMM | HH:mm");
                hv.g gVar2 = a12.f18769a;
                gVar2.getClass();
                String a13 = b11.a(gVar2);
                Intrinsics.checkNotNullExpressionValue(a13, "format(...)");
                return a3.a.f("Executed at: ", a13);
            case 5:
                return bought.getImageUrl();
            case 6:
                return ij.h.m(ij.h.f20067a, bought.getLastTradePrice());
            case 7:
                return bought.getName();
            case 8:
                return ij.h.m(ij.h.f20067a, bought.getOrderPrice());
            case 9:
            case 10:
            default:
                return bought.getTradeType();
            case 11:
                return ij.h.m(ij.h.f20067a, bought.getTotal());
            case 12:
                return bought.getOrderType();
            case 13:
                return String.valueOf(ku.c.b(bought.getQuantity()));
        }
    }

    public final Pair d(Bought bought) {
        switch (this.f36043a) {
            case 9:
                String transactionType = bought.getTransactionType();
                int hashCode = transactionType.hashCode();
                Integer valueOf = Integer.valueOf(R.color.white);
                Integer valueOf2 = Integer.valueOf(R.color.black);
                switch (hashCode) {
                    case 97926:
                        if (transactionType.equals("buy")) {
                            if (s.j(bought.getOrderStatus(), "pending", true)) {
                                return new Pair(qj.j.f32025i, valueOf2);
                            }
                            return new Pair(qj.j.f32027k, valueOf2);
                        }
                        break;
                    case 3526482:
                        if (transactionType.equals("sell")) {
                            if (s.j(bought.getOrderStatus(), "pending", true)) {
                                return new Pair(qj.j.f32018b, valueOf);
                            }
                            return new Pair(qj.j.f32027k, valueOf2);
                        }
                        break;
                    case 94852023:
                        if (transactionType.equals("cover")) {
                            if (s.j(bought.getOrderStatus(), "pending", true)) {
                                return new Pair(qj.j.f32025i, valueOf2);
                            }
                            return new Pair(qj.j.f32027k, valueOf2);
                        }
                        break;
                    case 109413500:
                        if (transactionType.equals("short")) {
                            if (s.j(bought.getOrderStatus(), "pending", true)) {
                                return new Pair(qj.j.f32018b, valueOf);
                            }
                            return new Pair(qj.j.f32027k, valueOf2);
                        }
                        break;
                }
                return new Pair(qj.j.f32027k, valueOf2);
            default:
                String transactionType2 = bought.getTransactionType();
                int hashCode2 = transactionType2.hashCode();
                Integer valueOf3 = Integer.valueOf(R.string.short_sell);
                switch (hashCode2) {
                    case 97926:
                        if (transactionType2.equals("buy")) {
                            return new Pair(Integer.valueOf(R.string.buy), qj.j.f32023g);
                        }
                        break;
                    case 3526482:
                        if (transactionType2.equals("sell")) {
                            return new Pair(Integer.valueOf(R.string.sell), qj.j.f32024h);
                        }
                        break;
                    case 94852023:
                        if (transactionType2.equals("cover")) {
                            return new Pair(Integer.valueOf(R.string.text_cover_order), qj.j.f32023g);
                        }
                        break;
                    case 109413500:
                        if (transactionType2.equals("short")) {
                            return new Pair(valueOf3, qj.j.f32023g);
                        }
                        break;
                }
                return new Pair(valueOf3, qj.j.f32024h);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36043a) {
            case 0:
                return a((Bought) obj);
            case 1:
                return a((Bought) obj);
            case 2:
                return a((Bought) obj);
            case 3:
                return a((Bought) obj);
            case 4:
                return a((Bought) obj);
            case 5:
                return a((Bought) obj);
            case 6:
                return a((Bought) obj);
            case 7:
                return a((Bought) obj);
            case 8:
                return a((Bought) obj);
            case 9:
                return d((Bought) obj);
            case 10:
                return Unit.f23355a;
            case 11:
                return a((Bought) obj);
            case 12:
                return a((Bought) obj);
            case 13:
                return a((Bought) obj);
            case 14:
                return ((Bought) obj).getChange();
            case 15:
                return a((Bought) obj);
            case 16:
                return d((Bought) obj);
            default:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (PortfolioOrdersDto) response.getData();
        }
    }
}
