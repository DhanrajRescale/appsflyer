package com.assetgro.stockgro.ui.chat.host;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qf.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/host/GroupFeedAndChatHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupFeedAndChatHostViewModel extends BaseViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f9392o;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9393n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupFeedAndChatHostViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ?? liveData = new LiveData();
        this.f9393n = liveData;
        boolean b10 = maintenanceConfigManager.b(b.f31930e);
        if (f9392o != b10) {
            f9392o = b10;
            liveData.postValue(new j(Boolean.TRUE));
        }
    }
}
