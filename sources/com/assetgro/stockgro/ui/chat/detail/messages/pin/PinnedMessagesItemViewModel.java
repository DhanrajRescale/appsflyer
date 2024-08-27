package com.assetgro.stockgro.ui.chat.detail.messages.pin;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import zd.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/messages/pin/PinnedMessagesItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinnedMessagesItemViewModel extends BaseItemViewModel<ChatMessage> {

    /* renamed from: g, reason: collision with root package name */
    public final UserRepository f9314g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedMessagesItemViewModel(e schedulerProvider, a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9314g = userRepository;
        this.f9315h = i0.C(this.f9075c, l.f42430c);
    }
}
