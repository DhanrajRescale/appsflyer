package com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner;

import ad.b;
import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.WinnersDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/winner/LeagueDeclaredWinnerItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/WinnersDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueDeclaredWinnerItemViewModel extends BaseItemViewModel<WinnersDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9030g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9031h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9032i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9033j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeagueDeclaredWinnerItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9030g = i0.C(this.f9075c, b.f351c);
        this.f9031h = i0.C(this.f9075c, b.f350b);
        this.f9032i = i0.C(this.f9075c, b.f353e);
        this.f9033j = i0.C(this.f9075c, b.f352d);
    }
}
