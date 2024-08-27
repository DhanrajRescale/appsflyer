package com.assetgro.stockgro.ui.chat.detail.messages.thread;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/messages/thread/MessageThreadInfoListItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MessageThreadInfoListItemViewModel extends BaseItemViewModel<ChatMessage> {

    /* renamed from: g, reason: collision with root package name */
    public final UserRepository f9319g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageThreadInfoListItemViewModel(e schedulerProvider, a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9319g = userRepository;
        this.f9320h = i0.C(this.f9075c, ae.e.f382d);
    }
}
