package com.assetgro.stockgro.ui.chat.compose;

import android.os.Bundle;
import b1.c;
import b1.d;
import ba.mq;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m0.o0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/compose/ChatMediaViewerActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatViewModel;", "Lba/mq;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatMediaViewerActivity extends b {
    @Override // gd.b
    public final int F() {
        return R.layout.layout_compose_view;
    }

    @Override // gd.b
    public final void I() {
        ChatMessage chatMessage;
        Bundle extras = getIntent().getExtras();
        Media media = null;
        if (extras != null) {
            chatMessage = (ChatMessage) extras.getParcelable("CHAT_MESSAGE");
        } else {
            chatMessage = null;
        }
        if (!(chatMessage instanceof ChatMessage)) {
            chatMessage = null;
        }
        if (chatMessage != null) {
            media = chatMessage.getMedia();
        }
        mq mqVar = (mq) w();
        o0 o0Var = new o0(6, media, this, chatMessage);
        Object obj = d.f3079a;
        mqVar.f5495s.setContent(new c(o0Var, true, -1257547389));
        getWindow().addFlags(128);
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.f();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
