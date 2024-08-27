package yd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.dx;
import ba.ex;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.ThreadInfo;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends y1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f41563w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final dx f41564u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f41565v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, dx binding) {
        super(binding.f27491e);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f41565v = rVar;
        this.f41564u = binding;
    }

    public final void u(ChatMessage message, int i10, boolean z10, boolean z11, rd.m mVar) {
        ChatMessage chatMessage;
        ChatMessage latestMessage;
        int i11;
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        ex exVar = (ex) this.f41564u;
        exVar.C = message;
        synchronized (exVar) {
            exVar.G |= 64;
        }
        exVar.a(16);
        exVar.m();
        dx dxVar = this.f41564u;
        ThreadInfo threadInfo = message.getThreadInfo();
        if (threadInfo != null) {
            chatMessage = threadInfo.getLatestMessage();
        } else {
            chatMessage = null;
        }
        ex exVar2 = (ex) dxVar;
        exVar2.D = chatMessage;
        synchronized (exVar2) {
            exVar2.G |= 16;
        }
        int i12 = 4;
        exVar2.a(4);
        exVar2.m();
        this.f41564u.getClass();
        ImageView imageView = this.f41564u.f4538u;
        if (!z10) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        ue.h hVar = this.f41565v.f41592k;
        if (hVar != null) {
            TextView groupChatChildMessageSenderName = this.f41564u.f4536s;
            Intrinsics.checkNotNullExpressionValue(groupChatChildMessageSenderName, "groupChatChildMessageSenderName");
            hVar.j(groupChatChildMessageSenderName);
            this.f41564u.f4537t.f27491e.setElevation(10.0f);
            r rVar = this.f41565v;
            View itemView = this.f22629a;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            rVar.getClass();
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(message, "message");
            View findViewById = itemView.findViewById(R.id.layout_thread_info);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            LinearLayout linearLayout = (LinearLayout) findViewById;
            View findViewById2 = itemView.findViewById(R.id.label_show_thread);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.label_no_of_replies);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            TextView textView2 = (TextView) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.selection_layer);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            if (rVar.f41592k != null) {
                ue.h.f(itemView, message, z11);
                if (rVar.f41592k != null) {
                    ue.h.g(itemView, message);
                    ThreadInfo threadInfo2 = message.getThreadInfo();
                    if (threadInfo2 != null) {
                        int noOfReplies = threadInfo2.getNoOfReplies();
                        if (noOfReplies > 0) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        textView2.setVisibility(i11);
                        if (noOfReplies > 1) {
                            str = noOfReplies + " Replies";
                        } else {
                            str = "1 Reply";
                        }
                        textView2.setText(str);
                    }
                    rVar.y(findViewById4, i10);
                    linearLayout.setOnClickListener(new g(rVar, message, i10, mVar, 3));
                    textView.setOnClickListener(new g(rVar, message, i10, mVar, 4));
                    ThreadInfo threadInfo3 = message.getThreadInfo();
                    if (threadInfo3 != null && (latestMessage = threadInfo3.getLatestMessage()) != null) {
                        r rVar2 = this.f41565v;
                        View findViewById5 = this.f22629a.findViewById(R.id.layout_thread_child);
                        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                        r.s(rVar2, findViewById5, latestMessage, i10, mVar, true, 16);
                        Long serverTime = latestMessage.getServerTime();
                        if (serverTime != null) {
                            this.f41564u.f4540w.f4326s.setText(pp.b.y(serverTime.longValue()));
                        }
                    }
                    ue.h hVar2 = this.f41565v.f41592k;
                    if (hVar2 != null) {
                        ConstraintLayout layoutChatMessage = this.f41564u.f4539v;
                        Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
                        hVar2.m(layoutChatMessage, z11, z10);
                        this.f41564u.f4542y.f6491v.setOnClickListener(new g(this.f41565v, mVar, message, i10, 9));
                        this.f41564u.f4536s.setOnClickListener(new g(message, this.f41565v, mVar, i10, 10));
                        r rVar3 = this.f41565v;
                        d dVar = d.f41532f;
                        View itemView2 = this.f22629a;
                        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                        rVar3.w(message, mVar, i10, dVar, itemView2);
                        return;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
            }
            Intrinsics.k("chatMessageViewManager");
            throw null;
        }
        Intrinsics.k("chatMessageViewManager");
        throw null;
    }
}
