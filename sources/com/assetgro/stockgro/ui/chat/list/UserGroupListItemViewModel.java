package com.assetgro.stockgro.ui.chat.list;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import je.c;
import je.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/list/UserGroupListItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/ChatChannel;", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserGroupListItemViewModel extends BaseItemViewModel<ChatChannel> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9396g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9397h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGroupListItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9396g = i0.C(this.f9075c, new h(this, 1));
        this.f9397h = i0.C(this.f9075c, c.f21316c);
        this.f9398i = i0.C(this.f9075c, new h(this, 0));
    }
}
