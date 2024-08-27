package oa;

import com.assetgro.stockgro.data.model.StockDto;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f29873b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f29874c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f29875d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f29876e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f29877a = i10;
    }

    public final String a(StockDto stockDto) {
        switch (this.f29877a) {
            case 1:
                return stockDto.getImageUrl();
            case 2:
                return stockDto.getName();
            default:
                return h.m(h.f20067a, stockDto.getLtp());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29877a) {
            case 0:
                return ((StockDto) obj).getChange();
            case 1:
                return a((StockDto) obj);
            case 2:
                return a((StockDto) obj);
            default:
                return a((StockDto) obj);
        }
    }
}
