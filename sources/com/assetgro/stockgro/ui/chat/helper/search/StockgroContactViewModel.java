package com.assetgro.stockgro.ui.chat.helper.search;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/helper/search/StockgroContactViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/remote/response/StockgroContact;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockgroContactViewModel extends BaseItemViewModel<StockgroContact> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9364g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockgroContactViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9364g = i0.C(this.f9075c, ge.a.f17300h);
        this.f9365h = i0.C(this.f9075c, ge.a.f17299g);
        i0.C(this.f9075c, ge.a.f17301i);
    }
}
