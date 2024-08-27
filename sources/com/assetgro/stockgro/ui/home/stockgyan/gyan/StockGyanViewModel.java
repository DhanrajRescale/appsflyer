package com.assetgro.stockgro.ui.home.stockgyan.gyan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.HashMap;
import jf.g;
import jf.i;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import qf.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/home/stockgyan/gyan/StockGyanViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGyanViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f9567n;

    /* renamed from: o, reason: collision with root package name */
    public final a f9568o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9569p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f9570q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9571r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockGyanViewModel(StockRepository stockRepository, UserRepository userRepository, a maintenanceConfigManager, pj.a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9567n = stockRepository;
        this.f9568o = maintenanceConfigManager;
        this.f9569p = new LiveData();
        this.f9570q = new HashMap();
        this.f9571r = new LiveData();
        this.f9572s = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String cardId, boolean z10) {
        Integer num;
        int i10;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9567n.putStockGyanIndexInteraction(cardId, Boolean.valueOf(z10)).c(((e) this.f9079b).J());
        d dVar = new d(new g(0, new i(this, 0)), new g(1, new i(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        boolean containsKey = this.f9570q.containsKey(cardId);
        e0 e0Var = this.f9571r;
        if (containsKey) {
            CardInteraction cardInteraction = (CardInteraction) this.f9570q.get(cardId);
            if (cardInteraction != null) {
                num = cardInteraction.getTotalLikes();
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                CardInteraction cardInteraction2 = (CardInteraction) this.f9570q.get(cardId);
                if (cardInteraction2 != null) {
                    if (z10) {
                        i10 = intValue + 1;
                    } else {
                        i10 = intValue - 1;
                    }
                    cardInteraction2.setTotalLikes(Integer.valueOf(i10));
                }
            }
            CardInteraction cardInteraction3 = (CardInteraction) this.f9570q.get(cardId);
            if (cardInteraction3 != null) {
                cardInteraction3.setLiked(z10);
            }
            CardInteraction cardInteraction4 = (CardInteraction) this.f9570q.get(cardId);
            if (cardInteraction4 != null) {
                cardInteraction4.setCardId(cardId);
            }
            e0Var.postValue(this.f9570q.get(cardId));
            return;
        }
        this.f9570q.put(cardId, new CardInteraction(1, cardId, z10));
        e0Var.postValue(new CardInteraction(1, cardId, z10));
    }
}
