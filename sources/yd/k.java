package yd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.rw;
import ba.sw;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends y1 {

    /* renamed from: u, reason: collision with root package name */
    public final rw f41559u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f41560v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, rw binding) {
        super(binding.f27491e);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f41560v = rVar;
        this.f41559u = binding;
    }

    public final void u(ChatMessage message, int i10, boolean z10, boolean z11, rd.m mVar) {
        String str;
        int i11;
        int i12;
        Sticker sticker;
        Intrinsics.checkNotNullParameter(message, "message");
        sw swVar = (sw) this.f41559u;
        swVar.f6022z = message;
        synchronized (swVar) {
            swVar.C |= 8;
        }
        swVar.a(14);
        swVar.m();
        r rVar = this.f41560v;
        View itemView = this.f22629a;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        r.s(rVar, itemView, message, i10, mVar, false, 48);
        r rVar2 = this.f41560v;
        View itemView2 = this.f22629a;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        rVar2.getClass();
        Intrinsics.checkNotNullParameter(itemView2, "itemView");
        Intrinsics.checkNotNullParameter(message, "message");
        View findViewById = itemView2.findViewById(R.id.selection_layer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        if (rVar2.f41592k != null) {
            ue.h.f(itemView2, message, z11);
            if (rVar2.f41592k != null) {
                ue.h.g(itemView2, message);
                rVar2.y(findViewById, i10);
                View view = this.f41559u.f6021y.f27491e;
                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                Media media = message.getMedia();
                if (media != null && (sticker = media.getSticker()) != null) {
                    str = sticker.getSticker_id();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    i11 = -30;
                } else {
                    i11 = -6;
                }
                kj.f.q(view, 0, i11, 8, 3, R.id.layout_chat_message, R.id.layout_chat_message);
                this.f41559u.f6021y.f27491e.setElevation(10.0f);
                ImageView imageView = this.f41559u.f6016t;
                if (z10) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
                imageView.setVisibility(i12);
                if (this.f41560v.f41592k != null) {
                    ConstraintLayout layoutChatMessage = this.f41559u.f6017u;
                    Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
                    ImageView ivChevron = this.f41559u.f6016t;
                    Intrinsics.checkNotNullExpressionValue(ivChevron, "ivChevron");
                    ue.h.i(message, layoutChatMessage, R.drawable.background_chat_message_sender, ivChevron);
                    ue.h hVar = this.f41560v.f41592k;
                    if (hVar != null) {
                        ConstraintLayout layoutChatMessage2 = this.f41559u.f6017u;
                        Intrinsics.checkNotNullExpressionValue(layoutChatMessage2, "layoutChatMessage");
                        hVar.m(layoutChatMessage2, z11, z10);
                        if (this.f41560v.f41592k != null) {
                            TextView textGroupChatTime = this.f41559u.f6020x;
                            Intrinsics.checkNotNullExpressionValue(textGroupChatTime, "textGroupChatTime");
                            ue.h.l(message, textGroupChatTime, R.drawable.rounded_solid_light_purple_corner_radius_8dp);
                            r rVar3 = this.f41560v;
                            d dVar = d.f41531e;
                            View itemView3 = this.f22629a;
                            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                            rVar3.w(message, mVar, i10, dVar, itemView3);
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
        Intrinsics.k("chatMessageViewManager");
        throw null;
    }
}
