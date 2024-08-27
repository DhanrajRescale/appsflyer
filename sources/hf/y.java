package hf;

import c0.d0;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vt.i0;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeSocialTradeViewDto f18441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f18442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(HomeSocialTradeViewDto homeSocialTradeViewDto, Function2 function2) {
        super(1);
        this.f18441a = homeSocialTradeViewDto;
        this.f18442b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r22;
        d0 LazyRow = (d0) obj;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        d0.a(LazyRow, d.f18363c);
        HomeSocialTradeViewDto homeSocialTradeViewDto = this.f18441a;
        List<HomeSocialTradeViewDto.TradeViewElement> elements = homeSocialTradeViewDto.getElements();
        if (elements != null) {
            r22 = new ArrayList();
            for (Object obj2 : elements) {
                if (((HomeSocialTradeViewDto.TradeViewElement) obj2).getTradeContent() != null) {
                    r22.add(obj2);
                }
            }
        } else {
            r22 = i0.f38321a;
        }
        int size = r22.size();
        v.c cVar = new v.c(12, r22);
        Function2 function2 = this.f18442b;
        u uVar = new u(2, r22, function2);
        Object obj3 = b1.d.f3079a;
        c0.j jVar = (c0.j) LazyRow;
        jVar.a0(size, null, cVar, new b1.c(uVar, true, -1091073711));
        d0.a(jVar, new b1.c(new v.o(13, homeSocialTradeViewDto, function2), true, -1539960526));
        return Unit.f23355a;
    }
}
