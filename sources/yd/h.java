package yd;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.tw;
import ba.uw;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends y1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f41550w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final tw f41551u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f41552v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, tw binding) {
        super(binding.f27491e);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f41552v = rVar;
        this.f41551u = binding;
    }

    public final void u(ChatMessage message, int i10, boolean z10, boolean z11, rd.m mVar) {
        int i11;
        String str;
        int i12;
        Sticker sticker;
        Intrinsics.checkNotNullParameter(message, "message");
        uw uwVar = (uw) this.f41551u;
        uwVar.f6247z = message;
        synchronized (uwVar) {
            uwVar.C |= 8;
        }
        uwVar.a(14);
        uwVar.m();
        boolean z12 = this.f41552v.f41588g;
        int i13 = 4;
        if (z12 && !z10) {
            this.f41551u.f6244w.setVisibility(0);
            ImageView imageGroupChatProfile = this.f41551u.f6241t;
            Intrinsics.checkNotNullExpressionValue(imageGroupChatProfile, "imageGroupChatProfile");
            zq.f.X(imageGroupChatProfile, message.getSenderPicture(), R.drawable.ic_placeholder_user);
        } else {
            RelativeLayout relativeLayout = this.f41551u.f6244w;
            if (z12) {
                i11 = 4;
            } else {
                i11 = 8;
            }
            relativeLayout.setVisibility(i11);
        }
        this.f41551u.f6244w.setOnClickListener(new g(this.f41552v, mVar, message, i10, 5));
        View view = this.f41551u.f6246y.f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        Media media = message.getMedia();
        if (media != null && (sticker = media.getSticker()) != null) {
            str = sticker.getSticker_id();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            i12 = -30;
        } else {
            i12 = -6;
        }
        kj.f.q(view, 0, i12, 8, 3, R.id.layout_chat_message, R.id.layout_chat_message);
        this.f41551u.f6246y.f27491e.setElevation(10.0f);
        ue.h hVar = this.f41552v.f41592k;
        if (hVar != null) {
            ConstraintLayout layoutChatMessage = this.f41551u.f6242u;
            Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
            hVar.m(layoutChatMessage, z11, z10);
            r rVar = this.f41552v;
            View itemView = this.f22629a;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            r.s(rVar, itemView, message, i10, mVar, false, 48);
            r rVar2 = this.f41552v;
            View itemView2 = this.f22629a;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            rVar2.getClass();
            Intrinsics.checkNotNullParameter(itemView2, "itemView");
            Intrinsics.checkNotNullParameter(message, "message");
            View findViewById = itemView2.findViewById(R.id.layout_chat_message);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
            View findViewById2 = itemView2.findViewById(R.id.text_group_chat_time);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = itemView2.findViewById(R.id.iv_chevron);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById3;
            if (!z10) {
                i13 = 0;
            }
            imageView.setVisibility(i13);
            if (rVar2.f41592k != null) {
                ue.h.i(message, constraintLayout, R.drawable.background_chat_message_other_rounded, imageView);
                if (rVar2.f41592k != null) {
                    ue.h.l(message, textView, R.drawable.rounded_color_primary_rectangle_corner_radius_8dp);
                    View findViewById4 = itemView2.findViewById(R.id.layout_message_text);
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                    View findViewById5 = itemView2.findViewById(R.id.selection_layer);
                    Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                    if (rVar2.f41592k != null) {
                        ue.h.f(itemView2, message, z11);
                        if (rVar2.f41592k != null) {
                            ue.h.g(itemView2, message);
                            rVar2.t(itemView2, message, mVar, constraintLayout, z10, i10);
                            rVar2.y(findViewById5, i10);
                            r rVar3 = this.f41552v;
                            d dVar = d.f41529c;
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
