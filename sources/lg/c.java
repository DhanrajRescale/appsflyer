package lg;

import com.assetgro.stockgro.data.model.portfolio.HistoryOrderDto;
import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import hv.t;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f24814b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f24815c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f24816d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f24817e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f24818f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f24819g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f24820h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f24821i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f24822j = new c(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f24823a = i10;
    }

    public final String a(HistoryOrderDto historyOrderDto) {
        switch (this.f24823a) {
            case 0:
                return ij.h.m(ij.h.f20067a, historyOrderDto.getAmount());
            case 1:
                hv.e l10 = hv.e.l(0, historyOrderDto.getExecutionDate());
                t a10 = a3.a.a(l10, l10);
                jv.a b10 = jv.a.b("dd MMM yyyy | HH:mm");
                hv.g gVar = a10.f18769a;
                gVar.getClass();
                String a11 = b10.a(gVar);
                Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
                return a11;
            case 2:
            default:
                return String.valueOf(ku.c.b(historyOrderDto.getQuantity()));
            case 3:
                return historyOrderDto.getImageUrl();
            case 4:
                return historyOrderDto.getName();
            case 5:
                return ij.h.m(ij.h.f20067a, historyOrderDto.getPrice());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24823a) {
            case 0:
                return a((HistoryOrderDto) obj);
            case 1:
                return a((HistoryOrderDto) obj);
            case 2:
                return Boolean.valueOf(Intrinsics.a(((HistoryOrderDto) obj).getTradeType(), "CANCELLED"));
            case 3:
                return a((HistoryOrderDto) obj);
            case 4:
                return a((HistoryOrderDto) obj);
            case 5:
                return a((HistoryOrderDto) obj);
            case 6:
                return a((HistoryOrderDto) obj);
            case 7:
                String transactionType = ((HistoryOrderDto) obj).getTransactionType();
                int hashCode = transactionType.hashCode();
                Integer valueOf = Integer.valueOf(R.string.short_sell);
                switch (hashCode) {
                    case 97926:
                        if (transactionType.equals("buy")) {
                            return new Pair(Integer.valueOf(R.string.buy), qj.j.f32023g);
                        }
                        break;
                    case 3526482:
                        if (transactionType.equals("sell")) {
                            return new Pair(Integer.valueOf(R.string.sell), qj.j.f32024h);
                        }
                        break;
                    case 94852023:
                        if (transactionType.equals("cover")) {
                            return new Pair(Integer.valueOf(R.string.text_cover_order), qj.j.f32023g);
                        }
                        break;
                    case 109413500:
                        if (transactionType.equals("short")) {
                            return new Pair(valueOf, qj.j.f32023g);
                        }
                        break;
                }
                return new Pair(valueOf, qj.j.f32024h);
            default:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (PortfolioHistoryDto) response.getData();
        }
    }
}
