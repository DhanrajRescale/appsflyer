package com.assetgro.stockgro.ui.arena.detail.post.leaderboard;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import zc.f;
import zc.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/LeagueLeaderBoardItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/LeaderBoardUserDto;", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueLeaderBoardItemViewModel extends BaseItemViewModel<LeaderBoardUserDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9012g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9013h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9014i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9015j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9016k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeagueLeaderBoardItemViewModel(e schedulerProvider, a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9012g = i0.C(this.f9075c, new l(userRepository, 1));
        this.f9013h = i0.C(this.f9075c, f.f42367c);
        this.f9014i = i0.C(this.f9075c, f.f42369e);
        this.f9015j = i0.C(this.f9075c, f.f42368d);
        this.f9016k = i0.C(this.f9075c, new l(userRepository, 0));
    }
}
