package yd;

import android.view.View;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.ThreadInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f41546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd.m f41547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f41548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41549e;

    public /* synthetic */ g(ChatMessage chatMessage, r rVar, rd.m mVar, int i10, int i11) {
        this.f41545a = i11;
        this.f41548d = chatMessage;
        this.f41546b = rVar;
        this.f41547c = mVar;
        this.f41549e = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ChatMessage latestMessage;
        ChatMessage latestMessage2;
        ChatMessage latestMessage3;
        int i10 = this.f41545a;
        int i11 = this.f41549e;
        rd.m mVar = this.f41547c;
        r this$0 = this.f41546b;
        ChatMessage message = this.f41548d;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.c(message);
                        return;
                    }
                    return;
                }
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.e(message);
                        return;
                    }
                    return;
                }
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.e(message);
                        return;
                    }
                    return;
                }
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.e(message);
                        return;
                    }
                    return;
                }
            case 4:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.e(message);
                        return;
                    }
                    return;
                }
            case 5:
                int i12 = h.f41550w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.c(message);
                        return;
                    }
                    return;
                }
            case 6:
                int i13 = j.f41555x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.c(message);
                        return;
                    }
                    return;
                }
            case 7:
                int i14 = j.f41555x;
                Intrinsics.checkNotNullParameter(message, "$message");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ThreadInfo threadInfo = message.getThreadInfo();
                if (threadInfo != null && (latestMessage = threadInfo.getLatestMessage()) != null) {
                    if (this$0.f41589h.size() > 0) {
                        this$0.v(i11, message, mVar);
                        return;
                    } else {
                        if (mVar != null) {
                            mVar.c(latestMessage);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                int i15 = j.f41555x;
                Intrinsics.checkNotNullParameter(message, "$message");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ThreadInfo threadInfo2 = message.getThreadInfo();
                if (threadInfo2 != null && (latestMessage2 = threadInfo2.getLatestMessage()) != null) {
                    if (this$0.f41589h.size() > 0) {
                        this$0.v(i11, message, mVar);
                        return;
                    } else {
                        if (mVar != null) {
                            mVar.c(latestMessage2);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 9:
                int i16 = m.f41563w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                if (this$0.f41589h.size() > 0) {
                    this$0.v(i11, message, mVar);
                    return;
                } else {
                    if (mVar != null) {
                        mVar.c(message);
                        return;
                    }
                    return;
                }
            default:
                int i17 = m.f41563w;
                Intrinsics.checkNotNullParameter(message, "$message");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ThreadInfo threadInfo3 = message.getThreadInfo();
                if (threadInfo3 != null && (latestMessage3 = threadInfo3.getLatestMessage()) != null) {
                    if (this$0.f41589h.size() > 0) {
                        this$0.v(i11, message, mVar);
                        return;
                    } else {
                        if (mVar != null) {
                            mVar.c(latestMessage3);
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ g(r rVar, ChatMessage chatMessage, int i10, rd.m mVar, int i11) {
        this.f41545a = i11;
        this.f41546b = rVar;
        this.f41548d = chatMessage;
        this.f41549e = i10;
        this.f41547c = mVar;
    }

    public /* synthetic */ g(r rVar, rd.m mVar, ChatMessage chatMessage, int i10, int i11) {
        this.f41545a = i11;
        this.f41546b = rVar;
        this.f41547c = mVar;
        this.f41548d = chatMessage;
        this.f41549e = i10;
    }
}
