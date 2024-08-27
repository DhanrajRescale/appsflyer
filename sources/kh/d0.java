package kh;

import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;

/* loaded from: classes.dex */
public final class d0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public UserStatisticsViewModel f23122a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23124c;

    /* renamed from: d, reason: collision with root package name */
    public int f23125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(UserStatisticsViewModel userStatisticsViewModel, yt.a aVar) {
        super(aVar);
        this.f23124c = userStatisticsViewModel;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f23123b = obj;
        this.f23125d |= Integer.MIN_VALUE;
        return UserStatisticsViewModel.h(this.f23124c, 0, this);
    }
}
