package jf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.model.StockGyanCard;
import com.assetgro.stockgro.data.model.StockGyanDto;
import com.assetgro.stockgro.data.model.StockGyanIndex;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanViewModel f21354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StockGyanViewModel stockGyanViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f21354b = stockGyanViewModel;
        this.f21355c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f21354b, this.f21355c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        StockGyanDto stockGyanDto;
        List<StockGyanCard> list;
        StockGyanIndex stockGyanIndex;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21353a;
        StockGyanViewModel stockGyanViewModel = this.f21354b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                StockRepository stockRepository = stockGyanViewModel.f9567n;
                String str = this.f21355c;
                this.f21353a = 1;
                obj = stockRepository.getStockGyanCardData(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = stockGyanViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            if (v0Var.f29302a.isSuccessful()) {
                stockGyanViewModel.f9084g.postValue(bool);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (stockGyanDto = (StockGyanDto) baseResponseDto.getData()) != null) {
                    HashMap<String, CardInteraction> cardInteraction = stockGyanDto.getCardInteraction();
                    if (cardInteraction != null) {
                        stockGyanViewModel.getClass();
                        Intrinsics.checkNotNullParameter(cardInteraction, "<set-?>");
                        stockGyanViewModel.f9570q = cardInteraction;
                    }
                    e0 e0Var2 = stockGyanViewModel.f9569p;
                    List<StockGyanIndex> indices = stockGyanDto.getIndices();
                    if (indices != null && (stockGyanIndex = indices.get(0)) != null) {
                        list = stockGyanIndex.getStockGyanCards();
                    } else {
                        list = null;
                    }
                    e0Var2.postValue(list);
                }
            } else {
                stockGyanViewModel.f9084g.postValue(bool);
            }
        } catch (Exception unused) {
            stockGyanViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
