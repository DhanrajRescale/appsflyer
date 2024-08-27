package com.assetgro.stockgro.ui.drawer.tutorials;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import df.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/tutorials/VideoTutorialViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class VideoTutorialViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9517n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9518o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public VideoTutorialViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ?? liveData = new LiveData();
        this.f9517n = liveData;
        this.f9518o = liveData;
        g.H(u0.f(this), null, null, new f(this, null), 3);
    }
}
